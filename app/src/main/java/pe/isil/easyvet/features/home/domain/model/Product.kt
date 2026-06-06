package pe.isil.easyvet.features.home.domain.model

data class Product(
    val id: Int,
    val name: String,
    val description: String,
    val image: String,
    val price: Double,
    val isFavorite: Boolean
)