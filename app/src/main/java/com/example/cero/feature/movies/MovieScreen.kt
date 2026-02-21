package com.example.cero.feature.movies

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import coil.compose.AsyncImage

@Preview
@Composable
fun MovieScreen(
    viewModel: MovieViewModel = hiltViewModel()
) {
    val movies by viewModel.state.collectAsState()

    Box(modifier = Modifier.fillMaxSize(1f)){
        LazyColumn {
            items(movies) { movie ->
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                      //  .background(Color.Blue)
                        .padding(16.dp)
                ) {
                    Row {
                        Text(text = movie.title)
                        AsyncImage(
                            model = "https://image.tmdb.org/t/p/w500${movie.posterUrl}",
                            contentDescription = movie.title
                        )

                    }
                    Column {
                        Text(text = movie.overview)

                    }

                }

            }
        }

    }

}