package com.curatedreality.instagram.features.common

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import com.curatedreality.instagram.features.models.Story

@Composable
fun Stories(storyList: List<Story>) {
    LazyRow (
        contentPadding = PaddingValues(12.dp),
        horizontalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        storyList.forEach {
            item {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Top,
                ) {
                    val gradientStartColor = Color(0xFFA657B2)
                    val gradientEndColor = Color(0xFFF3AF5B)
                    val verticalGradientBrush = Brush.verticalGradient(
                        colors = listOf(gradientStartColor, gradientEndColor)
                    )

                    Image(
                        painter = rememberImagePainter(it.profileImage),
                        contentDescription = "",
                        modifier =
                        Modifier
                            .width(96.dp)
                            .height(96.dp)
                            .border(2.dp, verticalGradientBrush, CircleShape)
                            .padding(4.dp)
                            .clip(CircleShape)

                    )
                    Text(
                        text = it.name,
                    )
                }
            }
        }
    }
}