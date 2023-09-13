package com.example.menubar

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.menubar.screens.ChatScreen
import com.example.menubar.screens.HomeScreen
import com.example.menubar.screens.MyAnunciScreen
import com.example.menubar.screens.ProfileScreen

@Composable
fun ButtonNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Home.route,
    ){
        composable(route = BottomBarScreen.Home.route){
            HomeScreen()
        }
        composable(route = BottomBarScreen.Anuncio.route){
            MyAnunciScreen()
        }
        composable(route = BottomBarScreen.Chat.route){
            ChatScreen()
        }
        composable(route = BottomBarScreen.Profile.route){
            ProfileScreen()
        }
    }
}