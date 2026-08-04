package com.example.notifyhub.model

data class AppNotification(
    val appName: String,
    val title: String,
    val message: String,
    val timestamp: Long,
    val isRead: Boolean,
    val packageName: String
)