package com.app.meuprimeiroprojeto

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {

            Column(modifier = Modifier.padding(20.dp)) {

                MessageCard(
                    Message("IFPE", "Localizado em Palmares", R.drawable.ifpe)
                )

                Spacer(modifier = Modifier.height(20.dp))

                MessageCard(
                    Message("Cristiano Ronaldo", "Melhor da História", R.drawable.cristiano)
                )

                Spacer(modifier = Modifier.height(20.dp))

                MessageCard(
                    Message("Catende", "Terra da mulher da sombrinha!", R.drawable.catende)
                )
            }
        }
    }
}

data class Message(
    val author: String,
    val body: String,
    val image: Int
)

@Composable
fun MessageCard(msg: Message) {
    Row(modifier = Modifier.padding(8.dp)) {

        Image(
            painter = painterResource(msg.image),
            contentDescription = "Imagem",
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
        )

        Spacer(modifier = Modifier.width(8.dp))

        Column {
            Text(text = msg.author)

            Spacer(modifier = Modifier.height(4.dp))

            Text(text = msg.body)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewMessageCard() {
    Column(modifier = Modifier.padding(20.dp)) {

        MessageCard(
            Message("IFPE", "Localizado em Palmares", R.drawable.ifpe)
        )

        Spacer(modifier = Modifier.height(20.dp))

        MessageCard(
            Message("Cristiano Ronaldo", "Melhor da História", R.drawable.cristiano)
        )

        Spacer(modifier = Modifier.height(20.dp))

        MessageCard(
            Message("Catende", "Terra da mulher da sombrinha!", R.drawable.catende)
        )
    }
}
