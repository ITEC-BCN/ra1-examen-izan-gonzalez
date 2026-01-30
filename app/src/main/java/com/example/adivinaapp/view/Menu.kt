package com.example.adivinaapp.view

import android.R.attr.bottom
import android.R.attr.end
import android.R.attr.start
import android.R.attr.top
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester.Companion.createRefs
import androidx.compose.ui.graphics.BlendMode.Companion.Color
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.navigation.NavController
import androidx.navigation.navArgument
import com.example.adivinaapp.R
import kotlinx.coroutines.NonDisposableHandle.parent
import java.nio.file.WatchEvent

@Composable
fun MenuScreen(navController: NavController) {



    ConstraintLayout(
        modifier = Modifier
            .fillMaxSize()

    ) {
        val buttonGame = createRef()

        Box(
            modifier = Modifier
                .width(400.dp)
                .height(200.dp)
        ){

            Text("Adivina el número Izan Gonzalez")
        }



        Box(
            modifier = Modifier
                .width(200.dp)
                .height(200.dp)


        ) {

        }


        Box(
            modifier = Modifier
                .height(60.dp)
                .fillMaxWidth()
        ){
            Button(

                onClick = {  navController .navigate( "GameScreen" )}

            ) {
                Text(text = "inici partida")
            }



        }

    }
}





