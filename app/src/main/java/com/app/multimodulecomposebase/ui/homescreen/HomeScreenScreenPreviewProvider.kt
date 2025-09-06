package com.app.multimodulecomposebase.ui.homescreen

import androidx.compose.ui.tooling.preview.PreviewParameterProvider

class HomeScreenScreenPreviewProvider : PreviewParameterProvider<HomeScreenContract.UiState> {
    override val values: Sequence<HomeScreenContract.UiState>
        get() = sequenceOf(
            HomeScreenContract.UiState(
                isLoading = true,
                list = emptyList(),
            ),
            HomeScreenContract.UiState(
                isLoading = false,
                list = emptyList(),
            ),
            HomeScreenContract.UiState(
                isLoading = false,
                list = listOf("Item 1", "Item 2", "Item 3")
            ),
        )
}