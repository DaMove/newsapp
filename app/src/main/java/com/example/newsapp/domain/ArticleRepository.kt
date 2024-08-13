package com.example.newsapp.domain

import kotlinx.coroutines.flow.Flow

interface ArticleRepository {

    fun getArticles(): Flow<List<Article>>
}