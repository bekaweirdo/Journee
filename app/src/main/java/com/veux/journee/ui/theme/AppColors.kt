package com.veux.journee.ui.theme

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

class AppColors(
    primary: Color,
    textPrimary: Color,
    textSecondary: Color,
    background: Color,
    error: Color,
    isLight: Boolean
) {
    var primary by mutableStateOf(primary)
        private set
    var textSecondary by mutableStateOf(textSecondary)
        private set
    var textPrimary by mutableStateOf(textPrimary)
        private set
    var error by mutableStateOf(error)
        private set
    var background by mutableStateOf(background)
        private set
    var isLight by mutableStateOf(isLight)
        internal set

    fun copy(
        primary: Color = this.primary,
        textPrimary: Color = this.textPrimary,
        textSecondary: Color = this.textSecondary,
        error: Color = this.error,
        background: Color = this.background,
        isLight: Boolean = this.isLight
    ): AppColors = AppColors(
        primary,
        textPrimary,
        textSecondary,
        error,
        background,
        isLight
    )

    fun updateColorsFrom(other: AppColors) {
        primary = other.primary
        textPrimary = other.textPrimary
        textSecondary = other.textSecondary
        background = other.background
        error = other.error
    }
}

val journee_theme_light_primary = Color(0xFF006495)
val journee_theme_light_onPrimary = Color(0xFFFFFFFF)
val journee_theme_light_primaryContainer = Color(0xFFCBE6FF)
val journee_theme_light_onPrimaryContainer = Color(0xFF001E30)
val journee_theme_light_secondary = Color(0xFF006781)
val journee_theme_light_onSecondary = Color(0xFFFFFFFF)
val journee_theme_light_secondaryContainer = Color(0xFFBAEAFF)
val journee_theme_light_onSecondaryContainer = Color(0xFF001F29)
val journee_theme_light_tertiary = Color(0xFF006496)
val journee_theme_light_onTertiary = Color(0xFFFFFFFF)
val journee_theme_light_tertiaryContainer = Color(0xFFCCE5FF)
val journee_theme_light_onTertiaryContainer = Color(0xFF001E31)
val journee_theme_light_error = Color(0xFFBA1A1A)
val journee_theme_light_errorContainer = Color(0xFFFFDAD6)
val journee_theme_light_onError = Color(0xFFFFFFFF)
val journee_theme_light_onErrorContainer = Color(0xFF410002)
val journee_theme_light_background = Color(0xFFF8FDFF)
val journee_theme_light_onBackground = Color(0xFF001F25)
val journee_theme_light_surface = Color(0xFFF8FDFF)
val journee_theme_light_onSurface = Color(0xFF001F25)
val journee_theme_light_surfaceVariant = Color(0xFFDEE3EA)
val journee_theme_light_onSurfaceVariant = Color(0xFF41474D)
val journee_theme_light_outline = Color(0xFF72787E)
val journee_theme_light_inverseOnSurface = Color(0xFFD6F6FF)
val journee_theme_light_inverseSurface = Color(0xFF00363F)
val journee_theme_light_inversePrimary = Color(0xFF8FCDFF)
val journee_theme_light_shadow = Color(0xFF000000)
val journee_theme_light_surfaceTint = Color(0xFF006495)
val journee_theme_light_outlineVariant = Color(0xFFC1C7CE)
val journee_theme_light_scrim = Color(0xFF000000)

val journee_theme_dark_primary = Color(0xFF8FCDFF)
val journee_theme_dark_onPrimary = Color(0xFF003450)
val journee_theme_dark_primaryContainer = Color(0xFF004B71)
val journee_theme_dark_onPrimaryContainer = Color(0xFFCBE6FF)
val journee_theme_dark_secondary = Color(0xFF5FD4FD)
val journee_theme_dark_onSecondary = Color(0xFF003544)
val journee_theme_dark_secondaryContainer = Color(0xFF004D62)
val journee_theme_dark_onSecondaryContainer = Color(0xFFBAEAFF)
val journee_theme_dark_tertiary = Color(0xFF91CDFF)
val journee_theme_dark_onTertiary = Color(0xFF003350)
val journee_theme_dark_tertiaryContainer = Color(0xFF004B72)
val journee_theme_dark_onTertiaryContainer = Color(0xFFCCE5FF)
val journee_theme_dark_error = Color(0xFFFFB4AB)
val journee_theme_dark_errorContainer = Color(0xFF93000A)
val journee_theme_dark_onError = Color(0xFF690005)
val journee_theme_dark_onErrorContainer = Color(0xFFFFDAD6)
val journee_theme_dark_background = Color(0xFF001F25)
val journee_theme_dark_onBackground = Color(0xFFA6EEFF)
val journee_theme_dark_surface = Color(0xFF001F25)
val journee_theme_dark_onSurface = Color(0xFFA6EEFF)
val journee_theme_dark_surfaceVariant = Color(0xFF41474D)
val journee_theme_dark_onSurfaceVariant = Color(0xFFC1C7CE)
val journee_theme_dark_outline = Color(0xFF8B9198)
val journee_theme_dark_inverseOnSurface = Color(0xFF001F25)
val journee_theme_dark_inverseSurface = Color(0xFFA6EEFF)
val journee_theme_dark_inversePrimary = Color(0xFF006495)
val journee_theme_dark_shadow = Color(0xFF000000)
val journee_theme_dark_surfaceTint = Color(0xFF8FCDFF)
val journee_theme_dark_outlineVariant = Color(0xFF41474D)
val journee_theme_dark_scrim = Color(0xFF000000)

fun lightColor(
    primary: Color = journee_theme_light_primary,
    textPrimary: Color = journee_theme_light_onPrimary,
    textSecondary: Color = journee_theme_light_secondary,
    background: Color = journee_theme_light_background,
    error: Color = journee_theme_light_error
): AppColors = AppColors(
    primary = primary,
    textPrimary = textPrimary,
    textSecondary = textSecondary,
    background = background,
    error = error,
    isLight = true
)

fun darkColor(
    primary: Color = journee_theme_dark_primary,
    textPrimary: Color = journee_theme_dark_onPrimary,
    textSecondary: Color = journee_theme_dark_secondary,
    background: Color = journee_theme_dark_background,
    error: Color = journee_theme_dark_error
): AppColors = AppColors(
    primary = primary,
    textPrimary = textPrimary,
    textSecondary = textSecondary,
    background = background,
    error = error,
    isLight = false
)

internal val LocalColors = staticCompositionLocalOf { lightColor() }