package com.example.notifyhub.ui.components

import android.R.attr.top
import android.app.Notification
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.notifyhub.model.AppNotification

@Composable
fun NotificationCard(notification: AppNotification){







    Card(modifier = Modifier.fillMaxWidth()){
        Column(modifier = Modifier.padding(20.dp)) {

            Text(

                text=notification.appName,
                fontWeight= FontWeight.Bold,

            )
            Text(
                text=notification.title
            )
            Text(
                text = notification.message
            )

        }
    }
}