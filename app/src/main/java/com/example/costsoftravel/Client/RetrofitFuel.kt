package com.example.costsoftravel.Client

import com.example.costsoftravel.Service.FuelService
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitFuel private constructor() {
    companion object {
        private lateinit var instance: Retrofit

        private fun getRetrofitInstance(): Retrofit {
            val httpClient = OkHttpClient.Builder()
            synchronized(this) {
                if (!::instance.isInitialized) {
                    instance = Retrofit.Builder()
                        .client(httpClient.build())
                        .baseUrl("https://combustivelapi.com.br/")
                        .addConverterFactory(GsonConverterFactory.create())
                        .build()

                }
            }
            return instance
        }

        fun createFuelService(): FuelService {
            return getRetrofitInstance().create(FuelService::class.java)
        }
    }
}