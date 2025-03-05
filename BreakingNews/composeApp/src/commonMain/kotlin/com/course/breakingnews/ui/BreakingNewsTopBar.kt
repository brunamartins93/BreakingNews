package com.course.breakingnews.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import breakingnews.composeapp.generated.resources.Res
import breakingnews.composeapp.generated.resources.breaking_news_logo
import org.jetbrains.compose.resources.painterResource

@Composable
fun BreakingNewsTopBar(
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .padding(top=50.dp, start=16.dp, end=16.dp, bottom = 16.dp)
            .height(56.dp)
    ) {
        Image(
            painter = painterResource(Res.drawable.breaking_news_logo),
            contentDescription = "Logo Breaking News",
            modifier = modifier.align(Alignment.Center).height(56.dp)
        )

        Row(
            modifier = modifier
                .padding(start=16.dp, end=16.dp)
                .align(Alignment.CenterEnd)
                .clickable { onClick.invoke() }
        ) {
            Icon(
                imageVector = Icons.Filled.Info,
                contentDescription = "Ícone info responsável por navegar para página About",
                tint = Color.Black
            )
        }
    }
}