package com.example.laboratorio_7_Networking2.Pantallas.Filtrado_por_Categorias.repository

import com.example.laboratorio_7_Networking2.Networking.MealsWebService
import com.example.laboratorio_7_Networking2.Networking.Response.MealListResponse
import com.example.laboratorio_7_Networking2.Networking.Response.MealsCategoriesResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MealsRepository_list(private val webService: MealsWebService = MealsWebService()) {
    fun getMeals_1(successCallback: (response: MealListResponse?) -> Unit) {
        return webService.getMeals_1().enqueue(object : Callback<MealListResponse> {
            override fun onResponse(
                call: Call<MealListResponse>,
                response: Response<MealListResponse>
            ) {
                if (response.isSuccessful)
                    successCallback(response.body())
            }

            override fun onFailure(call: Call<MealListResponse>, t: Throwable) {
                // TODO treat failure
            }
        })
    }

}

