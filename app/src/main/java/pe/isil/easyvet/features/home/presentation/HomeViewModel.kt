package pe.isil.easyvet.features.home.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import pe.isil.easyvet.features.home.data.ProductRepositoryImpl
import pe.isil.easyvet.features.home.domain.repositories.ProductRepository

class HomeViewModel(private val repository: ProductRepository = ProductRepositoryImpl()) : ViewModel() {
    private val _uiState = MutableStateFlow(HomeUiState())

    val uiState: StateFlow<HomeUiState> = _uiState

    fun getProducts() {
        _uiState.update {
            it.copy(
                isLoading = true
            )
        }
        viewModelScope.launch {
            delay(2000)
            _uiState.update {
                it.copy(
                    products = repository.getProducts(),
                    isLoading = false
                )
            }
            //copy crea un nuevo objeto de la misma(it) clase para actualizar 2 de sus atributos
        }
    }

    init {
        getProducts()
    }
    //cuando se inicialice el ViewModel se llamará a la función getProducts()
}