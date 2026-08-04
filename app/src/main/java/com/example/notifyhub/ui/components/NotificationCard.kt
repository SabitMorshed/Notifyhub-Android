package com.example.notifyhub.ui.components

import android.R.attr.top
import android.app.Notification
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.notifyhub.model.AppNotification
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CardDefaults


@Composable
fun NotificationCard(notification: AppNotification){







    Card(modifier = Modifier.fillMaxWidth(), shape = RoundedCornerShape(25.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
        colors = CardDefaults.cardColors(containerColor = if(!notification.isRead){
            Color(0xFFFFFDD0)
        }
        else{
            Color(0xFFE3F2FD)
        })

        ){
        Column(modifier = Modifier.padding(20.dp),
            verticalArrangement = Arrangement.spacedBy(6.dp)) {

            Row(verticalAlignment = Alignment.CenterVertically){
                Text(
                    text=notification.appName,
                    fontWeight= FontWeight.Medium,

                    )
                if(!notification.isRead){
                    Spacer(
                        modifier = Modifier.width(15.dp)
                    )
                    Box(
                        modifier = Modifier
                            .size(9.dp)
                            .background(Color.Red, CircleShape)
                    )
                }


            }






            Text(
                text=notification.title,
                fontWeight=if(!notification.isRead){
                    FontWeight.Bold
                }
                else{
                    FontWeight.SemiBold
                }
            )
            Text(
                text = notification.message,
                fontSize = 14.sp,
                fontWeight=if(!notification.isRead){
                    FontWeight.Bold
                }
                else{
                    FontWeight.Normal
                }

            )



        }
    }
}