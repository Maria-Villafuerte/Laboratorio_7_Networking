package com.example.laboratorio_7_Networking2.Pantallas.Filtrado_por_Categorias.repository

import com.example.laboratorio_7_Networking2.Networking.MealWebServiceList
import com.example.laboratorio_7_Networking2.Networking.MealsWebService
import com.example.laboratorio_7_Networking2.Networking.Response.MealListResponse_list
import com.example.laboratorio_7_Networking2.Networking.Response.MealsCategoriesResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MealsRepository_list(private val webService: MealWebServiceList = MealWebServiceList()) {
    fun getMeals(successCallback: (response: MealListResponse_list?) -> Unit) {
        return webService.getMeals().enqueue(object : Callback<MealListResponse_list> {
            override fun onResponse(
                call: Call<MealListResponse_list>,
                response: Response<MealListResponse_list>
            ) {
                if (response.isSuccessful)
                    successCallback(response.body())
            }

            override fun onFailure(call: Call<MealListResponse_list>, t: Throwable) {
                // TODO treat failure
            }
        })
    }
}