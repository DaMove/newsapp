package com.example.newsapp.data

import com.example.newsapp.domain.ArticleList
import retrofit2.http.GET

interface ArticleApiService {

    @GET("everything?q=tesla&from=2024-07-13&sortBy=publishedAt&pageSize=10&apiKey=5f7180704d5b4a8f9eafe4c8ecd6c931")
    suspend fun getArticles(): ArticleList
}