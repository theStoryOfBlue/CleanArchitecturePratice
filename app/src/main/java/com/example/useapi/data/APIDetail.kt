package com.example.useapi.data

import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET
import retrofit2.http.Path

interface APIDetail {

    @GET("/v1/coins/{coin_id}")
    suspend fun getCoinDetail(@Path("coin_id") id: String): CoinInfoDetail

}