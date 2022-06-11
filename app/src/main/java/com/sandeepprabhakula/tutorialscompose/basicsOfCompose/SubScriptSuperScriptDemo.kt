package com.sandeepprabhakula.tutorialscompose.basicsOfCompose

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.BaselineShift
import androidx.compose.ui.text.withStyle

@Composable
fun SubScriptSuperScriptDemo(normalText: String, superText: String) {

    Text(buildAnnotatedString {
        withStyle(
            style = SpanStyle(
                fontSize = MaterialTheme.typography.subtitle1.fontSize
            )
        ) {
            append(normalText)
        }
        withStyle(
            style = SpanStyle(
                fontSize = MaterialTheme.typography.overline.fontSize,
                baselineShift = BaselineShift.Subscript
                // baselineShift = BaselineShift.Superscript
            )
        ) {
            append(superText)
        }
    })

}