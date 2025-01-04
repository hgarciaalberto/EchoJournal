package com.devcampus.echojournal.presentation.screens.create_record

import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.devcampus.echojournal.core.navigation.Destinations
import com.devcampus.echojournal.ui.theme.EchoJournalTheme

@Composable
fun CreateRecordScreenRoot(
    navDestination: (Destinations) -> Unit = {}
) {
    CreateRecordScreen()
}

@Composable
fun CreateRecordScreen() {
    CreateRecordScreenContent()
}

@Composable
fun CreateRecordScreenContent() {
    Text(
        text = "Create Record Screen",
        modifier = Modifier.wrapContentSize(Alignment.Center)
    )
}

@Composable
@Preview(showBackground = true)
fun CreateRecordScreenPreview() {
    EchoJournalTheme {
        CreateRecordScreen()
    }
}