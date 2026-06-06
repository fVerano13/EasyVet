package pe.isil.easyvet.features.home.domain.repositories

import pe.isil.easyvet.features.home.domain.model.Product

interface ProductRepository {
    fun getProducts(): List<Product>
    //se crea un métod0 vacío que no recibe parámetros y retorna una lista de Product
}