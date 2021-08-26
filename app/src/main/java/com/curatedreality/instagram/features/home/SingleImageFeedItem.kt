package com.curatedreality.instagram.features.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import coil.compose.rememberImagePainter

data class SingleImageItem(
    val sourceUrl: String,
    val contentDescription: String = "Feed Image",
    val aspectRatio: Float = 1.2f
)

@Composable
fun SingleImageFeedItem(sourceItem: SingleImageItem) {
    Image(painter = rememberImagePainter(
        data = sourceItem.sourceUrl),
        contentDescription = sourceItem.contentDescription,
        modifier = Modifier
            .fillMaxWidth()
            .aspectRatio(sourceItem.aspectRatio),
        contentScale = ContentScale.Crop
    )
}