package com.example.laboratorio_7_Networking2.Networking

import android.content.ContentValues.TAG
import android.util.Log
import com.example.laboratorio_7_Networking2.Networking.Response.DetailsListResponse
import com.example.laboratorio_7_Networking2.Networking.Response.MealListResponse
import com.example.laboratorio_7_Networking2.Networking.Response.MealsCategoriesResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class MealsWebService {

    private lateinit var api: MealsApi

    init {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://www.themealdb.com/api/json/v1/1/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        api = retrofit.create(MealsApi::class.java)
    }

    fun getMeals_2(): Call<DetailsListResponse> {
        return api.getMeals_2()
    }

    fun getMeals(): Call<MealsCategoriesResponse> {
        return api.getMeals()
    }

    fun getMeals_1(): Call<MealListResponse> {
        return api.getMeals_1()
    }

}

