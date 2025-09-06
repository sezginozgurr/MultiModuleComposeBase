package com.app.multimodulecomposebase.ui.homescreen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.app.multimodulecomposebase.delegation.MVI
import com.app.multimodulecomposebase.delegation.mvi
import com.app.multimodulecomposebase.ui.homescreen.HomeScreenContract.UiAction
import com.app.multimodulecomposebase.ui.homescreen.HomeScreenContract.UiEffect
import com.app.multimodulecomposebase.ui.homescreen.HomeScreenContract.UiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeScreenViewModel @Inject constructor() : ViewModel(),
    MVI<UiState, UiAction, UiEffect> by mvi(UiState()) {

    override fun onAction(uiAction: UiAction) {
        viewModelScope.launch {
        }
    }
}