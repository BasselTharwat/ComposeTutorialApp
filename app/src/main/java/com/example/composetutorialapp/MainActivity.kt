package com.example.composetutorialapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composetutorialapp.ui.theme.ComposeTutorialAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeTutorialAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComposeTutorial(title = stringResource(R.string.title),
                        firstPar = stringResource(R.string.first_par),
                        secondPar = stringResource(R.string.second_par)
                    )

                }
            }
        }
    }
}

@Composable
fun ComposeTutorial(title: String, firstPar: String, secondPar: String,
                    modifier: Modifier = Modifier){
    val image = painterResource(id = R.drawable.bg_compose_background)
    Column (modifier = modifier){
        Image(painter = image,
            contentDescription = null,
            contentScale = ContentScale.FillWidth)
        Text(text = title,
            fontSize = 24.sp,
            modifier = Modifier.padding(16.dp))
        Text(text = firstPar,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp))
        Text(text = secondPar,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(16.dp))
    }


}


@Preview(showBackground = true)
@Composable
fun ComposeTutorialPreview() {
    ComposeTutorialAppTheme {
        ComposeTutorial(title = stringResource(id = R.string.title),
            firstPar = stringResource(id = R.string.first_par),
            secondPar = stringResource(id = R.string.second_par))

    }
}