package br.senai.sp.jandira.mytrips.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.mytrips.R


@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .fillMaxSize()

    ) {
        Column(
            modifier = Modifier
                .fillMaxSize(),

            verticalArrangement = Arrangement.Center
        ) {
            Column(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(32.dp)


            ) {

                Text(
                    text = stringResource(
                        R.string.login
                    ),
                    color = Color(0xFF1565BB),
                    fontSize = 32.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    modifier = Modifier
                        .padding(bottom = 80.dp),
                    text = stringResource(
                        R.string.tocontinue
                    ),
                    color = Color.Gray,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold
                )


                TextField(
                    value = "",
                    onValueChange = {},
                    label = { Text(text = "teste@email.com") },
                    modifier = modifier
                        .fillMaxWidth()
                        .padding(bottom = 20.dp)


                )
                TextField(
                    value = "",
                    onValueChange = {},
                    label = { Text(text = "********") },
                    modifier = modifier
                        .padding(bottom = 30.dp)
                        .fillMaxWidth()
                )

                Button(
                    onClick = {},
                    modifier = Modifier
                        .align(alignment = Alignment.End),
                    colors = ButtonDefaults.buttonColors(
                        Color(0xFF1565BB)
                    )
                ) {
                    Text(
                        text = stringResource(
                            R.string.sign
                        )
                    )
                }
                Row(
                    modifier = Modifier
                        .padding(top = 25.dp)
                        .align(alignment = Alignment.End)
                ) {

                    Text(
                        modifier = Modifier
                            .padding(end = 3.dp),
                        text = stringResource(
                            R.string.dont
                        )
                    )
                    Text(
                        text = stringResource(
                            R.string.sign_up
                        ),
                        color = Color(0xFF1565BB),
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold

                    )
                }

            }

        }
        Card(
            modifier = Modifier
                .width(200.dp)
                .width(60.dp)
                .align(alignment = Alignment.TopEnd),
            colors = CardDefaults.cardColors(
                containerColor = Color.Black
            )
        ) { }
        Card(
            modifier = Modifier
                .width(200.dp)
                .width(60.dp)
                .align(alignment = Alignment.BottomStart),
            colors = CardDefaults.cardColors(
                containerColor = Color.Black
            )
        ) { }

    }

}

@Preview(showSystemUi = true)
@Composable
private fun HomeScreenPreview() {
    HomeScreen()
}