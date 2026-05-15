package pe.isil.easyvet.home.presentation

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import pe.isil.easyvet.home.domain.model.Product

@Composable
fun ProductList(products: List<Product>) {
    //esta función recibe products de tipo lista del model Product
    LazyColumn {
        //crea una columna que carga los elementos a medida que aparezcan en la pantalla
        items(products) { product ->
            ProductItem(product)
        //items tiene que recibir una variable de tipo lista para recorrerla
        //y cada elemento de la lista se almacena temporalmente en product
        //para ser pasada como parámetro de ProductItem
        }
    }
}