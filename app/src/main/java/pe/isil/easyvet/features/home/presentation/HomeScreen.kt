package pe.isil.easyvet.features.home.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import pe.isil.easyvet.R
import pe.isil.easyvet.core.ui.theme.AppTheme
@Composable
fun HomeScreen(viewModel: HomeViewModel = viewModel()) {
    val state by viewModel.uiState.collectAsState()
    
    Scaffold { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            Row(
                modifier = Modifier
                    .padding(16.dp)
            ) {
                Column {
                    Text(
                        text = "Miraflores",
                        fontWeight = FontWeight.Bold
                    )

                    Text(
                        text = "Home"
                    )
                }

                Spacer(
                    modifier = Modifier
                        .weight(1f)
                )

                IconButton(
                    onClick = {},
                    modifier = Modifier
                        .shadow(elevation = 16.dp, CircleShape)
                        .background(MaterialTheme.colorScheme.onPrimary)
                ) {
                    Icon(
                        painter = painterResource(R.drawable.visibility),
                        contentDescription = null
                    )
                }
            }

            OutlinedTextField(
                value = "",
                onValueChange = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
                    .background(MaterialTheme.colorScheme.onPrimary),
                leadingIcon = {
                    Icon(
                        painter = painterResource(R.drawable.visibility),
                        contentDescription = null
                    )
                },
                placeholder = {
                    Text(
                        text = "Search"
                    )
                }
            )

            BannerSection()

            ProductList(state.products)
            //se llama a la función ProductList y se le pasa products
            //que contiene una lista de objetos Product
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenView() {
    AppTheme {
        HomeScreen()
    }
}