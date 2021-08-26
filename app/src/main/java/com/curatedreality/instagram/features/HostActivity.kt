package com.curatedreality.instagram.features

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.curatedreality.instagram.features.common.Stories
import com.curatedreality.instagram.features.common.TopBar
import com.curatedreality.instagram.features.home.Feed
import com.curatedreality.instagram.features.home.FeedHeader
import com.curatedreality.instagram.features.home.SingleImageFeedItem
import com.curatedreality.instagram.features.home.SingleImageItem
import com.curatedreality.instagram.features.models.Story
import com.curatedreality.instagram.ui.theme.InstagramCloneTheme

val feed = mutableListOf(SingleImageItem(
    "https://images.unsplash.com/photo-1628690530954-c065d38e74d2?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=1650&q=80",
    aspectRatio = 2f
    )
    ,SingleImageItem(
        "https://images.unsplash.com/photo-1628676764031-084e8fd5443f?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=668&q=80",
    ),
    SingleImageItem(
        "https://images.unsplash.com/photo-1628690530954-c065d38e74d2?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=1650&q=80",
        aspectRatio = 2f
    )
    ,SingleImageItem(
        "https://images.unsplash.com/photo-1627662056294-94fa1ac27a06?ixid=MnwxMjA3fDF8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=1650&q=80",
    ),
    SingleImageItem(
        "https://images.unsplash.com/photo-1628690530954-c065d38e74d2?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=1650&q=80",
        aspectRatio = 2f
    )
    ,SingleImageItem(
        "https://images.unsplash.com/photo-1628676764031-084e8fd5443f?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=668&q=80",
    )
)

class HostActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            InstagramCloneTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Scaffold(
                        topBar = { TopBar() },
                        content = { HomeContent(feed) }
                    )
                }
            }
        }
    }
}

@Composable
fun HomeContent(feed: List<SingleImageItem>) {
    Column {
        Stories(storyList = setupStoryData())
        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier.background(Color(0xFFEFEFEF))
        ) {
            feed.forEach {
                item {
                    Feed(
                        header = { FeedHeader() },
                        content = { SingleImageFeedItem(sourceItem = it) },
                    )
                }
            }
        }
    }
}


private fun setupStoryData(): List<Story> {
    val stories = mutableListOf<Story>()
    for (index in 1..100) {
        stories.add(Story("User $index", "https://randomuser.me/api/portraits/women/$index.jpg"))
    }
    return stories
}
