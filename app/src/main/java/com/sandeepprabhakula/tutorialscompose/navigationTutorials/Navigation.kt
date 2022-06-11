package com.sandeepprabhakula.tutorialscompose.navigationTutorials

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.sandeepprabhakula.tutorialscompose.NavTestScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.MainScreen.route) {
        composable(route = Screen.MainScreen.route) {
            MainScreen(navController = navController)
        }
        composable(route = Screen.DetailScreen.route + "/{name}",
            arguments = listOf(
                navArgument("name") {
                    type = NavType.StringType
                    defaultValue = "Sandeep"
                    nullable = true
                }
            )) {
            DetailScreen(name = it.arguments?.getString("name"))
        }
        composable(
            route = Screen.NavTestScreen.route,
            arguments = listOf(
                navArgument(NAV_TEST_SCREEN_ARGS) {
                    type = NavType.IntType
                    defaultValue = 0
                }, navArgument(NAV_TEST_SCREEN_ARGS2) {
                    type = NavType.StringType
                    defaultValue = "Pixel"
                    nullable = true
                })
        ) {
            NavTestScreen(
                navController, it.arguments?.getInt(NAV_TEST_SCREEN_ARGS), it.arguments?.getString(
                    NAV_TEST_SCREEN_ARGS2
                ).toString()
            )
        }
        composable(
            route = Screen.ExpandableCardScreen.route, arguments = listOf(
                navArgument(EXPAND_CARD_SCREEN_TITLE) {
                    type = NavType.StringType
                    defaultValue = "Sandeep"
                }
            )
        ){
            ExpandableCard(title = it.arguments?.getString(EXPAND_CARD_SCREEN_TITLE), body =it.arguments?.getString(
                EXPAND_CARD_SCREEN_BODY) )
        }
    }
}





