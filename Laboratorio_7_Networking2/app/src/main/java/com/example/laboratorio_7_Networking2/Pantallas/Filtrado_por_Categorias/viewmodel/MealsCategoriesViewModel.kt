package com.example.laboratorio_7_Networking2.Pantallas.Filtrado_por_Categorias.viewmodel

import androidx.lifecycle.ViewModel
import com.example.laboratorio_7_Networking2.Networking.Response.MealsCategoriesResponse
import com.example.laboratorio_7_Networking2.Pantallas.Filtrado_por_Categorias.repository.MealsRepository_list
import com.example.laboratorio_7_Networking2.Pantallas.Listado_de_Categorias.repository.MealsRepository

class MealsCategoriesViewModel (private val repository: MealsRepository_list = MealsRepository_list()): ViewModel() {
    fun getMeals(successCallback: (response: MealsCategoriesResponse?) -> Unit) {
        repository.getMeals { response ->
            successCallback(response)
        }
    }
}