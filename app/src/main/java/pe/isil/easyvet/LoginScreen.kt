package pe.isil.easyvet

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import pe.isil.easyvet.ui.theme.AppTheme

@Composable
fun LoginScreen(
    onLogin: () -> Unit = {}
) {
    val email = remember {
        mutableStateOf("")
    }
    val password = remember {
        mutableStateOf("")
    }
    val isPasswordVisible = remember {
        mutableStateOf(false)
    }
    //se declara una constante y usando la combinación de la función remember
    //para que cada vez que se renderice/refresque la vista no se pierda el valor
    //y la función mutableStateOf que los define como un valor que cambia como estado
    //se define a estas constantes como un estado
    //dentro se puede colocar cualquier tipo de dato inicial porque es genérico
    //UN ESTADO ES AQUEL VALOR QUE CAMBIA PRODUCTO DE LA INTERACCIÓN ENTRE EL USUARIO Y
    //LA APLICACIÓN, Y ESTE CAMBIO DE VALOR ORIGINA QUE LA VISTA SE RENDERICE/REFRESQUE

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ) {
        OutlinedTextField(
            value = email.value,
            onValueChange = { email.value = it },
            //a este parámetro se le asigna un valor de tipo función con {}
            //por defecto Kotlin asigna el nombre it a la variable que almacenará lo nuevo
            //y a este it se le asigna el valor contenido en email
            //CADA VEZ QUE CAMBIA EL VALOR DE EMAIL LA VISTA SE VA A REFRESCAR PORQUE
            //AL CAMBIAR EL ESTADO DEL VALOR SE REFRESCA LO QUE DEPENDA DE ESE VALOR
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
                .padding(vertical = 8.dp),
            placeholder = {
                Text("Email")
            }
        )

        OutlinedTextField(
            value = password.value,
            onValueChange = { password.value = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
                .padding(vertical = 8.dp),
            placeholder = {
                Text("Password")
            },
            visualTransformation =
                if (isPasswordVisible.value)
                    VisualTransformation.None
                else
                    PasswordVisualTransformation(),
            //este parámetro sirve para transformar al texto en secreto
            //SI isPasswordVisible es true se muestra la contraseña
            //SI NO se oculta el texto, por defecto se oculta porque inicia false
            trailingIcon = {
                //a este parámetro se le asigna un valor de tipo función con {}
                IconButton(
                    onClick = {
                        //a este parámetro se le asigna un valor de tipo función con {}
                        isPasswordVisible.value = !isPasswordVisible.value
                        //invierte el valor actual de isPasswordVisible
                    }) {
                    Icon(
                        painter = painterResource(
                            id = if (isPasswordVisible.value)
                                R.drawable.visibility
                            else
                                R.drawable.visibility_off
                        ),
                        //se llama al recurso usando R, el tipo de recurso y su nombre
                        contentDescription = null
                        //las imágenes siempre piden una descripción
                    )
                }
            }
        )

        Button(
            onClick = onLogin,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
        ) {
            Text(text = "Login")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    AppTheme {
        LoginScreen()
    }
}