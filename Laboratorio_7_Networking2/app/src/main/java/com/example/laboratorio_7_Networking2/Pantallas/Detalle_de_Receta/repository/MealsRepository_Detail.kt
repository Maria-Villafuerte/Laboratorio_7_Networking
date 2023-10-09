package com.example.laboratorio_7_Networking2.Pantallas.Detalle_de_Receta.repository

import com.example.laboratorio_7_Networking2.Networking.MealsWebService
import com.example.laboratorio_7_Networking2.Networking.Response.DetailsListResponse
import com.example.laboratorio_7_Networking2.Networking.Response.MealListResponse
import com.example.laboratorio_7_Networking2.Networking.Response.MealsCategoriesResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MealsRepository_Detail(private val webService: MealsWebService = MealsWebService()) {
    fun getMeals_2(successCallback: (response: DetailsListResponse?) -> Unit) {
        return webService.getMeals_2().enqueue(object : Callback<DetailsListResponse> {
            override fun onResponse(
                call: Call<DetailsListResponse>,
                response: Response<DetailsListResponse>
            ) {
                if (response.isSuccessful)
                    successCallback(response.body())
            }

            override fun onFailure(call: Call<DetailsListResponse>, t: Throwable) {
                // TODO treat failure
            }
        })
    }

}

