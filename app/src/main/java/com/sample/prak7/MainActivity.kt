package com.sample.prak7

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.sample.prak7.ui.theme.Prak7Theme
import com.sample.prak7.view.uicontroller.SiswaApp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Prak7Theme {
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    SiswaApp(modifier = Modifier)
                }
            }
        }
    }
}