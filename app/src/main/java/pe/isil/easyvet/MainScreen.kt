package pe.isil.easyvet

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource

@Composable
fun MainScreen() {

    var selectedTab by rememberSaveable {
        mutableStateOf(MainTab.Home)
    }
    //rememberSaveable hará que recuerde el valor de selectedTab cada vez que se renderice/refresque la pantalla
    //y esta variable se convierte en un estado
    //el valor inicial será el caso Home del enum MainTab
    //dentro se puede colocar cualquier tipo de dato inicial porque es genérico
    //UN ESTADO ES AQUEL VALOR QUE CAMBIA PRODUCTO DE LA INTERACCIÓN ENTRE EL USUARIO Y
    //LA APLICACIÓN, Y ESTE CAMBIO DE VALOR ORIGINA QUE LA VISTA SE RENDERICE/REFRESQUE

    Scaffold(
        bottomBar = {
            //barra inferior en la pantalla
            NavigationBar {
                //barra de navegación que está dentro de la barra inferior con su contenido propio
                MainTab.entries.forEach { tab ->
                    //recorre todos los casos del enum Main Tab y cada caso se almacena temporalmente en tab
                    val selected = selectedTab == tab
                    //selectedTab representa la pestaña seleccionada
                    //tab representa la pestaña actual del recorrido del forEach
                    //se comparan los valores de selectedTab y tab SI son iguales dará true
                    //y se almacena en la constante selected SI NO almacenará false

                    NavigationBarItem(
                        //el contenido de la barra de navegación
                        selected = selected,
                        //este parámetro recibe un boolean que es valor actual de la constante selected de arriba
                        onClick = {
                            selectedTab = tab
                            //cuando se da clic a un elemento el valor de selectedTab cambia al valor actual de tab
                            //y se actualiza el estado por lo que se refrescará la pantalla
                        },
                        icon = {
                            Icon(
                                painter = painterResource(
                                    if (selected)
                                        tab.filledIcon
                                    else
                                        tab.outlinedIcon
                                ),
                                contentDescription = tab.label,
                                tint = if (selected)
                                    MaterialTheme.colorScheme.primary
                                else
                                    MaterialTheme.colorScheme.secondary
                                //se usa el valor de la constante selected de arriba para hacer validaciones
                                //SI es true se ejecuta la línea superior SI NO la línea inferior
                            )
                        }
                    )
                }
            }
        }
    ) { paddingValues ->
        Box(
            modifier = Modifier
                .padding(paddingValues)
        ) {
            when (selectedTab) {
                MainTab.Home -> HomeScreen()
                MainTab.Favorites -> FavoritesScreen()
                //cuando la variable selectedTab tenga el valor Home se enviará a su pantalla igual que con Favorites
            }
        }
    }
}