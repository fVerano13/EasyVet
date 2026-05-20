package pe.isil.easyvet.features.home.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import pe.isil.easyvet.features.home.domain.model.Product

@Composable
fun ProductItem(product: Product) {
    //esta función recibe product de tipo Product
    Card(
        modifier = Modifier
            .fillMaxWidth(),
        elevation = CardDefaults.cardElevation(8.dp),
        //crea una sombra debajo del card
        colors = CardDefaults.cardColors(MaterialTheme.colorScheme.onPrimary)
    ) {
        //crea una tarjeta con su elemento
        Column(
            modifier = Modifier
                .padding(horizontal = 8.dp)
        ) {
            AsyncImage(
                model = product.image,
                contentDescription = product.name,
                contentScale = ContentScale.Fit,
                //para que la imagen no pierda su proporción
                modifier = Modifier
                    .fillMaxWidth()
                    .height(216.dp)
            )
            //permite mostrar una imagen de internet de manera asíncrona
            Text(
                text = product.name,
                fontWeight = FontWeight.SemiBold,
                overflow = TextOverflow.Ellipsis,
                //cuando el texto sobrepase el tamaño del Card colocará ...
                maxLines = 1
                //el texto se mostrará en máximo 1 línea
            )
            Text(
                text = "$ ${product.price}",
                //se usa $ para agregar el valor de price
                modifier = Modifier
                    .fillMaxWidth(),
                textAlign = TextAlign.Center
            )
        }
    }
}