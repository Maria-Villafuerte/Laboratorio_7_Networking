package com.example.laboratorio_7_Networking2.Networking.Response

import com.google.gson.annotations.SerializedName


data class MealListResponse(val filtros: List<FilterResponse>)



data class FilterResponse(
    @SerializedName("idMeal\n") val id: String,
    @SerializedName("strMeal") val name: String,
    @SerializedName("strMealThumb") val imageUrl: String
)