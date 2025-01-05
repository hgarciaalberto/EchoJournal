package com.devcampus.echojournal.core.navigation

import androidx.compose.animation.SizeTransform
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.VisibilityThreshold
import androidx.compose.animation.core.spring
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.scaleIn
import androidx.compose.animation.scaleOut
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.IntSize
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.devcampus.echojournal.presentation.screens.create_record.CreateRecordScreenRoot
import com.devcampus.echojournal.presentation.screens.entry_list.EntryListScreenRoot

@Composable
fun NavigationRoot(modifier: Modifier = Modifier) {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Destinations.EntryList,
        modifier = modifier.fillMaxSize()
    ) {
        composable<Destinations.EntryList>(
            enterTransition = {
                fadeIn(
                    animationSpec = tween(300, easing = FastOutSlowInEasing)
                ) + scaleIn(
                    initialScale = 1.1f,
                    animationSpec = tween(300, easing = FastOutSlowInEasing)
                )
            },
            exitTransition = {
                fadeOut(
                    animationSpec = tween(300, easing = FastOutSlowInEasing)
                ) + scaleOut(
                    targetScale = 0.9f,
                    animationSpec = tween(300, easing = FastOutSlowInEasing)
                )
            }
        ) {
            EntryListScreenRoot { resId ->
                navController.navigate(resId)
            }
        }

        composable<Destinations.CreateRecord>(
            enterTransition = {
                fadeIn(
                    animationSpec = tween(300, easing = FastOutSlowInEasing)
                ) + scaleIn(
                    initialScale = 0.9f,
                    animationSpec = tween(300, easing = FastOutSlowInEasing)
                )
            },
            exitTransition = {
                fadeOut(
                    animationSpec = tween(300, easing = FastOutSlowInEasing)
                ) + scaleOut(
                    targetScale = 1.1f,
                    animationSpec = tween(300, easing = FastOutSlowInEasing)
                )
            },
            sizeTransform = {
                SizeTransform(
                    sizeAnimationSpec = { _, _ ->
                        spring(
                            dampingRatio = Spring.DampingRatioMediumBouncy,
                            stiffness = Spring.StiffnessMediumLow,
                            visibilityThreshold = IntSize.VisibilityThreshold
                        )
                    },
                    clip = false
                )
            }
        ) {
            CreateRecordScreenRoot { resId ->
                navController.navigate(resId)
            }
        }
    }
}
