package com.studio.malika.api

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by Ilyasa Ridho
on 08,June,2021
 */
class ApiConfig {
    companion object{
        fun getApiSevice(): ApiService{
            val loggingInterceptor =
                HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
            val client = OkHttpClient.Builder()
                .addInterceptor(loggingInterceptor)


                .build()
            val retrofit = Retrofit.Builder()
                .baseUrl("https://asia-southeast2-virtual-ellipse-312809.cloudfunctions.net/app/api/v1/")
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build()
            return  retrofit.create(ApiService::class.java)

    }
}

}