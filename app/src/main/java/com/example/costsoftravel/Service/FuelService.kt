package com.example.costsoftravel.Service

import com.example.costsoftravel.Entity.FuelEntity
import retrofit2.Call
import retrofit2.http.GET

interface FuelService {
    @GET("api/precos")
    fun getFuelBrazil(): Call<FuelEntity>
}