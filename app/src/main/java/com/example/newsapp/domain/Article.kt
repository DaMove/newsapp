package com.example.newsapp.domain

data class Article (
    val title:String,
    val description:String,
    val urlToImage:String
)

data class ArticleList(
    var articles:List<Article>
)


