package com.kidssleep.multiplayer

import com.kidssleep.domain.model.KidsSleepGame
import com.kidssleep.domain.model.Difficulty
import com.kidssleep.domain.model.MultiplayerMode
import com.kidssleep.domain.model.MultiplayerSession
import com.kidssleep.engine.KidsSleepEngine
import com.kidssleep.engine.KidsSleepGenerator
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PuzzleBotSession @Inject constructor() {
    private val _session = MutableStateFlow<MultiplayerSession?>(null)
    val session: StateFlow<MultiplayerSession?> = _session.asStateFlow()

    private var playerGame: KidsSleepGame? = null
    private var botGame: KidsSleepGame? = null
    private var playerName = "You"
    private val botName = "AI Bot"

    fun start(player: String, difficulty: Difficulty, seed: Long = System.currentTimeMillis()) {
        playerName = player
        val level = KidsSleepGenerator.generate(seed, 1, difficulty)
        val game = KidsSleepEngine.createInitialGame(level)
        playerGame = game
        botGame = game
        _session.value = MultiplayerSession(
            mode = MultiplayerMode.SAME_DEVICE,
            localPlayerName = playerName,
            remotePlayerName = botName,
            activePlayerName = playerName,
            isActive = true,
            seed = seed,
            difficulty = difficulty
        )
    }

    fun getPlayerGame(): KidsSleepGame? = playerGame

    fun applyPlayerNextLine(): KidsSleepGame? {
        val game = playerGame ?: return null
        val updated = KidsSleepEngine.nextLine(game)
        playerGame = updated
        botGame = updated
        return updated
    }

    fun applyBotMove(): KidsSleepGame? {
        val game = botGame ?: return null
        if (!KidsSleepEngine.canNextLine(game)) return game
        val updated = KidsSleepEngine.nextLine(game)
        playerGame = updated
        botGame = updated
        return updated
    }

    fun onPlayerWon() {
        val session = _session.value ?: return
        _session.value = session.copy(
            localScore = session.localScore + 1,
            activePlayerName = playerName
        )
        startNewRound(session)
    }

    fun onBotWon() {
        val session = _session.value ?: return
        _session.value = session.copy(
            remoteScore = session.remoteScore + 1,
            activePlayerName = playerName
        )
        startNewRound(session)
    }

    private fun startNewRound(session: MultiplayerSession) {
        val newSeed = session.seed + session.localScore + session.remoteScore
        val level = KidsSleepGenerator.generate(
            newSeed,
            session.localScore + session.remoteScore + 1,
            session.difficulty
        )
        val game = KidsSleepEngine.createInitialGame(level)
        playerGame = game
        botGame = game
    }

    fun isBotThinking(): Boolean = false

    fun end() {
        _session.value = null
        playerGame = null
        botGame = null
    }
}
