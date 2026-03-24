package com.example.costsoftravel.Helper

data class Analysis(
    val estado_mais_barato_gasolina: StatePrice,
    val estado_mais_caro_gasolina: StatePrice,
    val diferenca_gasolina: String,
    val variacao_percentual_gasolina: String,
    val estado_mais_barato_diesel: StatePrice,
    val estado_mais_caro_diesel: StatePrice,
    val diferenca_diesel: String,
    val variacao_percentual_diesel: String
)