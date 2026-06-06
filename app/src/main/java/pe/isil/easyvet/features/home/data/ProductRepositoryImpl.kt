package pe.isil.easyvet.features.home.data

import pe.isil.easyvet.features.home.domain.model.Product
import pe.isil.easyvet.features.home.domain.repositories.ProductRepository

class ProductRepositoryImpl: ProductRepository {
    override fun getProducts(): List<Product> {
        //se sobreescribe el métod0 creado en la interfaz ProductRepository
        return listOf(
            Product(
                id = 1,
                name = "Royal Canin Maxi Puppy",
                description = "Dry food for large breed puppies. Supports bone growth and digestive health.",
                image = "https://i.imgur.com/WkZEOU6.png",
                price = 29.99,
                isFavorite = false
            ),
            Product(
                id = 2,
                name = "Eukanuba Active Adult",
                description = "Complete nutrition with high-quality proteins for active adult dogs.",
                image = "https://i.imgur.com/guSk1sh.png",
                price = 9.99,
                isFavorite = false
            ),
            Product(
                id = 3,
                name = "Whiskas Adult Chicken Flavor",
                description = "Crunchy kibbles with chicken flavor for adult cats. Rich in vitamins and minerals.",
                image = "https://i.imgur.com/dRC9dEB.png",
                price = 49.99,
                isFavorite = false
            )
        )
    }
}