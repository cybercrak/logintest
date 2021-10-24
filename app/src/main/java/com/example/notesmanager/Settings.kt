package com.example.notesmanager

import android.widget.Toast
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material.icons.outlined.DarkMode
import androidx.compose.material.icons.outlined.LightMode
import androidx.compose.material.icons.outlined.Logout
import androidx.compose.material.icons.outlined.Update

import androidx.navigation.NavHostController

@ExperimentalFoundationApi
@Composable
fun Settings (navController: NavHostController) {
    val context = LocalContext.current
    Row(
        modifier = Modifier
            .fillMaxSize()
            .padding(bottom = 30.dp),
        verticalAlignment = Alignment.Top) {
        LazyVerticalGrid(
            cells = GridCells.Fixed(1),
            contentPadding = PaddingValues(15.dp)
        ) {
            item {
                Row(
                    modifier = Modifier
                        .fillMaxSize(),
                    verticalAlignment = Alignment.CenterVertically

                ) {

                    IconButton(
                        onClick = {
                            navController.navigate("main")
                        },

                        ) {
                        Icon(
                            Icons.Filled.ArrowBack,
                            "Back arrow"
                        )
                    }


                    Column(
                    ) {

                        Text(
                            text = "Settings", fontFamily = FontFamily.Monospace,
                            fontSize = 16.sp
                        )


                    }
                }
            }
        }
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 50.dp,end = 10.dp),

        ) {
        val images = (0..7).toList()
        LazyVerticalGrid(
            cells = GridCells.Fixed(1),
            contentPadding = PaddingValues(15.dp)
        ) {

            item {
                Row(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(30.dp),
                    verticalAlignment = Alignment.CenterVertically

                ) {

                    Icon(
                        Icons.Outlined.Update,
                        "update",
                        tint = MaterialTheme.colors.primary
                    )



            Column(){
                        TextButton(
                            onClick = {
                                Toast.makeText(
                                    context, "check back later",
                                    Toast.LENGTH_LONG
                                )
                                    .show()
                            }
                        ) {
                            Text(
                                text = "Update",
                                fontWeight = FontWeight.Bold,
                                fontSize = 14.sp,
                                color = MaterialTheme.colors.onBackground
                            )
                        }
                        }
                    }
                }


            item {
                Row(modifier = Modifier
                    .fillMaxSize()
                    .padding(30.dp),
                    verticalAlignment = Alignment.CenterVertically

                ) {


                    Icon(
                        Icons.Outlined.DarkMode,
                        "moon",
                        tint = MaterialTheme.colors.primary
                    )

                Column(){
                        TextButton(
                            onClick = {
                                Toast.makeText(
                                    context, "Switch your device to dark mode to invoke",
                                    Toast.LENGTH_LONG)
                                    .show()
                            }
                        ) {
                            Text(
                                "Dark mode",
                                fontWeight = FontWeight.Bold,
                                fontSize = 14.sp,
                                color = MaterialTheme.colors.onBackground
                            )
                        }
                    }
                    }
                }


            item {
                Row(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(30.dp),
                    verticalAlignment = Alignment.CenterVertically

                ) {

                    Icon(
                        Icons.Outlined.LightMode,
                        "light",
                        tint = MaterialTheme.colors.primary
                    )

                    Column() {
                        TextButton(
                            onClick = {
                                Toast.makeText(
                                    context, "Switch your Light to dark mode to invoke",
                                    Toast.LENGTH_LONG
                                )
                                    .show()
                            }
                        ) {
                            Text(
                                text = "Light mode",
                                fontWeight = FontWeight.Bold,
                                fontSize = 14.sp,
                                color = MaterialTheme.colors.onBackground
                            )

                        }
                    }
                }
            }


            item {
                Row(modifier = Modifier
                    .fillMaxSize()
                    .padding(30.dp),
                    verticalAlignment = Alignment.CenterVertically

                ) {


                    Icon(
                        Icons.Outlined.Logout,
                        "logout",
                        tint = MaterialTheme.colors.primary
                    )
               Column(){
                            TextButton(
                                onClick = {
                                    Toast.makeText(
                                        context,"Available Soon",
                                        Toast.LENGTH_SHORT)
                                        .show()
                                }
                            ){
                                Text("Logout",
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 14.sp,
                                color = MaterialTheme.colors.onBackground)
                            }


                        }
                }
            }
        }
    }
}
