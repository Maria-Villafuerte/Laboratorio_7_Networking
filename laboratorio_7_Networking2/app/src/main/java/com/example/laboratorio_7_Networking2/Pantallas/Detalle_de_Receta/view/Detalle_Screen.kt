package com.example.laboratorio_7_networking.Pantallas.Detalle_de_Receta.view

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
import com.example.laboratorio_7_Networking2.Networking.Response.DetailsListResponse
import com.example.laboratorio_7_Networking2.Networking.Response.MealResponse
import com.example.laboratorio_7_Networking2.Networking.Response.detailResponse
import com.example.laboratorio_7_Networking2.Pantallas.Detalle_de_Receta.viewmodel.MealsDetailViewModel
import com.example.laboratorio_7_Networking2.Pantallas.Listado_de_Categorias.viewmodel.MealsCategoriesViewModel
import com.example.laboratorio_7_Networking2.ui.theme.Laboratorio_7_Networking21Theme
import com.example.story_laboratorio6_navegacion.Navigation.AppBar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun detalle_de_receta(navController: NavController = rememberNavController()) {
    val viewModel: MealsDetailViewModel = viewModel()
    val rememberedMeals: MutableState<List<detailResponse>> = remember { mutableStateOf(emptyList<detailResponse>()) }

    viewModel.getMeals_2 { response ->
        val mealsFromTheApi = response?.Detalles
        rememberedMeals.value = mealsFromTheApi.orEmpty()
    }

    Column() {
        AppBar(title = "Recetas Detalle", navController = navController)
        LazyColumn {
            items(rememberedMeals.value) { meal ->
                Row() {
                    Text(text = meal.name,
                        modifier = Modifier .padding(end = 30.dp))
                    Text(text = meal.instructions)

                }

            }
        }
    }


}

@Preview(showBackground = true)
@Composable
fun Filtrado_Preview_Detalle() {
    Laboratorio_7_Networking21Theme{
        detalle_de_receta()
    }
}