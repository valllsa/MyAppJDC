package com.example.myappjdc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.view.WindowCompat
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myappjdc.ui.theme.MyAppJDCTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // enableEdgeToEdge no es necesario, usa WindowCompat.setDecorFitsSystemWindows
        WindowCompat.setDecorFitsSystemWindows(window, false)
        setContent {
            MyAppJDCTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Valery",
                        ficha = 2902082,
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, ficha: Int, modifier: Modifier = Modifier) {
    Text(
        text = "Nombre: $name - Ficha: $ficha",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyAppJDCTheme {
        Greeting("Valery", ficha = 2902082)
    }
}
