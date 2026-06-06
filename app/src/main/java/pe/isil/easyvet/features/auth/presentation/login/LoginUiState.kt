package pe.isil.easyvet.features.auth.presentation.login

data class LoginUiState(
    val email: String = "",
    val password: String = ""
)
//Son los valores que son un estado dentro de la UI del Login