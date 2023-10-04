package com.example.laboratorio_7_Networking2.Pantallas.Listado_de_Categorias.viewmodel

import androidx.lifecycle.ViewModel
import com.example.laboratorio_7_Networking2.Networking.Response.MealsCategoriesResponse
import com.example.laboratorio_7_Networking2.Pantallas.Listado_de_Categorias.repository.MealsRepository

class MealsCategoriesViewModel (private val repository: MealsRepository = MealsRepository()): ViewModel() {
    fun getMeals(successCallback: (response: MealsCategoriesResponse?) -> Unit) {
        repository.getMeals { response ->
            successCallback(response)
        }
    }
}