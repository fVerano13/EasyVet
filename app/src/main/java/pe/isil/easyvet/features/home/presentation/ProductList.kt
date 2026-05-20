package pe.isil.easyvet.features.home.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import pe.isil.easyvet.features.home.domain.model.Product

@Composable
fun ProductList(products: List<Product>) {
    //esta función recibe products de tipo lista del model Product
    LazyVerticalGrid(
        //crea una grilla vertical que carga los elementos a medida que aparezcan en la pantalla
        columns = GridCells.Fixed(2),
        modifier = Modifier
            .padding(horizontal = 16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
        //crea un espaciado entre los elementos del LazyVerticalGrid
    ) {

        items(products) { product ->
            ProductItem(product)
            //items tiene que recibir una variable de tipo lista para recorrerla
            //y cada elemento de la lista se almacena temporalmente en product
            //para ser pasada como parámetro de ProductItem
        }
    }
}