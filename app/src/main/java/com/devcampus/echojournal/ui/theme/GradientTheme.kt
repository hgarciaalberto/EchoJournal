package com.devcampus.echojournal.ui.theme

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.calculateEndPadding
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import androidx.compose.ui.unit.LayoutDirection
import com.devcampus.echojournal.core.extensions.linearGradient
import com.devcampus.echojournal.core.navigation.NavigationRoot

private val defaultGradientColors = GradientColors(
    bg = listOf(
        Color(0x66D9E2FF),
        Color(0x66EEF0FF),
    ),
    bgSaturated = listOf(
        Color(0x66D9E2FF),
        Color(0x66EEF0FF),
    ),
    button = listOf(
        Color(0xFF578CFF),
        Color(0xFF1F70F5),
    ),
    buttonPressed = listOf(
        Color(0xFF578CFF),
        Color(0xFF1F70F5),
    ),
)

@Immutable
data class GradientColors(
    val bg: List<Color>,
    val bgSaturated: List<Color>,
    val button: List<Color>,
    val buttonPressed: List<Color>,
//    val contentColor: Color,
)

val LocalExtendedColors = staticCompositionLocalOf {
    GradientColors(
        bg = defaultGradientColors.bg,
        bgSaturated = defaultGradientColors.bgSaturated,
        button = defaultGradientColors.button,
        buttonPressed = defaultGradientColors.buttonPressed,
//        contentColor = Color.White,
    )
}

@Preview
@Composable
fun PreviewLinearGradient(
    @PreviewParameter(GradientPreviewParamProvider::class) params: List<Color>
) {
    EchoJournalTheme {
        Scaffold(
            containerColor = MaterialTheme.colorScheme.background,
            contentColor = MaterialTheme.colorScheme.onBackground,
        ) { innerPadding ->
            NavigationRoot(
                modifier = Modifier
                    .padding(
                        PaddingValues(
                            bottom = innerPadding.calculateBottomPadding(),
                            start = innerPadding.calculateStartPadding(LayoutDirection.Ltr),
                            end = innerPadding.calculateEndPadding(LayoutDirection.Ltr)
                        )
                    )
                    .linearGradient(
                        colors = params,
                    )
            )
        }
    }
}


class GradientPreviewParamProvider : PreviewParameterProvider<List<Color>> {
    override val values = sequenceOf(defaultGradientColors.bg, defaultGradientColors.button)
}