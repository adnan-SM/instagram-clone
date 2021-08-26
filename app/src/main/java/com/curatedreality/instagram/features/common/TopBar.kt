package com.curatedreality.instagram.features.common

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter

@Composable
fun TopBar() {
    Header()
}

@Composable
fun Header() {
    Column {
        Row(
            Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Image(painter = rememberImagePainter("https://www.searchpng.com/wp-content/uploads/2019/02/Instagram-Camera-Icon-PNG.png"), contentDescription = "New Photo", modifier = Modifier
                .padding(8.dp)
                .padding(start = 12.dp)
                .width(32.dp)
            )
            Image(painter = rememberImagePainter("https://upload.wikimedia.org/wikipedia/commons/thumb/2/2a/Instagram_logo.svg/1024px-Instagram_logo.svg.png"), contentDescription = "New Photo", modifier = Modifier
                .padding(8.dp)
                .width(128.dp)
            )
            Image(painter = rememberImagePainter("https://static.thenounproject.com/png/3861743-200.png"), contentDescription = "New Photo", modifier = Modifier
                .padding(8.dp)
                .padding(end = 12.dp)
                .width(32.dp)
            )
        }
        Divider()
    }
}