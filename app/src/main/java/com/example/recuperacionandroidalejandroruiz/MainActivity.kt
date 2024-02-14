package com.example.recuperacionandroidalejandroruiz

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.RememberObserver
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.recuperacionandroidalejandroruiz.data.Asignatura
import com.example.recuperacionandroidalejandroruiz.data.DataSource
import com.example.recuperacionandroidalejandroruiz.ui.theme.RecuperacionAndroidAlejandroRuizTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RecuperacionAndroidAlejandroRuizTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Inicio()
                }
            }
        }
    }
}

@Composable
fun Inicio(
    funciones: AsignaturasFuncionalidad = AsignaturasFuncionalidad()
) { MainScreen(funciones) }
@Composable
fun MainScreen(
    funciones: AsignaturasFuncionalidad
) {
    Column(modifier = Modifier.fillMaxSize()) {
        Text (
            text = "Bienvenido a la academia de Alejandro/arm",
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color.LightGray)
                .padding(10.dp, 20.dp, 0.dp)
        )
        Cuerpo(
            modifier = Modifier.weight(0.5f),
            funciones = funciones
        )
        Resultado(
            modifier = Modifier
                .weight(0.5f)
        )
    }
}

@Composable
fun Cuerpo (
    modifier: Modifier,
    funciones: AsignaturasFuncionalidad
) {
    LazyVerticalGrid(
        modifier = modifier,
        columns = GridCells.Fixed(2)
    ){
        items(funciones.asignaturas) { asignatura ->
            Card(
                modifier = Modifier
                    .padding(4.dp)
            ) {
                Text(
                    text = "Asig: " + asignatura.nombre,
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.Yellow)
                        .padding(15.dp)
                )
                Text(
                    text = "€/hora: " + asignatura.precioHora,
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.Cyan)
                        .padding(15.dp)
                )
                Row(modifier = Modifier.align(Alignment.CenterHorizontally)) {
                    Button(onClick = {  }) {
                        Text("+")
                    }

                    Button(onClick = {  }) {
                        Text("-")
                    }
                }
            }
        }
    }
    TextField(
        value = "",
        label = {Text(text = "Horas a contratar o a eliminar")},
        onValueChange = {},
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
    )
}

@Composable
fun Resultado (modifier: Modifier) {
    Column (
        modifier = modifier
    ) {
        Column (
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.LightGray)
                .padding(8.dp)
        ) {
            Text(
                text = "Última acción.\nNo has hecho ninguna acción",
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Magenta)
            )
            Text(
                text = "Resumen:\nNo hay nada que mostrar",
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.White)
            )
        }
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
        )

    }
}