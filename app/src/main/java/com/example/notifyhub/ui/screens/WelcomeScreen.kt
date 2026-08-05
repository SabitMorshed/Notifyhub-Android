package com.example.notifyhub.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun WelcomeScreen( onGetStarted: () -> Unit){
    Column(modifier = Modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {

        Text(
            text = "Notifyhub",

            fontSize = 32.sp,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = "All important notifications in one place",
            modifier = Modifier.padding(top =8.dp)
        )


        Button(
            onClick = {
                onGetStarted()
            },
            modifier = Modifier.padding(top =24.dp)
        ){
            Text(
                text="Get Started"
            )
        }


    }
}
