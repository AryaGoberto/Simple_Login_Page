package com.example.simple_login_page

import androidx.compose.foundation.content.MediaType.Companion.Text
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.simple_login_page.ui.theme.Greens

@Composable
fun HomeScreen() {
    Box(modifier = Modifier.fillMaxSize()){
        Column (modifier = Modifier
            .fillMaxSize()
            .align(Alignment.Center),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Home Screen", fontWeight = FontWeight.Bold, fontSize = 30.sp, color = Greens )

        }
    }
}

@Composable
@Preview(showBackground = true)
fun HomeScreenPreview(modifier: Modifier = Modifier) {
    HomeScreen()
}