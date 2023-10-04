package com.example.laboratorio_7_Networking2.Networking

import com.example.laboratorio_7_Networking2.Networking.Response.MealListResponse_list
import com.example.laboratorio_7_Networking2.Networking.Response.MealsCategoriesResponse
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MealWebServiceList {

    private lateinit var api: MealsApi

    init {
        val retrofit = Retrofit.Builder()
            .baseUrl(" https://www.themealdb.com/api/json/v1/1/filter.php?c=Seafood")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        api = retrofit.create(MealsApi::class.java)
    }

    fun getMeals(): Call<MealListResponse_list> {
        return api.getMeals_1()
    }

}
