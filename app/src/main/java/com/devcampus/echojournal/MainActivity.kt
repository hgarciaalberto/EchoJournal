package com.devcampus.echojournal

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Scaffold
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.devcampus.echojournal.core.navigation.NavigationRoot
import com.devcampus.echojournal.ui.theme.EchoJournalTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        installSplashScreen()
        enableEdgeToEdge()

        super.onCreate(savedInstanceState)

        setContent {
//            KoinContext {
            EchoJournalTheme {
                Scaffold { innerPadding ->
                    NavigationRoot(
                        innerPadding = innerPadding
                    )
                }
            }
//            }
        }
    }
}
