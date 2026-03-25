package com.example.CGSPUNO

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.CGSPUNO.ui.theme.Laboratorio2UsodeJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Laboratorio2UsodeJetpackComposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Aplicacion(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Preview
@Composable
fun Aplicacion(modifier: Modifier = Modifier) {
    var Usuario by remember { mutableStateOf("") }
    val listaNombres = remember { mutableStateListOf<String>() }

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Ingreso del nombre
        TextField(
            value = Usuario,
            onValueChange = { Usuario = it },
            label = { Text("Usuario") },
            modifier = Modifier.fillMaxWidth(),
            colors = TextFieldDefaults.colors(
                unfocusedContainerColor = Color(0xFFE0E0E0)
            )
        )

        // Botón de guardado
        Button(
            onClick = {
                if (Usuario.isNotBlank()) {
                    listaNombres.add(Usuario)
                    Usuario = ""
                }
            },
            modifier = Modifier.padding(vertical = 16.dp)
        ) {
            Text("Guardar")
        }

        // Fila para descripción y botón limpiar
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Listado de nombres y\nposición en la lista",
                fontSize = 16.sp
            )
            Button(
                onClick = { listaNombres.clear() }
            ) {
                Text("Limpiar")
            }
        }

        // Box donde se muestra la lista
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .border(
                    width = 4.dp,
                    color = Color.Blue
                )
                .padding(16.dp)
        ) {
            LazyColumn(modifier = Modifier.fillMaxSize()) {
                itemsIndexed(listaNombres) { index, nombre ->
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 8.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(text = nombre, fontSize = 18.sp)
                        Text(text = "${index + 1}", fontSize = 18.sp)
                    }
                }
            }
        }
    }
}
