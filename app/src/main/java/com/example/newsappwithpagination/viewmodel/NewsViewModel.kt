package com.example.newsappwithpagination.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.cachedIn
import com.example.newsappwithpagination.Network.RetrofitInstance
import com.example.newsappwithpagination.repository.NewsRepository

class NewsViewModel : ViewModel() {
    private val repository = NewsRepository(RetrofitInstance.api)

    val newsPagerFlow = repository.getNews().flow.cachedIn(viewModelScope)

}