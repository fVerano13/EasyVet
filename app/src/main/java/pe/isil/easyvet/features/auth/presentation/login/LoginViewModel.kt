package pe.isil.easyvet.features.auth.presentation.login

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class LoginViewModel : ViewModel() {
    //esta clase hereda de ViewModel
    private val _uiState = MutableStateFlow(LoginUiState())
    //esta es la variable que va a ir actualizándose por eso es un estado mutable y se coloca su valor inicial

    val uiState: StateFlow<LoginUiState> = _uiState
    //esta es la variable que se va a exponer para la vista por eso solo es un estado y contiene los valores cambiantes de _uiState

    fun onEmailChanged(value: String) {
        _uiState.value = _uiState.value.copy(email = value)
    }

    fun onPasswordChanged(value: String) {
        _uiState.value = _uiState.value.copy(password = value)
    }
    //estas 2 funciones usan el métod0 copy para crear un nuevo objeto de la misma clase y actualizar ciertos valores
}