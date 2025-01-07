package com.devcampus.echojournal.presentation.screens.entry_list

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.devcampus.echojournal.core.navigation.Destinations
import com.devcampus.echojournal.ui.theme.EchoJournalTheme
import com.devcampus.echojournal.ui.theme.ExtendedTheme

@Composable
fun EntryListScreenRoot(
    navDestination: (Destinations) -> Unit = {}
) {
    EntryListScreen()
}

@Composable
fun EntryListScreen() {
    EntryListScreenContent()
}

@Composable
fun EntryListScreenContent() {
    Text(
        text = "Entry List Screen",
        modifier = Modifier.wrapContentSize(Alignment.Center),
        style = ExtendedTheme.typography.headlineXSmall
    )
}

@Preview(showBackground = true)
@Composable
fun EntryListScreenPreview() {
    EchoJournalTheme {
        EntryListScreen()
    }
}