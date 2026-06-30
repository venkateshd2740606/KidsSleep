package com.kidssleep.presentation.ui.screens.sleep

import android.app.Activity
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.automirrored.filled.VolumeUp
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.kidssleep.R
import com.kidssleep.domain.model.LearningLanguage
import com.kidssleep.engine.SleepStoryBank
import com.kidssleep.util.rememberStorySpeech
import kotlinx.coroutines.delay

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun StoryListScreen(onNavigateBack: () -> Unit, onOpenStory: (Int) -> Unit) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(stringResource(R.string.bedtime_stories)) },
                navigationIcon = {
                    IconButton(onClick = onNavigateBack) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = stringResource(R.string.back))
                    }
                }
            )
        }
    ) { padding ->
        LazyColumn(Modifier.fillMaxSize().padding(padding).padding(16.dp), verticalArrangement = Arrangement.spacedBy(10.dp)) {
            items(SleepStoryBank.all) { story ->
                Card(
                    modifier = Modifier.fillMaxWidth().clickable { onOpenStory(story.id) },
                    shape = RoundedCornerShape(12.dp)
                ) {
                    Row(Modifier.padding(16.dp), verticalAlignment = Alignment.CenterVertically) {
                        Text(story.illustration, style = MaterialTheme.typography.headlineMedium)
                        Spacer(Modifier.width(12.dp))
                        Column(Modifier.weight(1f)) {
                            Text(story.title, fontWeight = FontWeight.SemiBold)
                            Text(stringResource(R.string.lines_count, story.lines.size), style = MaterialTheme.typography.bodySmall)
                        }
                        Icon(Icons.Default.ChevronRight, contentDescription = null)
                    }
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun StoryReaderScreen(
    storyId: Int,
    soundEnabled: Boolean,
    useBundledAudio: Boolean,
    learningLanguage: LearningLanguage,
    onNavigateBack: () -> Unit
) {
    val story = remember(storyId) { SleepStoryBank.byId(storyId) }
    var lineIndex by remember(storyId) { mutableIntStateOf(0) }
    val storySpeech = rememberStorySpeech(useBundledAudio)
    val lines = story?.linesFor(learningLanguage).orEmpty()
    val currentLine = lines.getOrNull(lineIndex).orEmpty()

    LaunchedEffect(storyId, lineIndex, soundEnabled, currentLine) {
        if (soundEnabled && currentLine.isNotBlank() && story != null) {
            storySpeech.speak(story.id, lineIndex, currentLine, learningLanguage)
        }
    }

    if (story == null) {
        LaunchedEffect(Unit) { onNavigateBack() }
        return
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(story.titleFor(learningLanguage), maxLines = 1) },
                navigationIcon = {
                    IconButton(onClick = {
                        storySpeech.stop()
                        onNavigateBack()
                    }) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = stringResource(R.string.back))
                    }
                },
                actions = {
                    Icon(Icons.AutoMirrored.Filled.VolumeUp, contentDescription = stringResource(R.string.read_aloud),
                        tint = if (soundEnabled) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.onSurfaceVariant)
                }
            )
        }
    ) { padding ->
        Column(
            Modifier.fillMaxSize().padding(padding).padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            LinearProgressIndicator(
                progress = { if (lines.isEmpty()) 0f else (lineIndex + 1f) / lines.size },
                modifier = Modifier.fillMaxWidth()
            )
            Text(story.illustration, style = MaterialTheme.typography.displayLarge, modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center)
            Card(Modifier.weight(1f).fillMaxWidth()) {
                Box(Modifier.fillMaxSize().padding(24.dp), contentAlignment = Alignment.Center) {
                    Text(currentLine, style = MaterialTheme.typography.headlineSmall, textAlign = TextAlign.Center)
                }
            }
            Text(stringResource(R.string.line_progress, lineIndex + 1, lines.size), modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center)
            Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                OutlinedButton(onClick = { if (lineIndex > 0) lineIndex-- }, enabled = lineIndex > 0) {
                    Icon(Icons.AutoMirrored.Filled.ArrowBack, null)
                    Spacer(Modifier.width(4.dp))
                    Text(stringResource(R.string.prev_line))
                }
                OutlinedButton(onClick = { if (lineIndex < lines.lastIndex) lineIndex++ }, enabled = lineIndex < lines.lastIndex) {
                    Text(stringResource(R.string.next_line))
                    Spacer(Modifier.width(4.dp))
                    Icon(Icons.AutoMirrored.Filled.ArrowForward, null)
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TimerScreen(onNavigateBack: () -> Unit) {
    val durations = listOf(15, 30, 45, 60)
    var selectedMinutes by remember { mutableIntStateOf(30) }
    var running by remember { mutableStateOf(false) }
    var remainingSeconds by remember { mutableIntStateOf(0) }
    var showFadeMessage by remember { mutableStateOf(false) }
    var fadeEnabled by remember { mutableStateOf(true) }

    LaunchedEffect(running, remainingSeconds) {
        if (!running || remainingSeconds <= 0) return@LaunchedEffect
        delay(1000)
        remainingSeconds--
        if (remainingSeconds == 0) {
            running = false
            if (fadeEnabled) showFadeMessage = true
        }
    }

    if (showFadeMessage) {
        AlertDialog(
            onDismissRequest = { showFadeMessage = false; onNavigateBack() },
            title = { Text(stringResource(R.string.timer_done_title)) },
            text = { Text(stringResource(R.string.timer_fade_message)) },
            confirmButton = { TextButton(onClick = { showFadeMessage = false; onNavigateBack() }) { Text(stringResource(R.string.ok)) } }
        )
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(stringResource(R.string.sleep_timer)) },
                navigationIcon = {
                    IconButton(onClick = onNavigateBack) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = stringResource(R.string.back))
                    }
                }
            )
        }
    ) { padding ->
        Column(
            Modifier.fillMaxSize().padding(padding).padding(16.dp).verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(20.dp)
        ) {
            Text(
                text = if (running || remainingSeconds > 0) formatTime(remainingSeconds) else formatTime(selectedMinutes * 60),
                style = MaterialTheme.typography.displayLarge,
                fontWeight = FontWeight.Bold
            )
            Text(stringResource(R.string.screen_dim_tip), style = MaterialTheme.typography.bodyMedium, textAlign = TextAlign.Center)
            Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                durations.forEach { mins ->
                    FilterChip(selected = selectedMinutes == mins && !running, onClick = {
                        selectedMinutes = mins
                        remainingSeconds = mins * 60
                    }, label = { Text(stringResource(R.string.timer_minutes, mins)) }, enabled = !running)
                }
            }
            Row(verticalAlignment = Alignment.CenterVertically) {
                Checkbox(checked = fadeEnabled, onCheckedChange = { fadeEnabled = it })
                Text(stringResource(R.string.timer_fade_option))
            }
            Button(
                onClick = {
                    if (!running) {
                        if (remainingSeconds <= 0) remainingSeconds = selectedMinutes * 60
                        running = true
                    } else {
                        running = false
                    }
                },
                modifier = Modifier.fillMaxWidth()
            ) {
                Icon(if (running) Icons.Default.Pause else Icons.Default.PlayArrow, null)
                Spacer(Modifier.width(8.dp))
                Text(if (running) stringResource(R.string.pause) else stringResource(R.string.start_timer))
            }
            if (remainingSeconds > 0) {
                OutlinedButton(onClick = { running = false; remainingSeconds = selectedMinutes * 60 }, modifier = Modifier.fillMaxWidth()) {
                    Text(stringResource(R.string.reset_timer))
                }
            }
        }
    }
}

private fun formatTime(totalSeconds: Int): String {
    val m = totalSeconds / 60
    val s = totalSeconds % 60
    return "%02d:%02d".format(m, s)
}
