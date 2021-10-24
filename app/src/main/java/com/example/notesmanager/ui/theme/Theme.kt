package com.example.notesmanager.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.graphics.Color.Companion.White

private val DarkColorPalette = darkColors(
    primary = lightBlue,
    primaryVariant = DarkBlue,
    secondary = Teal200,
    onBackground = White
)

private val LightColorPalette = lightColors(
    primary = DarkYellow,
    primaryVariant = Yellow,
    secondary = Teal200,
    background = Ivory,
    onBackground = Black,
    /* Other default colors to override
    background = Color.Ivory,
    surface = Color.Ivory,
    onPrimary = Color.Ivory,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
    */
)

@Composable
fun NotesManagerTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable() () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}