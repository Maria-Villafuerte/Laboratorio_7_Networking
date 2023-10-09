package com.example.laboratorio_7_Networking2.Pantallas.Listado_de_Categorias.repository

import com.example.laboratorio_7_Networking2.Networking.MealsWebService
import com.example.laboratorio_7_Networking2.Networking.Response.MealListResponse
import com.example.laboratorio_7_Networking2.Networking.Response.MealsCategoriesResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MealsRepository(private val webService: MealsWebService = MealsWebService()) {
    fun getMeals(successCallback: (response: MealsCategoriesResponse?) -> Unit) {
        return webService.getMeals().enqueue(object : Callback<MealsCategoriesResponse> {
            override fun onResponse(
                call: Call<MealsCategoriesResponse>,
                response: Response<MealsCategoriesResponse>
            ) {
                if (response.isSuccessful)
                    successCallback(response.body())
            }

            override fun onFailure(call: Call<MealsCategoriesResponse>, t: Throwable) {
                // TODO treat failure
            }
        })
    }
}