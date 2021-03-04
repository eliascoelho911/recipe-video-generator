package com.github.eliascoelho911.recipevideogenerator.retrofit.service

import com.github.eliascoelho911.recipevideogenerator.retrofit.dto.ImageSearchResponse
import com.github.eliascoelho911.recipevideogenerator.retrofit.dto.RecipeSearchResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface SearchService {
    @GET("?searchType=image&cx=c9552c06cb4ea407f&imgSize=xlarge")
    fun searchImage(@Query("q") value: String) : Call<ImageSearchResponse>
    @GET("?cx=d67a43732a13f72a9")
    fun searchRecipes(@Query("q") value: String, @Query("num") limit: Int) : Call<RecipeSearchResponse>
}