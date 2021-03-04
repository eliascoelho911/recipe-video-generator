package com.github.eliascoelho911.recipevideogenerator.retrofit

import com.github.eliascoelho911.recipevideogenerator.retrofit.service.SearchService
import okhttp3.HttpUrl
import okhttp3.HttpUrl.Companion.toHttpUrl
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import okhttp3.logging.HttpLoggingInterceptor.Level.BODY
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitSearch(baseUrl: HttpUrl = "https://www.googleapis.com/customsearch/v1/".toHttpUrl()) {
    private val retrofit: Retrofit
    val searchService: SearchService

    init {
        val client = client()
        retrofit = Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .client(client)
            .build()
        searchService = retrofit.create(SearchService::class.java)
    }

    private fun client(): OkHttpClient {
        return OkHttpClient.Builder()
            .addInterceptor(HttpLoggingInterceptor().apply { level = BODY })
            .addInterceptor {
                val originalRequest = it.request()
                val url = originalRequest.url.newBuilder()
                    .addQueryParameter("key", "AIzaSyAlPPNcWqvtlxDK3MqXfAv2yHsS__gFUQs")
                    .build()
                val request = originalRequest.newBuilder()
                    .header("X-Goog-FieldMask", "items")
                    .url(url)
                    .build()
                it.proceed(request)
            }
            .build()
    }
}