package com.app.tv.remote.control.learnnavigationjetpack

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun myAppNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Routes.screenA, builder = {
        composable(Routes.screenA) {
            ScreenA(navController)
        }
        composable(Routes.screenB + "/{name}") {
            val name = it.arguments?.getString("name")
            ScreenB(name.toString())
        }
    })
}