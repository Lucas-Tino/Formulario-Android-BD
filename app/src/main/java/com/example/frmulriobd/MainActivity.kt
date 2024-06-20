package com.example.frmulriobd

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.frmulriobd.ui.theme.FórmulárioBDTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FórmulárioBDTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Formulario()
                }
            }
        }
    }
}

@Composable
fun Formulario() {
    var nome by remember { mutableStateOf("") }
    var telefone by remember { mutableStateOf("") }

    Column(
        Modifier
            .background(Color.White)
    ) {
        Row(
            Modifier
                .padding(20.dp)
        ) {

        }
        Row(
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ){
            Text(
                text = "App DataBase",
                fontWeight = FontWeight.Bold,
                textDecoration = TextDecoration.Underline,
                color = Color(28, 100, 255),
                fontSize = 30.sp
            )
        }
        Row(
            Modifier
                .padding(20.dp)
        ) {

        }
        Row(
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ) {
            TextField(
                value = nome,
                onValueChange = { nome = it  },
                label = { Text("Nome:") },
                colors = TextFieldDefaults.colors(
                    unfocusedIndicatorColor = Color(28, 100, 255),
                    unfocusedLabelColor = Color(28, 100, 255),
                    unfocusedContainerColor = Color.White,
                    unfocusedTextColor = Color.Black,

                    focusedIndicatorColor = Color(28, 100, 255),
                    focusedLabelColor = Color(28, 100, 255),
                    focusedContainerColor = Color.White,
                    focusedTextColor = Color.Black,

                    cursorColor = Color(28, 100, 255)
                ),
                keyboardOptions = KeyboardOptions.Default.copy(
                    imeAction = ImeAction.Next
                )
            )
        }
        Row(
            Modifier
                .padding(20.dp)
        ) {

        }
        Row(
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ) {
            TextField(
                value = telefone,
                onValueChange = { telefone = it  },
                label = { Text("Telefone:") },
                colors = TextFieldDefaults.colors(
                    unfocusedIndicatorColor = Color(28, 100, 255),
                    unfocusedLabelColor = Color(28, 100, 255),
                    unfocusedContainerColor = Color.White,
                    unfocusedTextColor = Color.Black,

                    focusedIndicatorColor = Color(28, 100, 255),
                    focusedLabelColor = Color(28, 100, 255),
                    focusedContainerColor = Color.White,
                    focusedTextColor = Color.Black,

                    cursorColor = Color(28, 100, 255)
                ),
                keyboardOptions = KeyboardOptions.Default.copy(
                    keyboardType = KeyboardType.Phone,
                    imeAction = ImeAction.Done
                )
            )
        }
        Row(
            Modifier
                .padding(20.dp)
        ) {

        }
        Row(
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ){
            Button(
                onClick = {
                    // viewModel.upsertPessoa(pessoa)
                    nome = ""
                    telefone = ""
                },
                colors = ButtonDefaults.buttonColors(containerColor = Color(28, 100, 255)),
            ) {
                Text("Cadastrar")
            }
        }
        Row(
            Modifier
                .padding(20.dp)
        ){

        }
        Row(
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ){
            Column(
                Modifier
                    .fillMaxWidth(0.5f)
            ) {
                Text(text = "Nome ")
            }
            Column(
                Modifier
                    .fillMaxWidth(0.5f)
            ) {
                Text(text = "Telefone")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun FormularioPreview() {
    FórmulárioBDTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            Formulario()
        }
    }
}