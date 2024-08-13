package com.example.newsapp.presentation.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.ViewModelProvider
import com.example.newsapp.data.ArticleRepositoryImpl
import com.example.newsapp.data.RetrofitClient
import com.example.newsapp.presentation.ArticleViewModel
import com.example.newsapp.presentation.ArticleViewModelFactory
import com.example.newsapp.ui.theme.NewsAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NewsAppTheme {
                // Create the repository
                val repository = ArticleRepositoryImpl(RetrofitClient.apiService)

                // Create the ViewModel using ViewModelProvider and factory
                val articleViewModel = ViewModelProvider(
                    this,
                    ArticleViewModelFactory(repository)
                ).get(ArticleViewModel::class.java)

                // Display the list of articles
                ArticleListScreen(viewModel = articleViewModel)
            }
        }
    }
}
