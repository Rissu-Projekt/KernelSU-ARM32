package me.weishu.kernelsu.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.unit.dp
import androidx.core.view.ViewCompat
import com.google.accompanist.systemuicontroller.rememberSystemUiController

private val md_theme_light_primary = Color(0xFF8B5000)
private val md_theme_light_onPrimary = Color(0xFFFFFFFF)
private val md_theme_light_primaryContainer = Color(0xFFFFDCBE)
private val md_theme_light_onPrimaryContainer = Color(0xFF2C1600)
private val md_theme_light_secondary = Color(0xFF725A42)
private val md_theme_light_onSecondary = Color(0xFFFFFFFF)
private val md_theme_light_secondaryContainer = Color(0xFFFFDCBE)
private val md_theme_light_onSecondaryContainer = Color(0xFF291806)
private val md_theme_light_tertiary = Color(0xFF58633A)
private val md_theme_light_onTertiary = Color(0xFFFFFFFF)
private val md_theme_light_tertiaryContainer = Color(0xFFDCE8B4)
private val md_theme_light_onTertiaryContainer = Color(0xFF161E01)
private val md_theme_light_error = Color(0xFFBA1A1A)
private val md_theme_light_errorContainer = Color(0xFFFFDAD6)
private val md_theme_light_onError = Color(0xFFFFFFFF)
private val md_theme_light_onErrorContainer = Color(0xFF410002)
private val md_theme_light_background = Color(0xFFFFFBFF)
private val md_theme_light_onBackground = Color(0xFF201B16)
private val md_theme_light_surface = Color(0xFFFFFBFF)
private val md_theme_light_onSurface = Color(0xFF201B16)
private val md_theme_light_surfaceVariant = Color(0xFFF2DFD1)
private val md_theme_light_onSurfaceVariant = Color(0xFF51453A)
private val md_theme_light_outline = Color(0xFF837468)
private val md_theme_light_inverseOnSurface = Color(0xFFFAEFE7)
private val md_theme_light_inverseSurface = Color(0xFF352F2B)
private val md_theme_light_inversePrimary = Color(0xFFFFB870)
private val md_theme_light_shadow = Color(0xFF000000)
private val md_theme_light_surfaceTint = Color(0xFF8B5000)
private val md_theme_light_outlineVariant = Color(0xFFD5C3B5)
private val md_theme_light_scrim = Color(0xFF000000)

private val md_theme_dark_primary = Color(0xFFFFB870)
private val md_theme_dark_onPrimary = Color(0xFF4A2800)
private val md_theme_dark_primaryContainer = Color(0xFF693C00)
private val md_theme_dark_onPrimaryContainer = Color(0xFFFFDCBE)
private val md_theme_dark_secondary = Color(0xFFE1C1A4)
private val md_theme_dark_onSecondary = Color(0xFF402C18)
private val md_theme_dark_secondaryContainer = Color(0xFF59422C)
private val md_theme_dark_onSecondaryContainer = Color(0xFFFFDCBE)
private val md_theme_dark_tertiary = Color(0xFFC0CC9A)
private val md_theme_dark_onTertiary = Color(0xFF2B3410)
private val md_theme_dark_tertiaryContainer = Color(0xFF414B24)
private val md_theme_dark_onTertiaryContainer = Color(0xFFDCE8B4)
private val md_theme_dark_error = Color(0xFFFFB4AB)
private val md_theme_dark_errorContainer = Color(0xFF93000A)
private val md_theme_dark_onError = Color(0xFF690005)
private val md_theme_dark_onErrorContainer = Color(0xFFFFDAD6)
private val md_theme_dark_background = Color(0xFF201B16)
private val md_theme_dark_onBackground = Color(0xFFEBE0D9)
private val md_theme_dark_surface = Color(0xFF201B16)
private val md_theme_dark_onSurface = Color(0xFFEBE0D9)
private val md_theme_dark_surfaceVariant = Color(0xFF51453A)
private val md_theme_dark_onSurfaceVariant = Color(0xFFD5C3B5)
private val md_theme_dark_outline = Color(0xFF9D8E81)
private val md_theme_dark_inverseOnSurface = Color(0xFF201B16)
private val md_theme_dark_inverseSurface = Color(0xFFEBE0D9)
private val md_theme_dark_inversePrimary = Color(0xFF8B5000)
private val md_theme_dark_shadow = Color(0xFF000000)
private val md_theme_dark_surfaceTint = Color(0xFFFFB870)
private val md_theme_dark_outlineVariant = Color(0xFF51453A)
private val md_theme_dark_scrim = Color(0xFF000000)

val LightColorScheme = lightColorScheme(
    primary = md_theme_light_primary,
    onPrimary = md_theme_light_onPrimary,
    primaryContainer = md_theme_light_primaryContainer,
    onPrimaryContainer = md_theme_light_onPrimaryContainer,
    secondary = md_theme_light_secondary,
    onSecondary = md_theme_light_onSecondary,
    secondaryContainer = md_theme_light_secondaryContainer,
    onSecondaryContainer = md_theme_light_onSecondaryContainer,
    tertiary = md_theme_light_tertiary,
    onTertiary = md_theme_light_onTertiary,
    tertiaryContainer = md_theme_light_tertiaryContainer,
    onTertiaryContainer = md_theme_light_onTertiaryContainer,
    error = md_theme_light_error,
    errorContainer = md_theme_light_errorContainer,
    onError = md_theme_light_onError,
    onErrorContainer = md_theme_light_onErrorContainer,
    background = md_theme_light_background,
    onBackground = md_theme_light_onBackground,
    surface = md_theme_light_surface,
    onSurface = md_theme_light_onSurface,
    surfaceVariant = md_theme_light_surfaceVariant,
    onSurfaceVariant = md_theme_light_onSurfaceVariant,
    outline = md_theme_light_outline,
    inverseOnSurface = md_theme_light_inverseOnSurface,
    inverseSurface = md_theme_light_inverseSurface,
    inversePrimary = md_theme_light_inversePrimary,
    surfaceTint = md_theme_light_surfaceTint,
    outlineVariant = md_theme_light_outlineVariant,
    scrim = md_theme_light_scrim,
)

val DarkColorScheme = darkColorScheme(
    primary = md_theme_dark_primary,
    onPrimary = md_theme_dark_onPrimary,
    primaryContainer = md_theme_dark_primaryContainer,
    onPrimaryContainer = md_theme_dark_onPrimaryContainer,
    secondary = md_theme_dark_secondary,
    onSecondary = md_theme_dark_onSecondary,
    secondaryContainer = md_theme_dark_secondaryContainer,
    onSecondaryContainer = md_theme_dark_onSecondaryContainer,
    tertiary = md_theme_dark_tertiary,
    onTertiary = md_theme_dark_onTertiary,
    tertiaryContainer = md_theme_dark_tertiaryContainer,
    onTertiaryContainer = md_theme_dark_onTertiaryContainer,
    error = md_theme_dark_error,
    errorContainer = md_theme_dark_errorContainer,
    onError = md_theme_dark_onError,
    onErrorContainer = md_theme_dark_onErrorContainer,
    background = md_theme_dark_background,
    onBackground = md_theme_dark_onBackground,
    surface = md_theme_dark_surface,
    onSurface = md_theme_dark_onSurface,
    surfaceVariant = md_theme_dark_surfaceVariant,
    onSurfaceVariant = md_theme_dark_onSurfaceVariant,
    outline = md_theme_dark_outline,
    inverseOnSurface = md_theme_dark_inverseOnSurface,
    inverseSurface = md_theme_dark_inverseSurface,
    inversePrimary = md_theme_dark_inversePrimary,
    surfaceTint = md_theme_dark_surfaceTint,
    outlineVariant = md_theme_dark_outlineVariant,
    scrim = md_theme_dark_scrim,
)

@Composable
fun KernelSUTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    val systemUiController = rememberSystemUiController()
    SideEffect {
        systemUiController.setStatusBarColor(
            color = colorScheme.surface,
            darkIcons = !darkTheme
        )

        // To match the App Navbar color
        systemUiController.setNavigationBarColor(
            color = colorScheme.surfaceColorAtElevation(8.dp),
            darkIcons = !darkTheme,
        )
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}
