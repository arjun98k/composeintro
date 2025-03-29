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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.composeintro.ui.theme.ComposeintroTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
               Text(text ="hello arjun")
        }
    }
}


@Preview(showBackground = true, widthDp = 300 , heightDp = 500 )
@Composable
private fun PreviewFunction() {
    Text(text = "hello Arjun", fontSize = 36.sp, fontWeight =FontWeight.Bold,
        color = Color.Blue
        )
}

