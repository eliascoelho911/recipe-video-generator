package com.github.eliascoelho911.recipevideogenerator.repository

import com.github.eliascoelho911.recipevideogenerator.retrofit.RetrofitSearch
import com.github.eliascoelho911.recipevideogenerator.retrofit.callback.Callback
import com.github.eliascoelho911.recipevideogenerator.retrofit.dto.ImageSearchResponse
import com.github.eliascoelho911.recipevideogenerator.retrofit.dto.RecipeSearchResponse

class SearchRepository(retrofitSearch: RetrofitSearch = RetrofitSearch()) {
    private val searchService = retrofitSearch.searchService

    fun searchImages(value: String, callback: Callback<ImageSearchResponse>) {
        searchService.searchImage(value).enqueue(callback)
    }

    fun searchRecipes(value: String, limit: Int = 5, callback: Callback<RecipeSearchResponse>) {
        searchService.searchRecipes(value, limit).enqueue(callback)
    }
}