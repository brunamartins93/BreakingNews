package com.course.breakingnews

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.course.breakingnews.ui.BreakingNewsCard
import com.course.breakingnews.ui.BreakingNewsTopBar
import com.course.breakingnews.ui.DetailsContentSection
import com.course.breakingnews.ui.DetailsHeaderSection

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge(
            statusBarStyle = SystemBarStyle.light(
                android.graphics.Color.TRANSPARENT,
                android.graphics.Color.TRANSPARENT
            ),
            navigationBarStyle = SystemBarStyle.light(
                android.graphics.Color.TRANSPARENT,
                android.graphics.Color.TRANSPARENT,
            )
        )

        setContent {
            App()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ComponentPreview() {
    //BreakingNewsTopBar(onClick = {})
    //BreakingNewsCard(
        //title = "Teste teste teste",
        //author = "Bruna",
        //date="04 Março 2025")
    //DetailsHeaderSection(onClick = {})
    DetailsContentSection(
        content = """
                        LOREM IPSUM LOREM IPSUM LOREM IPSUM LOREM IPSUM LOREM IPSUM LOREM IPSUM 
                        
                        LOREM IPSUM LOREM IPSUM LOREM IPSUM LOREM IPSUM LOREM IPSUM LOREM IPSUM 
                        LOREM IPSUM LOREM IPSUM LOREM IPSUM LOREM IPSUM LOREM IPSUM LOREM IPSUM 
                        
                        LOREM IPSUM LOREM IPSUM LOREM IPSUM LOREM IPSUM LOREM IPSUM 
                    """.trimIndent()
    )

}

@Preview
@Composable
fun AppAndroidPreview() {
    App()
}