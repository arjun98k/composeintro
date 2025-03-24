package com.example.composeintro

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.composeintro.ui.theme.ComposeintroTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
               Text(text =" arjun")
        }
    }
}
@Composable
fun Sayhii(name:String){
    Text(text = "hello $name")
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewFunction(name: String = "arjun") {
    Text(text = "hello $name")
}

