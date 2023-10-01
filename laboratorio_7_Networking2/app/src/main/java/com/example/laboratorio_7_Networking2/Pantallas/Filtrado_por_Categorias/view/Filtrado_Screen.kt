package com.example.laboratorio_7_networking.Pantallas.Filtrado_por_Categorias.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.laboratorio_7_Networking2.ui.theme.Laboratorio_7_Networking21Theme
import com.example.story_laboratorio6_navegacion.Navigation.AppBar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun filtrado_por_catogoria(navController: NavController = rememberNavController()) {
    Column() {
        AppBar(title = "Recetas Catogorias", navController = navController)
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
        ) {
            item(span = { GridItemSpan(maxLineSpan) }){
                Text(text = "Filtrado", fontSize = 18.sp,
                    modifier = Modifier.padding(start = 20.dp, bottom = 5.dp))
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Filtrado_Preview() {
    Laboratorio_7_Networking21Theme {
        filtrado_por_catogoria()
    }
}