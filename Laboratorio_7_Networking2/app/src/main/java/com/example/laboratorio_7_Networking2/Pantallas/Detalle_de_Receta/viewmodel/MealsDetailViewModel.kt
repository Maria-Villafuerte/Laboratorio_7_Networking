package com.example.laboratorio_7_Networking2.Pantallas.Detalle_de_Receta.viewmodel

import androidx.lifecycle.ViewModel
import com.example.laboratorio_7_Networking2.Networking.Response.DetailsListResponse
import com.example.laboratorio_7_Networking2.Networking.Response.MealListResponse
import com.example.laboratorio_7_Networking2.Networking.Response.MealsCategoriesResponse
import com.example.laboratorio_7_Networking2.Pantallas.Detalle_de_Receta.repository.MealsRepository_Detail
import com.example.laboratorio_7_Networking2.Pantallas.Filtrado_por_Categorias.repository.MealsRepository_list
import com.example.laboratorio_7_Networking2.Pantallas.Listado_de_Categorias.repository.MealsRepository


class MealsDetailViewModel (private val repository: MealsRepository_Detail = MealsRepository_Detail()): ViewModel() {
    fun getMeals_2( successCallback:(response: DetailsListResponse?) -> Unit) {
        repository.getMeals_2() { response ->
            successCallback(response)
        }
    }

}

