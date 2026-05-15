package pe.isil.easyvet

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import pe.isil.easyvet.ui.theme.AppTheme

//esta función solo puede ser llamada desde otro Composable, excepto del setContent
//permite describir UI de forma declarativa o sea directo con el código
//o sea que Jetpack Compose interpreta y renderiza
@Composable
fun OnBoardingScreen(
//el nombre de la función debe iniciar en mayúscula, usando UpperCamelCase
    onCreateAccount: () -> Unit = {},
    onSignIn: () -> Unit = {}
    //esta función recibe dos parámetros de tipo función
    //que retornan vacíos y no tienen instrucciones
    //porque esto lo maneja el navController del archivo App.kt
    //que serán usados en los botones de abajo
) {
    Scaffold { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Spacer(modifier = Modifier.weight(1f))
            //se distribuye el espacio restante con los demás Spacer
            //mientras mayor sea el peso, más espacio restante usará ese Spacer

            Image(
                painter = painterResource(R.drawable.background),
                contentDescription = null,
                modifier = Modifier.size(512.dp),
                contentScale = ContentScale.FillHeight
            )

            Text(
                "From Bowl to Soul\nWe've Got it All!",
                style = MaterialTheme.typography.headlineLarge,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.weight(1f))

            Text(
                "Buy the best pet food with health and nutrition and nutrition for beloved pet",
                style = MaterialTheme.typography.bodyMedium,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(horizontal = 16.dp)
                //modifier es el parámetro que permite modificar
                //el diseño del componente
                //se debe usar valores múltiplos de 8 como estándar
            )

            Spacer(modifier = Modifier.weight(1f))

            Button(
                onClick = onCreateAccount,
                //a este parámetro se le asigna un valor de tipo función con {}
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
            ) {
                Text("Create account")
            }

            OutlinedButton(
                onClick = onSignIn,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
            ) {
                Text("Sign in")
            }

            Spacer(modifier = Modifier.weight(1f))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun OnBoardingScreenPreview() {
    AppTheme {
        OnBoardingScreen()
    }
}