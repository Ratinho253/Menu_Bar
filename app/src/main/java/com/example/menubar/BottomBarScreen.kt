package com.example.menubar

import android.graphics.drawable.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Home
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarScreen(
    val route : String,
    val  title : String,
    val icon : ImageVector,
){
    object  Home : BottomBarScreen(
        route = "home",
        title = "Home",
        icon = Icons.Default.Home
    )
    object  Chat : BottomBarScreen(
        route = "chat",
        title = "Chat",
        icon = Icons.Default.CheckCircle
    )
    object  Anuncio : BottomBarScreen(
        route = "anuncio",
        title = "Anuncio",
        icon = Icons.Default.DateRange
    )
    object  Profile : BottomBarScreen(
        route = "profile",
        title = "Profile",
        icon = Icons.Default.AccountCircle
    )

}
