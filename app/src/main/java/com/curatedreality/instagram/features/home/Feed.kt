package com.curatedreality.instagram.features.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun Feed(
    header: @Composable () -> Unit = {},
    content: @Composable () -> Unit = {},
    actions:  @Composable () -> Unit = {},
    comments:  @Composable () -> Unit = {},
) {
    Card {
        Column(modifier = Modifier.fillMaxWidth()) {
            header()
            content()
            actions()
            comments()
        }
    }
}