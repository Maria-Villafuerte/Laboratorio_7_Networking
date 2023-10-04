package com.example.laboratorio_7_networking.Pantallas.Listado_de_Categorias.view

import androidx.compose.foundation.layout.Column
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
import com.example.laboratorio_7_Networking2.Networking.Response.MealResponse
import com.example.laboratorio_7_Networking2.Pantallas.Listado_de_Categorias.viewmodel.MealsCategoriesViewModel
import com.example.laboratorio_7_Networking2.ui.theme.Laboratorio_7_Networking21Theme
import com.example.story_laboratorio6_navegacion.Navigation.AppBar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun listado_de_categorias(navController: NavController = rememberNavController()) {
    val viewModel: MealsCategoriesViewModel = viewModel()
    val rememberedMeals: MutableState<List<MealResponse>> = remember { mutableStateOf(emptyList<MealResponse>()) }

    viewModel.getMeals { response ->
        val mealsFromTheApi = response?.categories
        rememberedMeals.value = mealsFromTheApi.orEmpty()
    }

    Column() {
        AppBar(title = "Recetas Listado", navController = navController)
        LazyColumn {
            items(rememberedMeals.value) { meal ->
                Text(text = meal.name)
            }
        }
    }



}

@Preview(showBackground = true)
@Composable
fun Filtrado_Preview() {
    Laboratorio_7_Networking21Theme {
        listado_de_categorias()
    }
}