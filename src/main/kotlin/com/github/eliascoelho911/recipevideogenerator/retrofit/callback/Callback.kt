package com.github.eliascoelho911.recipevideogenerator.retrofit.callback

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

private const val FAILURE_MESSAGE = "Unable to communicate with the server"

class Callback<T>(
    private val success: (T) -> Unit,
    private val failure: (error: String) -> Unit
) : Callback<T> {

    override fun onFailure(call: Call<T>, t: Throwable) {
        failure(FAILURE_MESSAGE)
    }

    override fun onResponse(call: Call<T>, response: Response<T>) {
        if (response.isSuccessful) {
            if (response.body() != null) {
                success(response.body()!!)
            }
        } else {
            if (response.code() == 404) {
                failure("404")
            } else {
                failure(FAILURE_MESSAGE)
            }
        }
    }
}