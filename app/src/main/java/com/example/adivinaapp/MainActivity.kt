package com.example.adivinaapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.adivinaapp.view.MenuScreen


class MainActivity : ComponentActivity() {

    sealed class Routes(val route: String)
    {
        object Game :Routes( "GameScreen" )
        object Menu :Routes( "MenuScreen" )

    }
    override fun onCreate(savedInstanceState: Bundle?) {

        /*val navController = navigationController()

        NavHost(
             navController = navigationController,
            startDestination = Routes.Menu .route
        ) {
            composable(Routes.Menu .route) { Menu(navigationController)
            }
            composable(Routes.Game .route) { Game(navigationController)
            }
        }*/

        super.onCreate(savedInstanceState)
        setContent {


        }
    }
}

sealed class Routes(val route: String)
{
    object Game :Routes( "GameScreen" )
    object MenuScreen :Routes( "MenuScreen" )

}