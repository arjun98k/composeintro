package com.example.composeintro

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
@Preview(showBackground = true)
fun previewItem() {
    Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
        getCategories().map { item -> Blogcategory(item.img, item.title, item.subtitle) }
    }
}

@Composable
fun Blogcategory(img: Int, title: String, subtitle: String) {
    Card(
        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
        modifier = Modifier.padding(8.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(8.dp)
        ) {
            Image(
                painter = painterResource(id = img),
                contentDescription = null,
                modifier = Modifier
                    .size(48.dp) // Set image size for proper spacing
                    .padding(end = 8.dp) // Space between image and text
            )

            Column(modifier = Modifier.weight(1f)) { // Let Column take remaining space
                Text(text = title, fontWeight = FontWeight.Bold)
                Text(text = subtitle, fontWeight = FontWeight.Thin, fontSize = 12.sp)
            }
        }
    }
}

data class Category(val img: Int, val title: String, val subtitle: String)
fun getCategories(): MutableList<Category> {
var list = mutableListOf<Category>()
    list.add(Category(img = R.drawable.contacticon, title = "Arjun", subtitle = "Andro Developer"))
    list.add(Category(img = R.drawable.contacticon, title = "Adithya", subtitle = "web Developer"))
    list.add(Category(img = R.drawable.contacticon, title = "panda", subtitle = "ror Developer"))
    list.add(Category(img = R.drawable.contacticon, title = "shrija", subtitle = "mobile Developer"))
    list.add(Category(img = R.drawable.contacticon, title = "mohit", subtitle = "devops Developer"))
    list.add(Category(img = R.drawable.contacticon, title = "ranjit", subtitle = "Ai Developer"))
    list.add(Category(img = R.drawable.contacticon, title = "Arjun", subtitle = "Andro Developer"))
    list.add(Category(img = R.drawable.contacticon, title = "Adithya", subtitle = "web Developer"))
    list.add(Category(img = R.drawable.contacticon, title = "panda", subtitle = "ror Developer"))
    list.add(Category(img = R.drawable.contacticon, title = "shrija", subtitle = "mobile Developer"))
    list.add(Category(img = R.drawable.contacticon, title = "mohit", subtitle = "devops Developer"))
    list.add(Category(img = R.drawable.contacticon, title = "ranjit", subtitle = "Ai Developer"))
    list.add(Category(img = R.drawable.contacticon, title = "Arjun", subtitle = "Andro Developer"))
    list.add(Category(img = R.drawable.contacticon, title = "Adithya", subtitle = "web Developer"))
    list.add(Category(img = R.drawable.contacticon, title = "panda", subtitle = "ror Developer"))
    list.add(Category(img = R.drawable.contacticon, title = "shrija", subtitle = "mobile Developer"))
    return list
}