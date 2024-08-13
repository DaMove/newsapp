package com.example.newsapp.data

import com.example.newsapp.domain.Article
import com.example.newsapp.domain.ArticleRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class ArticleRepositoryImpl(private val apiService: ArticleApiService) : ArticleRepository {
    override fun getArticles(): Flow<List<Article>> = flow {
        try {
            val articleList = apiService.getArticles()
            emit(articleList.articles)
        } catch (e: Exception) {
            // Handle error
            throw Exception("Failed to fetch articles: ${e.message}", e)
        }
    }
}
