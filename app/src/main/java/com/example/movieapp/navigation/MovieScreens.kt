package com.example.movieapp.navigation

// ww.google.com/sign_in
enum class MovieScreens{
    HomeScreen,
    DetailScreen;
    companion object {
        fun fromRoute(route: String?): MovieScreens
        = when (route?.substringAfter("/")){
            HomeScreen.name -> HomeScreen
            DetailScreen.name -> DetailScreen
            null -> HomeScreen
            else -> throw IllegalArgumentException("Route $route is note recognize ")
        }
    }
}