package com.course.breakingnews.features.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.course.breakingnews.ui.BreakingNewsCard
import com.course.breakingnews.ui.BreakingNewsTopBar

@Composable
fun HomeScreen(
    navigateToAboutScreen: () -> Unit,
    navigateToDetailsScreen: () -> Unit
) {
    HomeContent(
        navigateToAboutScreen = navigateToAboutScreen,
        navigateToDetailsScreen = navigateToDetailsScreen
    )
}

@Composable
fun HomeContent(
    navigateToAboutScreen: () -> Unit,
    navigateToDetailsScreen: () -> Unit
) {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        containerColor = Color.White,
        topBar = {
            BreakingNewsTopBar ( onClick = {navigateToAboutScreen.invoke()} )
        },
        content = { paddingValues ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues),
                horizontalAlignment = Alignment.Start
            ) {
                Text(
                    modifier = Modifier.padding(16.dp),
                    text = "Breaking News",
                    fontSize = 24.sp,
                    fontStyle = FontStyle.Normal,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                    textAlign = TextAlign.Start
                )

                BreakingNewsCard(
                    title = "Teste teste teste teste",
                    author = "Bruna",
                    date = "04/03/2025",
                    onClick = { navigateToDetailsScreen.invoke() }
                )

                BreakingNewsCard(
                    title = "Teste teste teste teste",
                    author = "Bruna",
                    date = "04/03/2025",
                    onClick = { navigateToDetailsScreen.invoke() }
                )
            }

        }
    )
}