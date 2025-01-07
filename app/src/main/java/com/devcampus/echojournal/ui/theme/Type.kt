package com.devcampus.echojournal.ui.theme

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.googlefonts.Font
import androidx.compose.ui.text.googlefonts.GoogleFont
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.devcampus.echojournal.R

val provider = GoogleFont.Provider(
    providerAuthority = "com.google.android.gms.fonts",
    providerPackage = "com.google.android.gms",
    certificates = R.array.com_google_android_gms_fonts_certs
)

val fontName = GoogleFont("Inter")

val fontFamily = FontFamily(
    Font(
        googleFont = fontName,
        fontProvider = provider,
    )
)

val Typography = Typography(
    // Styles defined in the design system
    headlineLarge = TextStyle(
        fontFamily = fontFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 26.sp,
        lineHeight = 32.sp
    ),
    headlineMedium = TextStyle(
        fontFamily = fontFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 22.sp,
        lineHeight = 26.sp
    ),
    headlineSmall = TextStyle(
        fontFamily = fontFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 16.sp,
        lineHeight = 24.sp
    ),

    bodyMedium = TextStyle(
        fontFamily = fontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        lineHeight = 20.sp
    ),
    bodySmall = TextStyle(
        fontFamily = fontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        lineHeight = 16.sp
    ),

    labelMedium = TextStyle(
        fontFamily = fontFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 12.sp,
        lineHeight = 15.sp
    ),

    // Rest of styles required by Typography
    displayLarge = TextStyle(
        fontFamily = fontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 57.sp,
        lineHeight = 64.sp
    ),
    displayMedium = TextStyle(
        fontFamily = fontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 45.sp,
        lineHeight = 52.sp
    ),
    displaySmall = TextStyle(
        fontFamily = fontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 36.sp,
        lineHeight = 44.sp
    ),

    bodyLarge = TextStyle(
        fontFamily = fontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 15.sp,
        lineHeight = 22.sp
    ),


    labelLarge = TextStyle(
        fontFamily = fontFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 13.sp,
        lineHeight = 15.sp
    ),
    labelSmall = TextStyle(
        fontFamily = fontFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 15.sp
    ),
)

// Extended custom typography
@Immutable
data class ExtendedTypography(
    val headlineXSmall: TextStyle,
    val buttonLarge: TextStyle,
    val button: TextStyle
)

val LocalExtendedTypography = staticCompositionLocalOf {
    ExtendedTypography(
        headlineXSmall = TextStyle(
            fontFamily = fontFamily,
            fontWeight = FontWeight.Medium,
            fontSize = 13.sp,
            lineHeight = 18.sp
        ),
        buttonLarge = TextStyle(
            fontFamily = fontFamily,
            fontWeight = FontWeight.Medium,
            fontSize = 16.sp,
            lineHeight = 24.sp
        ),
        button = TextStyle(
            fontFamily = fontFamily,
            fontWeight = FontWeight.Medium,
            fontSize = 14.sp,
            lineHeight = 20.sp
        )
    )
}


@Preview(showBackground = true, showSystemUi = false)
@Composable
private fun PreviewDefaultMaterialThemeTypography() {
    EchoJournalTheme {
        Column {
            // Typography styles in the design system
            Text(
                text = "In the Design System",
                style = ExtendedTheme.typography.headlineXSmall.copy(textDecoration = TextDecoration.Underline),
                modifier = Modifier.padding(vertical = 8.dp)
            )
//            Text(text = "displayLarge", style = MaterialTheme.typography.displayLarge)
//            Text(text = "displayMedium", style = MaterialTheme.typography.displayMedium)
//            Text(text = "displaySmall", style = MaterialTheme.typography.displaySmall)
            Text(text = "headlineLarge", style = MaterialTheme.typography.headlineLarge)
            Text(text = "headlineMedium", style = MaterialTheme.typography.headlineMedium)
            Text(text = "headlineSmall", style = MaterialTheme.typography.headlineSmall)
            Text(text = "headlineXSmall", style = ExtendedTheme.typography.headlineXSmall)
//            Text(text = "titleLarge", style = MaterialTheme.typography.titleLarge)
//            Text(text = "titleMedium", style = MaterialTheme.typography.titleMedium)
//            Text(text = "titleSmall", style = MaterialTheme.typography.titleSmall)
            Text(text = "ButtonLarge", style = ExtendedTheme.typography.buttonLarge)
            Text(text = "Button", style = ExtendedTheme.typography.button)
//            Text(text = "bodyLarge", style = MaterialTheme.typography.bodyLarge)
            Text(text = "bodyMedium", style = MaterialTheme.typography.bodyMedium)
            Text(text = "bodySmall", style = MaterialTheme.typography.bodySmall)
//            Text(text = "labelLarge", style = MaterialTheme.typography.labelLarge)
            Text(text = "labelMedium", style = MaterialTheme.typography.labelMedium)
//            Text(text = "labelSmall", style = MaterialTheme.typography.labelSmall)

            Spacer(modifier = Modifier.height(18.dp))

            // Typography styles not in the design system
            Text(
                text = "Outside the Design System",
                style = ExtendedTheme.typography.headlineXSmall.copy(textDecoration = TextDecoration.Underline),
                modifier = Modifier.padding(vertical = 8.dp),
            )
            Text(text = "displayLarge", style = MaterialTheme.typography.displayLarge)
            Text(text = "displayMedium", style = MaterialTheme.typography.displayMedium)
            Text(text = "displaySmall", style = MaterialTheme.typography.displaySmall)
            Text(text = "titleLarge", style = MaterialTheme.typography.titleLarge)
            Text(text = "titleMedium", style = MaterialTheme.typography.titleMedium)
            Text(text = "titleSmall", style = MaterialTheme.typography.titleSmall)
            Text(text = "bodyLarge", style = MaterialTheme.typography.bodyLarge)
            Text(text = "labelLarge", style = MaterialTheme.typography.labelLarge)
            Text(text = "labelSmall", style = MaterialTheme.typography.labelSmall)
        }
    }
}
