package pe.isil.easyvet.home.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import pe.isil.easyvet.home.domain.model.Product

@Composable
fun ProductItem(product: Product) {
    //esta función recibe product de tipo Product
    Card {
        //crea una tarjeta con su elemento
        Column {
            Text(text = product.name)
            Text(text = product.description)
            Text(text = "$ ${product.price}")
            //se usa $ para agregar el valor de price
        }
    }
}