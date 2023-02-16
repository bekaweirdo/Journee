package com.veux.journee.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.remember

object JourneeTheme {
    val colors: AppColors
        @ReadOnlyComposable
        @Composable
        get() = LocalColors.current

    val typography: AppTypography
        @ReadOnlyComposable
        @Composable
        get() = LocalTypography.current

    val dimensions: AppDimensions
        @ReadOnlyComposable
        @Composable
        get() = LocalDimensions.current
}

@Composable
fun JourneeTheme(
    colors: AppColors = JourneeTheme.colors,
    typography: AppTypography = JourneeTheme.typography,
    dimensions: AppDimensions = JourneeTheme.dimensions,
    content: @Composable () -> Unit
) {
    val darkTheme = isSystemInDarkTheme()
    val rememberedColors = remember { colors.copy(isLight = !darkTheme) }.apply { updateColorsFrom(colors) }

    CompositionLocalProvider(
        LocalColors provides rememberedColors,
        LocalDimensions provides dimensions,
        LocalTypography provides typography
    ) {
        content()
    }
}