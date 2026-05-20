package pe.isil.easyvet.features.home.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FabPosition
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import pe.isil.easyvet.R
import pe.isil.easyvet.core.ui.theme.AppTheme
import pe.isil.easyvet.features.home.domain.model.Product

@OptIn(ExperimentalMaterial3Api::class)
//habilita el uso de componentes experimentales de Material3
@Composable
fun ProductDetail(product: Product) {
    //esta función recibe product de tipo del model Product

    var showBottomSheet by remember {
        mutableStateOf(false)
    }

    val sheetState = rememberModalBottomSheetState(
        //recuerda el estado de la hoja inferior
        skipPartiallyExpanded = false,
        //indica que sí comenzará parcialmente expandido
    )

    val quantity = remember {
        mutableStateOf(0)
    }

    Scaffold(
        floatingActionButton = {
            //crea un botón flotante
            Button(
                onClick = {
                    showBottomSheet = true
                    //pasa el estado de showBottomSheet a true para que se muestre
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
            ) {
                Text(text = "Add to cart")
            }
        },
        floatingActionButtonPosition = FabPosition.Center
        //centra la posición del botón flotante
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues)
        ) {
            AsyncImage(
                model = product.image,
                contentDescription = product.name,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(320.dp)
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = product.name,
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier
                    .padding(horizontal = 16.dp)
            )

            Spacer(modifier = Modifier.height(8.dp))

            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(horizontal = 16.dp)
            ) {
                Text(
                    text = "$ ${product.price}",
                    style = MaterialTheme.typography.titleLarge,
                )

                Spacer(modifier = Modifier.weight(1f))

                IconButton(
                    enabled = quantity.value > 0,
                    //el botón se habilita cuando la cantidad es mayor a 0
                    onClick = {
                        quantity.value -= 1
                        //disminuye en 1 el valor de quantity
                    },
                    modifier = Modifier
                        .shadow(4.dp, CircleShape)
                        .size(32.dp)
                        .background(MaterialTheme.colorScheme.onPrimary)
                ) {
                    Icon(
                        painter = painterResource(R.drawable.remove),
                        contentDescription = "remove"
                    )
                }

                Text(
                    text = "${quantity.value}",
                    style = MaterialTheme.typography.titleMedium,
                    modifier = Modifier
                        .width(32.dp),
                    textAlign = TextAlign.Center
                )

                IconButton(
                    onClick = {
                        quantity.value += 1
                        //aumenta en 1 el valor de quantity
                    },
                    modifier = Modifier
                        .shadow(4.dp, CircleShape)
                        .size(32.dp)
                        .background(MaterialTheme.colorScheme.onPrimary)
                ) {
                    Icon(
                        painter = painterResource(R.drawable.add),
                        contentDescription = "remove"
                    )
                }
            }

            Spacer(modifier = Modifier.height(32.dp))

            Text(
                text = product.description,
                modifier = Modifier
                    .padding(horizontal = 16.dp)
            )

            if (showBottomSheet) {
                //SI el valor de showBottomSheet es true se mostrará la hoja inferior
                ModalBottomSheet(
                    //crea la hoja inferior que aparecerá
                    sheetState = sheetState,
                    //el estado de la hoja se asigna a lo almacenado en la constante de arriba
                    onDismissRequest = {
                        //cuando el usuario cierra la hoja inferior se ejecuta lo de abajo
                        showBottomSheet = false
                        //pasa el estado de showBottomSheet a false para que no se muestre
                    },
                    containerColor = MaterialTheme.colorScheme.onPrimary
                ) {
                    Column {
                        Text(
                            text = " ADDED TO CART",
                            style = MaterialTheme.typography.headlineSmall,
                            fontWeight = FontWeight.SemiBold,
                            modifier = Modifier
                                .padding(horizontal = 8.dp)
                        )

                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(8.dp)
                        ) {
                            AsyncImage(
                                model = product.image,
                                contentDescription = product.name,
                                modifier = Modifier
                                    .height(96.dp),
                                contentScale = ContentScale.Fit
                            )

                            Column {
                                Text(text = product.name, fontWeight = FontWeight.SemiBold)
                                Text(text = "$ ${product.price}")
                            }
                        }

                        Button(
                            onClick = {
                                showBottomSheet = false
                                //pasa el estado de showBottomSheet a false para que no se muestre
                            },
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 16.dp)
                        ) {
                            Text(text = "View cart")
                        }
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ProductDetailPreview() {
    AppTheme {
        ProductDetail(
            Product(
                id = 3,
                name = "Whiskas Adult Chicken Flavor",
                description = "Crunchy kibbles with chicken flavor for adult cats. Rich in vitamins and minerals.",
                image = "https://i.imgur.com/dRC9dEB.png",
                price = 49.99
            )
        )
    }
}