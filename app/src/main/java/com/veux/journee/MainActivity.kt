package com.veux.journee

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.veux.journee.ui.MainApp
import com.veux.journee.ui.theme.JourneeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JourneeTheme {
                MainApp()
            }
        }
    }
}