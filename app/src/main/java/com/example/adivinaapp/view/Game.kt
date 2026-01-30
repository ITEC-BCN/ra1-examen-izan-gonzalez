package com.example.adivinaapp.view

import android.R.attr.top
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.navigation.NavController


@Composable
fun GameScreen(navController: NavController) {

    Button(
        onClick = {  navController .navigate( "MenuScreen" )},

    ) {
        Text(text = "Menú principal")
    }

}

