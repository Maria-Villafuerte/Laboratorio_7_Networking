package com.example.laboratorio_7_Networking2.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.laboratorio_7_networking.Pantallas.Detalle_de_Receta.view.detalle_de_receta
import com.example.laboratorio_7_networking.Pantallas.Filtrado_por_Categorias.view.filtrado_por_catogoria
import com.example.laboratorio_7_networking.Pantallas.Listado_de_Categorias.view.listado_de_categorias
import om.example.story_laboratorio6_navegacion_1.Navigation.NavigationState

@Composable
fun Navigation_confi(navController: NavController) {
    val navController = rememberNavController()
    NavHost(navController = navController,
        startDestination = NavigationState.listado.route) {
        composable(route = NavigationState.detalles.route) {
            detalle_de_receta(navController)
        }
        composable(route = NavigationState.detalles.route) {
            detalle_de_receta(navController)
        }
        composable(route = NavigationState.listado.route) {
            listado_de_categorias(navController)
        }
    }
}