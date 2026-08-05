package com.example.notifyhub.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.notifyhub.model.AppNotification
import com.example.notifyhub.ui.components.NotificationCard

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
