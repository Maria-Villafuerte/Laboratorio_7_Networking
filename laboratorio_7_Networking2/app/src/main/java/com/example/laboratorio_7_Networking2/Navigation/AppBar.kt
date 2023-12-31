package com.example.story_laboratorio6_navegacion.Navigation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.material.icons.rounded.DateRange
import androidx.compose.material.icons.rounded.Face
import androidx.compose.material.icons.rounded.Info
import androidx.compose.material.icons.rounded.Star
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import om.example.story_laboratorio6_navegacion_1.Navigation.NavigationState

@ExperimentalMaterial3Api
@Composable
fun AppBar(title: String, navController: NavController) {
    TopAppBar(
        title = {
            Text(
                title,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
        },
        navigationIcon = {
            IconButton(onClick = { navController.navigateUp() }) {
                Icon(
                    imageVector = Icons.Rounded.ArrowBack,
                    contentDescription = "Localized description"
                )
            }

        },
        actions = {
            IconButton(onClick = { navController.navigate(route = NavigationState.detalles.route) }) {
                Icon(
                    imageVector = Icons.Filled.Favorite,
                    contentDescription = "Localized description"
                )
            }
            //Conciertos
            IconButton(onClick = { navController.navigate(route = NavigationState.listado.route) }) {
                Icon(
                    imageVector = Icons.Rounded.DateRange,
                    contentDescription = "Localized description"
                )
            }
            //Detalle
            IconButton(onClick = { navController.navigate(route = NavigationState.filtrado.route)}) {
                Icon(
                    imageVector = Icons.Rounded.Info,
                    contentDescription = "Localized description"
                )
            }
        }
    )
}