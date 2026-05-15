package pe.isil.easyvet

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun App() {
    val navController = rememberNavController()
    //es lo que permite movernos entre los Composable, cambiar de vistas y navegar entre las rutas que crearemos

    NavHost(
        navController = navController,
        startDestination = OnBoardingRoute
        //se usa para crear las distintas rutas
        //se especifica el controller que permite movernos
        //y se especifica con qué Composable iniciará
    ) {
        composable<OnBoardingRoute> {
            //se definen los nombres de los Composable para su uso dentro del NavHost
            //<> dice que es un tipo genérico por lo que admite distintos tipos
            //en este caso el objeto como ruta de navegación
            OnBoardingScreen(
                onCreateAccount = {},
                onSignIn = {
                    navController.navigate(LoginRoute)
                }
                //se envían los parámetros de la función con las instrucciones para navegar entre rutas
                //acá llama a la ruta que contiene la pantalla Login
            )
        }

        composable<LoginRoute> {
            LoginScreen(
                onLogin = {
                    navController.navigate(MainRoute)
                }
            )
        }
        composable<MainRoute> {
            MainScreen()
        }
    }
}