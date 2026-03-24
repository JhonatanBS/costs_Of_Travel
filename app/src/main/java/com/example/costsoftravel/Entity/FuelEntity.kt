package com.example.costsoftravel.Entity

import com.example.costsoftravel.Helper.Analysis
import com.example.costsoftravel.Helper.Price
import com.google.gson.annotations.SerializedName

data class FuelEntity(
    @SerializedName("error")
    val error: Boolean,

    @SerializedName("message")
    val message: String,

    @SerializedName("data_coleta")
    val data_coleta: String,

    @SerializedName("fonte")
    val fonte: String,

    @SerializedName("moeda")
    val moeda: String,

    @SerializedName("tempo_execucao_segundos")
    val tempo_execucao_segundos: Double,

    @SerializedName("precos")
    val precos: Price,

    @SerializedName("analise")
    val analise: Analysis
)