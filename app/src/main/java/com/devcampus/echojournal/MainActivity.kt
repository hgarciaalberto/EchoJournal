package com.devcampus.echojournal

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.calculateEndPadding
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.LayoutDirection
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.devcampus.echojournal.core.navigation.NavigationRoot
import com.devcampus.echojournal.ui.theme.EchoJournalTheme
import org.koin.compose.KoinContext

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        installSplashScreen()
        enableEdgeToEdge()

        super.onCreate(savedInstanceState)

        setContent {
            KoinContext {
                EchoJournalTheme {
                    Scaffold(
                        containerColor = MaterialTheme.colorScheme.background,
                        contentColor = MaterialTheme.colorScheme.onBackground,
                    ) { innerPadding ->
                        NavigationRoot(
                            modifier = Modifier.padding(
                                PaddingValues(
                                    bottom = innerPadding.calculateBottomPadding(),
                                    start = innerPadding.calculateStartPadding(LayoutDirection.Ltr),
                                    end = innerPadding.calculateEndPadding(LayoutDirection.Ltr)
                                )
                            )
                        )
                    }
                }
            }
        }
    }
}
