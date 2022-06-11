package com.sandeepprabhakula.tutorialscompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.sandeepprabhakula.tutorialscompose.calculator.CalculatorUtils
import com.sandeepprabhakula.tutorialscompose.gridJetpackCompose.GridImages
import com.sandeepprabhakula.tutorialscompose.scaffoldBasics.ScaffoldExample
import com.sandeepprabhakula.tutorialscompose.ui.theme.TutorialsComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TutorialsComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ScaffoldExample()
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    TutorialsComposeTheme {
        ScaffoldExample()
    }
}