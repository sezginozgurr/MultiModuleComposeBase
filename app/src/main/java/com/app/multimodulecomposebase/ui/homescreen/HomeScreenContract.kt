package com.app.multimodulecomposebase.ui.homescreen

object HomeScreenContract {
    data class UiState(
        val isLoading: Boolean = false,
        val list: List<String> = emptyList(),
    )

    sealed interface UiAction

    sealed interface UiEffect
}