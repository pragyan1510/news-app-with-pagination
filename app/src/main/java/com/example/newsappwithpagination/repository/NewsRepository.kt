package com.example.newsappwithpagination.repository

import NewsAPIService

import androidx.paging.Pager
import androidx.paging.PagingConfig
import com.example.newsappwithpagination.Pagination.NewsPagingSource
import com.example.newsappwithpagination.models.Article

class NewsRepository(private val apiService: NewsAPIService) {

    fun getNews(): Pager<Int, Article> {
        return Pager(
            config = PagingConfig(
                pageSize = 10,
                initialLoadSize = 20, // Loads more initially for better UX
                enablePlaceholders = false
            ),
            pagingSourceFactory = { NewsPagingSource(apiService) }
        )
    }
}
