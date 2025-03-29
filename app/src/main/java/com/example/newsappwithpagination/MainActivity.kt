package com.example.newsappwithpagination

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.ViewModelProvider
import com.example.newsappwithpagination.Screens.NewsScreen
import com.example.newsappwithpagination.ui.theme.NewsAppWithPaginationTheme
import com.example.newsappwithpagination.viewmodel.NewsViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val newsViewModel = ViewModelProvider(this).get(NewsViewModel::class.java)

        setContent {
            NewsAppWithPaginationTheme {
                NewsScreen(viewModel = newsViewModel)
            }
        }
    }
}
