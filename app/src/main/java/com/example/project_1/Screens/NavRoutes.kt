package com.example.project_1.Screens

import kotlinx.serialization.Serializable


@Serializable
sealed class NavRoutes
{

    @Serializable
    object Home : NavRoutes()

    @Serializable
    object Welcome : NavRoutes()

    @Serializable
    object Profile : NavRoutes()

    @Serializable
    object Search : NavRoutes()

    @Serializable
    object CourseDetail : NavRoutes()


}