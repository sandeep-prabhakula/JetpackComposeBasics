package com.sandeepprabhakula.tutorialscompose.basicsOfCompose

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.selection.DisableSelection
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TextCustomization() {
    // order of execution of ui is pretty much important
    Text(
        buildAnnotatedString {
            withStyle(
                style = SpanStyle(
                    fontSize = 30.sp,
                    color = MaterialTheme.colors.primary
                )
            ) {
                append('A')
            }
            append('B')
            append('C')
            append('D')
            append('E')

        },
        modifier = Modifier
            .padding(16.dp),
        color = Color.Black,
    )
}

@Composable
fun TextSelection() {
    SelectionContainer {
        Column(modifier = Modifier.fillMaxSize()) {
            TextCustomization()
            DisableSelection {
                TextCustomization()
            }
            TextCustomization()
        }
    }
}