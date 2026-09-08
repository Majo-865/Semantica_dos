package com.example.semantica_dos

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.semantica_dos.ui.theme.Semantica_dosTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            App()
        }
    }
}

@Composable
fun App() {

    // HEADER
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .background(Color(0xFF1A237E)),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "HEADER",
                fontSize = 20.sp,
                color = Color.LightGray
            )
        }


        //MAIN

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(
                    Color(0xFF90CAF9),

                    ),
            contentAlignment = Alignment.Center
        ) {
            ContainerMain()
        }


//FOOTER

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .background(Color(0xFF1A237E)),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "FOOTER",
                fontSize = 20.sp,
                color = Color.LightGray
            )
        }
    }
}

@Composable
fun ContainerMain(){
    Row(
        modifier = Modifier.fillMaxSize()
    ){
        //NAVEGACION

        Box(
            modifier = Modifier
                .weight(2f)
                .fillMaxHeight()
                .background(Color(0xFF1E293B)),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "NAVEGACIÓN",
                fontSize = 20.sp,
                color = Color.LightGray
            )
        }

        Column(
            modifier = Modifier
                .weight(1f)
                .fillMaxHeight()
        ) {
            //SECCION 1

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .background(Color(0xFF38BDF8)),
                contentAlignment = Alignment.Center
            ){
                Text(
                    text = "SECCIÓN 1",
                    color = Color.Red
                )
            }
            //SECCION 2

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .background(Color(0xFF90CAF9)),
                contentAlignment = Alignment.Center
            ){
                Text(
                    text = "SECCIÓN 2",
                    color = Color(0xFF1A237E)
                )
            }
        }

    }

}
@Composable
@Preview
fun Vista(){
    App()


}

