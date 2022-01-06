package com.example.notesmanager

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import androidx.compose.material.icons.outlined.PermDeviceInformation
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat
import androidx.navigation.NavHostController


@ExperimentalFoundationApi
@Composable
fun about_app(navController: NavHostController) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 50.dp, end = 10.dp),

        ) {
        val images = (0..9).toList()
        LazyVerticalGrid(
            cells = GridCells.Fixed(2),
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
                        Icons.Outlined.Api,
                        "version",
                        tint = MaterialTheme.colors.primary
                    )
                    Column() {
                        TextButton(onClick = { },enabled =false){
                            Text("Version",
                            fontSize = 12.sp)
                        }
                            Text(
                                text = "2.0.1",
                                fontSize = 12.sp
                            )
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
                        Icons.Outlined.Handyman,
                        "tool",
                        tint = MaterialTheme.colors.primary
                    )
                    Column() {
                        TextButton(onClick = { },enabled =false){
                            Text("Developed platform",
                                fontSize = 12.sp)
                        }
                            Text(
                                "Android studio",
                                fontSize = 12.sp
                            )
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
                        Icons.Outlined.Android,
                        "tool",
                        tint = MaterialTheme.colors.primary
                    )
                    Column() {
                        TextButton(onClick = { }, enabled = false) {
                            Text(
                                "Supported OS",
                                fontSize = 12.sp
                            )
                        }
                        Text(
                            "Android",
                            fontSize = 12.sp
                        )
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
                                Icons.Outlined.DevicesOther,
                                "screen size",
                                tint = MaterialTheme.colors.primary
                            )
                            Column() {
                                TextButton(onClick = { },enabled =false){
                                    Text("Screen size",
                                        fontSize = 12.sp)
                                }
                                Text(
                                    "Free size",
                                    fontSize = 12.sp
                                )
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
                                Icons.Outlined.DeveloperMode,
                                "tool",
                                tint = MaterialTheme.colors.primary
                            )
                            Column() {
                                TextButton(onClick = { },enabled =false){
                                    Text("Language",
                                        fontSize = 12.sp)
                                }
                                Text(
                                    "Kotlin",
                                    fontSize = 12.sp
                                )
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
                                Icons.Outlined.MobileFriendly,
                                "requirement",
                                tint = MaterialTheme.colors.primary
                            )
                            Column() {
                                TextButton(onClick = { },enabled =false){
                                    Text("Requirement",
                                        fontSize = 12.sp)
                                }
                                Text(
                                    "2GB RAM",
                                    fontSize = 12.sp
                                )
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
                                Icons.Outlined.ScreenRotation,
                                "orientation",
                                tint = MaterialTheme.colors.primary
                            )
                            Column() {
                                TextButton(onClick = { },enabled =false){
                                    Text("Supported orientation",
                                        fontSize = 12.sp)
                                }
                                Text(
                                    "Landscape & portrait",
                                    fontSize = 12.sp
                                )
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
                                Icons.Outlined.Security,
                                "privacy",
                                tint = MaterialTheme.colors.primary
                            )
                            Column() {
                                TextButton(onClick = { },enabled =false){
                                    Text("Privacy mode",
                                        fontSize = 12.sp)
                                }
                                Text(
                                    "Protected",
                                    fontSize = 12.sp
                                )
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
                                Icons.Outlined.Wifi,
                                "tool",
                                tint = MaterialTheme.colors.primary
                            )
                            Column() {
                                TextButton(onClick = { },enabled =false){
                                    Text("Functionality",
                                        fontSize = 12.sp)
                                }
                                Text(
                                    "Online(Recommended)",
                                    fontSize = 12.sp
                                )
                            }

                        }
                    }
                }
            }
            }


