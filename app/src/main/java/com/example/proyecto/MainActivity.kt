package com.example.proyecto

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {

                PantallaDetalle(
                    nombreCampeon = "Yasuo",
                    fecha = "07/11/2026",
                    score = "10/2/5",
                    notas = "Buena partida en top. Me falló la ulti un par de veces pero ganamos.",
                    esVictoria = true,
                    imagenCampeon = R.drawable.yasuo,
                    onVolver = { /* Aquí iría el código para volver al listado*/ },
                    onEditar = { /* Aquí iría el código para editar la pantalla de detalle */ },
                    onCompartir = { /* Y el código de que podamos compartirlo */ }
                )

            }
        }
    }
}

@Composable
fun TarjetaPartida(
    fecha: String,
    score: String,
    notas: String,
    esVictoria: Boolean,
    imagenCampeon: Int,
    onCompartir: () -> Unit
) {

    //La tarjeta del listado
    Card(
        modifier = Modifier
            .fillMaxWidth() //Queremos que ocupe todo el ancho de la pantalla
            .padding(8.dp), //Y ponemos un borde para que no choque
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp) //La sombra de la tarjeta para dar sensación de profundidad
    ) {

        //Un row, que es un linearlayout horizontal, para colocar la imagen, los textos... de un lado al otro
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            verticalAlignment = Alignment.CenterVertically //Lo centramos verticalmente los elementos
        ) {

            // Este sería el view de victoria y derrota
            Box(
                modifier = Modifier
                    .size(16.dp)
                    .background(if (esVictoria) Color.Green else Color.Red) //Hacemos un booleano para que si es victoria el box se ponga de color verde y sino de rojo
            )

            Spacer(modifier = Modifier.width(8.dp)) // Separamos los elementos con un spacer


            Image(
                painter = painterResource(id = imagenCampeon), // Aquí painterResource coge el int que le pasamos y lo convierte en una imagen, según el id del campeón que queramos mostrar.
                contentDescription = "Campeón",
                modifier = Modifier.size(60.dp) //Le ponemos un tamaño fijo de la imagen en la tarjeta
            )

            Spacer(modifier = Modifier.width(8.dp)) //Otra separación

            // LinearLayout vertical para alinear los textos
            Column(
                modifier = Modifier.weight(1f) // Ocupa el espacio sobrante y empuja el botón de compartir a la derecha del todo
            ) { //Mostramos los datos que le pasamos
                Text(text = "Fecha: $fecha", fontWeight = FontWeight.Bold, fontSize = 14.sp)
                Text(text = "Score: $score", fontSize = 12.sp)
                Text(text = notas, fontSize = 12.sp, color = Color.Gray)
            }

            // Este sería el botón de compartir
            IconButton(onClick = onCompartir) {
                Icon(
                    imageVector = Icons.Default.Share, //El icono visual
                    contentDescription = "Compartir"
                )
            }
        }
    }
}

@Composable
fun PantallaDetalle(
    nombreCampeon: String,
    fecha: String,
    score: String,
    notas: String,
    esVictoria: Boolean,
    imagenCampeon: Int,
    onVolver: () -> Unit,
    onEditar: () -> Unit,
    onCompartir: () -> Unit
) {
    // Contenedor principal que sería un linearlayout vertical
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFB0C4DE)) // Fondo gris azulado
    ) {
        // La barra superior con el título y el menú
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Black)
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "LOLMASTER", color = Color.White, fontWeight = FontWeight.Bold)
            Text(text = "Menú", color = Color.White)
        }

        // Aquí iría la flecha, un espacio y el botón de editar
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(onClick = onVolver) {
                Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "Volver")
            }

            Spacer(modifier = Modifier.weight(1f)) // Empuja el icono de editar a la derecha

            IconButton(onClick = onEditar) {
                Icon(imageVector = Icons.Default.Edit, contentDescription = "Editar")
            }
        }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState()) // Contenido con Scroll
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = nombreCampeon, fontSize = 24.sp, fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.height(16.dp))
            Image(
                painter = painterResource(id = imagenCampeon),
                contentDescription = "Imagen de $nombreCampeon",
                modifier = Modifier.size(150.dp)
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Cuadrado blanco para las notas
            Card(
                modifier = Modifier.fillMaxWidth(),
                colors = CardDefaults.cardColors(containerColor = Color.White)
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(text = "Fecha: $fecha", fontWeight = FontWeight.Bold)
                    Text(text = "Score: $score")
                    Text(text = "Resultado: " + if (esVictoria) "Victoria" else "Derrota")
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(text = "Notas:", fontWeight = FontWeight.Bold)
                    Text(text = if (notas.isEmpty()) "Sin notas" else notas)
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Imágenes opcionales, le ponemos 3 por ejemplo
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Start
            ) {
                repeat(3) {
                    Image(
                        painter = painterResource(id = imagenCampeon),
                        contentDescription = "Imagen de la partida",
                        modifier = Modifier
                            .size(60.dp)
                            .padding(end = 4.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Botón compartir a la derecha
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.End
            ) {
                IconButton(onClick = onCompartir) {
                    Icon(imageVector = Icons.Default.Share, contentDescription = "Compartir")
                }
            }
        }
    }
}