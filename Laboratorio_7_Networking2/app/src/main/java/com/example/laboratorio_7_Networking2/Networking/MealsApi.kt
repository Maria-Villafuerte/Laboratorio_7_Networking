package com.example.laboratorio_7_Networking2.Networking


import com.example.laboratorio_7_Networking2.Networking.Response.MealListResponse_list
import com.example.laboratorio_7_Networking2.Networking.Response.MealsCategoriesResponse
import retrofit2.Call
import retrofit2.http.GET


interface MealsApi {
    @GET("categories.php")
    fun getMeals(): Call<MealsCategoriesResponse>

    @GET("categories.php")
    fun getMeals_1(): Call<MealListResponse_list>

}

//MealsWebService_2