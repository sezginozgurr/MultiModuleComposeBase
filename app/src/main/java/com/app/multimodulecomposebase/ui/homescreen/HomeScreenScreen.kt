package com.app.multimodulecomposebase.ui.homescreen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.sp
import com.app.multimodulecomposebase.common.collectWithLifecycle
import com.app.multimodulecomposebase.ui.homescreen.HomeScreenContract.UiAction
import com.app.multimodulecomposebase.ui.homescreen.HomeScreenContract.UiEffect
import com.app.multimodulecomposebase.ui.homescreen.HomeScreenContract.UiState
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.emptyFlow

@Composable
fun HomeScreenScreen(
    uiState: UiState,
    uiEffect: Flow<UiEffect>,
    onAction: (UiAction) -> Unit,
) {
    uiEffect.collectWithLifecycle {}

    HomeScreenContent(
        modifier = Modifier.fillMaxSize(),
        uiState = uiState,
        onAction = onAction,
    )
}

@Composable
fun HomeScreenContent(
    modifier: Modifier = Modifier,
    uiState: UiState,
    onAction: (UiAction) -> Unit,
) {
    Box(
        modifier = modifier,
        contentAlignment = Alignment.Center,
    ) {
        Text(
            text = "HomeScreen Content",
            fontSize = 24.sp,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenScreenPreview(
    @PreviewParameter(HomeScreenScreenPreviewProvider::class) uiState: UiState,
) {
    HomeScreenScreen(
        uiState = uiState,
        uiEffect = emptyFlow(),
        onAction = {},
    )
}