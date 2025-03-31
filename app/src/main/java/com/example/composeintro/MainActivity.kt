package com.example.composeintro

import android.inputmethodservice.Keyboard.Row
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            UserInputScreen()
            preview()
        }
    }
}

//@Composable
//fun UserInputScreen() {
//    var text by remember { mutableStateOf("") } // Remember state
//
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .padding(16.dp)
//    ) {
//        TextField(
//            value = text,
//            onValueChange = { text = it },
//            label = { Text("Enter your name") },
//            modifier = Modifier.fillMaxWidth()
//        )
//
//        Spacer(modifier = Modifier.height(16.dp))
//
//        Text(text = "You entered: $text", style = MaterialTheme.typography.bodyLarge)
//    }
//}

@Composable
@Preview(showBackground = true, widthDp = 300, heightDp = 500)
private  fun preview(){
    ListViewItem()
}
@Composable
fun ListViewItem(){
    Row {
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = null
        )
        Modifier.size(50.dp)

        Column {
         Text(

             text = "Arjun", fontWeight = FontWeight.Bold

         )
            Text(text = "Android Developer",
                fontWeight = FontWeight.ExtraBold,
                fontSize = 12.sp
            )
        }
    }
}

