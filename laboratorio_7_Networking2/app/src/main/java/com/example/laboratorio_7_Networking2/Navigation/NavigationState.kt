package om.example.story_laboratorio6_navegacion_1.Navigation

sealed class NavigationState(val route: String) {
    object detalles: NavigationState("detalles")
    object filtrado: NavigationState("filtrado")
    object listado: NavigationState("listado")

}