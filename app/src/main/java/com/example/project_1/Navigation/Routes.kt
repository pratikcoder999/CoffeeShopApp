package com.example.project_1.Navigation

import kotlinx.serialization.Serializable

@Serializable
sealed class Routes
{

    @Serializable
    object HomeScreen : Routes()

    @Serializable
    object WelcomeScreen : Routes()

    @Serializable
    data class DetailScreen(val productId: Int) : Routes()


}