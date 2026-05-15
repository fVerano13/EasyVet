package pe.isil.easyvet

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import pe.isil.easyvet.ui.theme.AppTheme

@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
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
                    .clip(CircleShape)
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

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(256.dp)
                .padding(16.dp)
                .clip(RoundedCornerShape(16.dp))
                .background(MaterialTheme.colorScheme.primary),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column(
                modifier = Modifier
                    .fillMaxHeight(),
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Christmas Offer"
                )

                Text(
                    text = "25% OFF"
                )

                Button(
                    onClick = {}
                ) {
                    Text(text = "Shop now")
                }
            }
            Image(
                painter = painterResource(R.drawable.dog),
                contentDescription = null,
                modifier = Modifier.height(240.dp)
            )
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