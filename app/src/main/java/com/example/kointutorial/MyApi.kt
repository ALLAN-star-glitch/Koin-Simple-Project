package com.example.kointutorial

import retrofit2.http.GET

interface MyApi {


    @GET("myEndpoint")
    fun callApi(){

    }
}