package com.example.laboratorio_7_Networking2.Networking


import com.example.laboratorio_7_Networking2.Networking.Response.DetailsListResponse
import com.example.laboratorio_7_Networking2.Networking.Response.MealListResponse
import com.example.laboratorio_7_Networking2.Networking.Response.MealsCategoriesResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


interface MealsApi {
    @GET("categories.php")
    fun getMeals(): Call<MealsCategoriesResponse>

    @GET("filter.php?c=Seafood")
    fun getMeals_1(): Call<MealListResponse>

    @GET("lookup.php?i=52772")
    fun getMeals_2(): Call<DetailsListResponse>

}

//MealsWebService_2