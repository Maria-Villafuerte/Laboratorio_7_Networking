package com.example.laboratorio_7_networking.Pantallas.Filtrado_por_Categorias.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.laboratorio_7_Networking2.Networking.Response.FilterResponse
import com.example.laboratorio_7_Networking2.Networking.Response.MealResponse
import com.example.laboratorio_7_Networking2.Pantallas.Filtrado_por_Categorias.viewmodel.MealsListsViewModel
import com.example.laboratorio_7_Networking2.ui.theme.Laboratorio_7_Networking21Theme
import com.example.story_laboratorio6_navegacion.Navigation.AppBar



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun filtrado_por_catogoria(navController: NavController = rememberNavController()) {
    val viewModel: MealsListsViewModel = viewModel()
    val rememberedMeals: MutableState<List<FilterResponse>> = remember { mutableStateOf(emptyList<FilterResponse>()) }
    viewModel.getMeals_1 { response ->
        val mealsFromTheApi = response?.filtros
        rememberedMeals.value = mealsFromTheApi.orEmpty()
    }

    Column() {
        AppBar(title = "Recetas Catogorias", navController = navController)
        LazyColumn {
            items(rememberedMeals.value) { meal ->
                Row() {
                    Text(text = meal.name,
                        modifier = Modifier .padding(end = 30.dp))
                    Text(text = meal.id)

                }

            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun Filtrado_Preview_filtro() {

    Laboratorio_7_Networking21Theme {
       filtrado_por_catogoria()
    }
}

