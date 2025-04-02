package com.example.composeintro

import android.inputmethodservice.Keyboard.Row
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
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
//
            UserProfile()
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

    Row(
        modifier = Modifier
            .fillMaxHeight()
            .background(Color.Yellow) // Set background color
            .padding(8.dp) // Add padding if needed
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = null,
            modifier = Modifier.size(50.dp) // Correct placement of size modifier
        )

        Column(
            modifier = Modifier.padding(start = 8.dp) // Space between image and text
        ) {
            Text(
                text = "Arjun",
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "Android Developer",
                fontWeight = FontWeight.ExtraBold,
                fontSize = 12.sp,
                modifier = Modifier.padding(top = 4.dp)
            )
        }
    }

}


@Composable
@Preview(showBackground = true, widthDp = 300, heightDp = 500)
fun UserProfile() {
    Row(
        modifier = Modifier
            .fillMaxWidth() // Make Row take full width
            .background(Color.LightGray) // Set background color
            .padding(16.dp) // Add padding around the Row
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = "Profile Image",
            modifier = Modifier.size(50.dp) // Set size for Image
        )

        Column(
            modifier = Modifier.padding(start = 8.dp) // Add space between Image and Text
        ) {
            Text(
                text = "Arjun",
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "Android Developer",
                fontWeight = FontWeight.Medium,
                fontSize = 14.sp,
                modifier = Modifier.padding(top = 4.dp) // Space between texts
            )
        }
    }
}


