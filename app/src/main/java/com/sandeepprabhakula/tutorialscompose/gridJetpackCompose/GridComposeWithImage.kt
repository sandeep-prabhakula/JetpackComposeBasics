package com.sandeepprabhakula.tutorialscompose.gridJetpackCompose

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun GridImages() {
    LazyVerticalGrid(cells = GridCells.Adaptive(100.dp), content = {
            items(100){
                ImageTile()
            }
    })
}

@Composable
fun ImageTile() {
    Box(
        modifier = Modifier
            .aspectRatio(1f)
            .padding(5.dp), contentAlignment = Alignment.Center
    ) {
        val painter = rememberAsyncImagePainter(model = "https://i.redd.it/n2q3exoskxl51.jpg")
        Image(painter = painter, contentDescription = "image")
    }
}