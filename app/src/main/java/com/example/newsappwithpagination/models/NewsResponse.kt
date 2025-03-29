package com.example.newsappwithpagination.models

data class NewsResponse(
    val articles: List<Article>
)

data class Article(
    val title: String,
    val description: String?,
    val image : String?
)