package com.example.sampleapp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.findNavController

@Composable
fun ThirdScreen() {
    val navController = LocalView.current.findNavController()

    Scaffold() { it

        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color.Red)
        ) {

            Button(modifier = Modifier
                .align(Alignment.Center),
                content = {
                    Text(
                        text = "Third Step Compose Screen",
                        style = TextStyle(
                            color = Color.White,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.W700
                        )
                    )
                }, onClick = {
                    navController.navigate(R.id.action_thirdStepCompose_to_fourthFragment)
                })
        }
    }
}

@Preview
@Composable
fun ThirdScreenPreview() {
    ThirdScreen()
}