package pe.isil.easyvet.features.home.presentation

import pe.isil.easyvet.features.home.domain.model.Product

data class HomeUiState(
    val products: List<Product> = emptyList(),
    val isLoading: Boolean = false,
    val message: String? = null
)