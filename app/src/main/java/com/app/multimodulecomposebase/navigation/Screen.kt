package com.app.multimodulecomposebase.navigation

import kotlinx.serialization.Serializable

sealed interface Screen {
    @Serializable
    data object HomeScreen : Screen
}