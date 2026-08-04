package com.example.notifyhub

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.notifyhub.model.AppNotification
import com.example.notifyhub.ui.components.NotificationCard
import com.example.notifyhub.ui.theme.NotifyHubTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()
        setContent {

            NotifyHubTheme {
                var showHome by remember {
                    mutableStateOf(false)
                }

                if(showHome){
                    HomeScreen()
                }
                else{
                    WelcomeScreen(
                        onGetStarted = {
                            showHome =true
                        }
                    )
                }
            }
        }
    }
}
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

@Composable
fun HomeScreen(){
    val notifications = listOf(
        AppNotification(
            appName = "WhatsApp",
            title = "John Doe",
            message = "Hey, are we meeting today?",
            timestamp = System.currentTimeMillis(),
            isRead = false,
            packageName = "com.whatsapp"
        ),

        AppNotification(
            appName = "Slack",
            title = "General",
            message = "Sprint meeting starts in 10 minutes.",
            timestamp = System.currentTimeMillis(),
            isRead = true,
            packageName = "com.slack"
        ),

        AppNotification(
            appName = "Instagram",
            title = "Alice",
            message = "liked your photo.",
            timestamp = System.currentTimeMillis(),
            isRead = false,
            packageName = "com.instagram.android"
        )
    )
    LazyColumn( modifier = Modifier.padding( top=50.dp), verticalArrangement = Arrangement.spacedBy(16.dp)) {

        items(notifications) { notification ->
            NotificationCard(notification)
        }
    }
}





