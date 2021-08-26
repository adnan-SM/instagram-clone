package com.curatedreality.instagram.features.home

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import com.curatedreality.instagram.R
import com.curatedreality.instagram.features.common.ClickableIcons

@Composable
fun FeedHeader() {
    Row (
        Modifier.fillMaxWidth().padding(16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Row ( verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start) {
            Image(
                painter = rememberImagePainter("https://randomuser.me/api/portraits/women/3.jpg"),
                contentDescription = "",
                modifier =
                Modifier
                    .width(42.dp)
                    .height(42.dp)
                    .padding(4.dp)
                    .clip(CircleShape)

            )
            Column(
                horizontalAlignment = Alignment.Start,
                verticalArrangement = Arrangement.Center,
            ) {
                Text(text = "Jenifer")
                Text(text = "Holland, Rotterdam")
            }
        }
        ClickableIcons(resourceId = R.drawable.overflow_horizontal) {
            Log.d("Instagram", "Clicked on overflow menu")
        }
    }
}
