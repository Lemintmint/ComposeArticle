package com.example.composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.composearticle.ui.theme.ComposeArticleTheme
import androidx.compose.ui.res.stringResource

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeArticleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //Greeting("Android")
                    DisplayImage(
                        title = stringResource(R.string.article_title),
                        first = stringResource(R.string.first_paragraph),
                        second = stringResource(id = R.string.second_paragraph)
                    )
                }
            }
        }
    }
}

/*
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}
*/

@Composable
fun DisplayImage(title: String, first: String, second: String, modifier: Modifier = Modifier) {
    val bannerImage = painterResource(R.drawable.bg_compose_background)
    Image(
        painter = bannerImage,
        contentDescription = null,
        contentScale = ContentScale.Fit,
        alignment = Alignment.TopCenter
    )
    Text(
        title = title,
        first = first,
        second = second
    )
}

@Composable
fun Text(title: String, first: String, second: String, modifier: Modifier = Modifier) {
    Column(

    ) {
        Text(
            text = title
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeArticleTheme {
        //Greeting("Android")
        DisplayImage()
    }
}