package com.iamfiro.slack.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.Chat
import androidx.compose.material.icons.automirrored.outlined.Chat
import androidx.compose.material.icons.filled.Headset
import androidx.compose.material.icons.filled.KeyboardCommandKey
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.outlined.Chat
import androidx.compose.material.icons.outlined.Layers
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Header() {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 2.dp)
    ) {
        Icon(
            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
            contentDescription = null,
            Modifier
                .padding(16.dp)
                .size(24.dp)
        )
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .clip(
                    RoundedCornerShape(14.dp)
                )
                .background(MaterialTheme.colorScheme.onSurface)
                .weight(1f)
                .padding(vertical = 6.dp, horizontal = 8.dp)
        ) {
            Icon(
                imageVector = Icons.Default.KeyboardCommandKey,
                modifier = Modifier.size(22.dp),
                contentDescription = null,
            )
            Column(verticalArrangement = Arrangement.spacedBy(0.dp)) {
                Text("article", style = MaterialTheme.typography.bodyMedium, fontWeight = FontWeight.Bold)
                Text("7,592명의 멤버", style = MaterialTheme.typography.bodySmall, lineHeight = 14.sp)

            }
        }
        Icon(
            imageVector = Icons.Filled.Headset,
            contentDescription = null,
            Modifier
                .padding(16.dp)
                .size(24.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun HeaderPreview() {
    Header()
}