package com.curatedreality.instagram.features.common

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource

@Composable
fun ClickableIcons(resourceId: Int, contentDescription: String = "" , action: () -> Unit) {
    Image(
        painterResource(id = resourceId),
        contentDescription = contentDescription,
    )
}