package com.example.laboratorio_7_Networking2.Networking.Response

import com.google.gson.annotations.SerializedName


data class MealsCategoriesResponse(val categories: List<MealResponse>)
data class MealListResponse_list(val categories: List<MealResponse_list>)


data class MealResponse(
    @SerializedName("idCategory") val id: String,
    @SerializedName("strCategory") val name: String,
    @SerializedName("strCategoryDescription") val description: String,
    @SerializedName("strCategoryThumb") val imageUrl: String
)

data class MealResponse_list(
    @SerializedName("idMeal\n") val id: String,
    @SerializedName("strMeal") val name: String,
    @SerializedName("strMealThumb") val imageUrl: String
)