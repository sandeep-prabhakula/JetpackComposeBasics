package com.sandeepprabhakula.tutorialscompose.basicsOfCompose

import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun RowColumnDemo() {
    Row(
        modifier = Modifier
            .fillMaxSize(),
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically,

        ) {
        CustomItem(weight = 3f, color = MaterialTheme.colors.secondary)
        CustomItem(weight = 1f)
    }
}

@Composable
fun RowScope.CustomItem(weight: Float, color: Color = MaterialTheme.colors.error) {
    Surface(
        modifier = Modifier
            .width(50.dp)
            .height(50.dp)
            .weight(weight),
        color = color
    ) {
    }
}