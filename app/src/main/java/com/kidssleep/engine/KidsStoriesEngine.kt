package com.kidssleep.engine

import com.kidssleep.domain.model.GameStatus
import com.kidssleep.domain.model.KidsSleepGame
import com.kidssleep.domain.model.KidsSleepLevel
import com.kidssleep.domain.model.Story

object KidsSleepEngine {

    fun createInitialGame(level: KidsSleepLevel): KidsSleepGame =
        KidsSleepGame(level = level)

    fun validateLevel(level: KidsSleepLevel): Boolean =
        level.stories.isNotEmpty() && level.stories.all { it.lines.isNotEmpty() }

    fun currentStory(game: KidsSleepGame): Story? =
        game.level.stories.getOrNull(game.currentStoryIndex)

    fun currentLine(game: KidsSleepGame): String? =
        currentStory(game)?.lines?.getOrNull(game.currentLineIndex)

    fun canNextLine(game: KidsSleepGame): Boolean =
        !game.isCompleted && game.status == GameStatus.IN_PROGRESS

    fun canPrevLine(game: KidsSleepGame): Boolean =
        !game.isCompleted && (game.currentLineIndex > 0 || game.currentStoryIndex > 0)

    fun nextLine(game: KidsSleepGame): KidsSleepGame {
        if (!canNextLine(game)) return game
        val story = currentStory(game) ?: return game
        val now = System.currentTimeMillis()

        if (game.currentLineIndex < story.lines.lastIndex) {
            return game.copy(
                currentLineIndex = game.currentLineIndex + 1,
                moves = game.moves + 1,
                lastPlayedAt = now
            )
        }

        val completed = game.completedStoryIndices + game.currentStoryIndex
        val nextStoryIndex = game.currentStoryIndex + 1
        val hasMoreStories = nextStoryIndex < game.level.stories.size

        return if (hasMoreStories) {
            game.copy(
                completedStoryIndices = completed,
                currentStoryIndex = nextStoryIndex,
                currentLineIndex = 0,
                moves = game.moves + 1,
                lastPlayedAt = now
            )
        } else {
            game.copy(
                completedStoryIndices = completed,
                moves = game.moves + 1,
                status = GameStatus.COMPLETED,
                completedAt = now,
                lastPlayedAt = now
            )
        }
    }

    fun prevLine(game: KidsSleepGame): KidsSleepGame {
        if (!canPrevLine(game)) return game
        val now = System.currentTimeMillis()

        if (game.currentLineIndex > 0) {
            return game.copy(
                currentLineIndex = game.currentLineIndex - 1,
                lastPlayedAt = now
            )
        }

        val prevStoryIndex = game.currentStoryIndex - 1
        val prevStory = game.level.stories.getOrNull(prevStoryIndex) ?: return game
        return game.copy(
            currentStoryIndex = prevStoryIndex,
            currentLineIndex = prevStory.lines.lastIndex,
            completedStoryIndices = game.completedStoryIndices - prevStoryIndex,
            lastPlayedAt = now
        )
    }

    fun nextStory(game: KidsSleepGame): KidsSleepGame {
        if (game.isCompleted) return game
        val nextIndex = game.currentStoryIndex + 1
        if (nextIndex >= game.level.stories.size) return game
        return game.copy(
            currentStoryIndex = nextIndex,
            currentLineIndex = 0,
            lastPlayedAt = System.currentTimeMillis()
        )
    }

    fun prevStory(game: KidsSleepGame): KidsSleepGame {
        if (game.isCompleted) return game
        val prevIndex = game.currentStoryIndex - 1
        if (prevIndex < 0) return game
        return game.copy(
            currentStoryIndex = prevIndex,
            currentLineIndex = 0,
            lastPlayedAt = System.currentTimeMillis()
        )
    }

    fun markStoryComplete(game: KidsSleepGame): KidsSleepGame {
        if (game.isCompleted) return game
        val story = currentStory(game) ?: return game
        val completed = game.completedStoryIndices + game.currentStoryIndex
        val now = System.currentTimeMillis()
        val nextStoryIndex = game.currentStoryIndex + 1

        return if (nextStoryIndex < game.level.stories.size) {
            game.copy(
                completedStoryIndices = completed,
                currentStoryIndex = nextStoryIndex,
                currentLineIndex = 0,
                lastPlayedAt = now
            )
        } else {
            game.copy(
                completedStoryIndices = completed,
                currentLineIndex = story.lines.lastIndex,
                status = GameStatus.COMPLETED,
                completedAt = now,
                lastPlayedAt = now
            )
        }
    }

    fun isWon(game: KidsSleepGame): Boolean = game.isCompleted

    fun canApplyHint(game: KidsSleepGame): Boolean =
        canNextLine(game) && !isOnLastLineOfLastStory(game)

    private fun isOnLastLineOfLastStory(game: KidsSleepGame): Boolean {
        val story = currentStory(game) ?: return true
        val isLastStory = game.currentStoryIndex >= game.level.stories.lastIndex
        return isLastStory && game.currentLineIndex >= story.lines.lastIndex
    }

    fun applyHint(game: KidsSleepGame): KidsSleepGame {
        if (!canApplyHint(game)) return game
        return nextLine(game).copy(hintsUsed = game.hintsUsed + 1)
    }

    fun optimalMoveCount(game: KidsSleepGame): Int =
        game.level.totalLines.coerceAtLeast(1)

    fun formatP2PMove(storyIndex: Int, lineIndex: Int): String =
        "line:$storyIndex:$lineIndex"

    fun parseP2PMove(payload: String): Pair<Int, Int>? {
        if (!payload.startsWith("line:")) return null
        val parts = payload.removePrefix("line:").split(":")
        if (parts.size != 2) return null
        val storyIndex = parts[0].toIntOrNull() ?: return null
        val lineIndex = parts[1].toIntOrNull() ?: return null
        return storyIndex to lineIndex
    }

    fun applyRemoteLineMove(game: KidsSleepGame, storyIndex: Int, lineIndex: Int): KidsSleepGame {
        if (game.isCompleted) return game
        val story = game.level.stories.getOrNull(storyIndex) ?: return game
        if (lineIndex !in story.lines.indices) return game

        val isForward = storyIndex > game.currentStoryIndex ||
            (storyIndex == game.currentStoryIndex && lineIndex > game.currentLineIndex)
        if (!isForward) return game

        var updated = game.copy(
            currentStoryIndex = storyIndex,
            currentLineIndex = lineIndex,
            moves = game.moves + 1,
            lastPlayedAt = System.currentTimeMillis()
        )

        val completed = buildSet {
            addAll(updated.completedStoryIndices)
            for (index in 0 until storyIndex) {
                add(index)
            }
            if (lineIndex >= story.lines.lastIndex) {
                add(storyIndex)
            }
        }
        updated = updated.copy(completedStoryIndices = completed)

        if (storyIndex >= game.level.stories.lastIndex && lineIndex >= story.lines.lastIndex) {
            updated = updated.copy(
                status = GameStatus.COMPLETED,
                completedAt = System.currentTimeMillis()
            )
        }
        return updated
    }
}
