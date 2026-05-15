package pe.isil.easyvet

enum class MainTab(
//enum sirve para crear casos definidos, acá son Home y Favorites
//esta clase contiene atributos que se le asignarán con valores a los casos de abajo
    val label: String,
    val filledIcon: Int,
    val outlinedIcon: Int
) {
    Home(
        label = "Home",
        filledIcon = R.drawable.home_filled,
        outlinedIcon = R.drawable.home_outline
    ),

    Favorites(
        label = "Favorites",
        filledIcon = R.drawable.favorite_filled,
        outlinedIcon = R.drawable.favorite_outlined
    )
}