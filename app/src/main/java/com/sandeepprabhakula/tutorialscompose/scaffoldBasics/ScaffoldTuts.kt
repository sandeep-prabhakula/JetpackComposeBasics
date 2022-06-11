package com.sandeepprabhakula.tutorialscompose.scaffoldBasics

import android.view.Gravity
import android.widget.Toast
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight

@Composable
fun ScaffoldExample() {
    val context = LocalContext.current
    val toast = Toast.makeText(context, "Clicked FAB", Toast.LENGTH_SHORT)
//    val scaffoldState = rememberScaffoldState(rememberDrawerState(initialValue = DrawerValue.Open))
    toast.setGravity(Gravity.CENTER, 0, 0)
    Scaffold(floatingActionButton = {
        FloatingActionButton(onClick = { toast.show() }) {
            Text(text = "+", fontWeight = FontWeight.Bold)
        }
    }, floatingActionButtonPosition = FabPosition.Center,
        drawerContent = { Text(text = "Chats") },
        topBar = {
            TopAppBar(title = { Text("Scaffold test") }, backgroundColor = Color.Green)
        },
        bottomBar = {
            val selectedIndex = remember { mutableStateOf(0) }
            BottomAppBar(cutoutShape = CircleShape, backgroundColor = Color.Blue) {
                BottomNavigationItem(icon = {
                    Icon(imageVector = Icons.Default.Home, "")
                },
                    label = { Text(text = "Home") },
                    selected = (selectedIndex.value == 0),
                    onClick = {
                        selectedIndex.value = 0
                    })

                BottomNavigationItem(icon = {
                    Icon(imageVector = Icons.Default.Person, "")
                },
                    label = { Text(text = "Profile") },
                    selected = (selectedIndex.value == 2),
                    onClick = {
                        selectedIndex.value = 2
                    })
            }
        }, isFloatingActionButtonDocked = true
    ) {

    }
}