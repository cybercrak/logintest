package com.example.notesmanager

import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Toast
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.PermDeviceInformation
import androidx.compose.material.icons.outlined.Person
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.navigation.NavHostController


@ExperimentalFoundationApi
@Composable
fun About(navController: NavHostController) {
    val context = LocalContext.current
    val images = (0..2).toList()
    Row(
        modifier = Modifier
            .fillMaxSize()
            .padding(bottom = 30.dp),
        verticalAlignment = Alignment.Top
    ) {
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
                            text = "About", fontFamily = FontFamily.Monospace,
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
            .padding(top = 50.dp, end = 10.dp),

        ) {
        val images = (0..7).toList()
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
                        Icons.Outlined.Person,
                        "info",
                        tint = MaterialTheme.colors.primary
                    )
                    Column() {
                        TextButton(
                            onClick = {
                                navController.navigate("wix")

                            }
                        ) {

                            Text(
                                text = "About developer",
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
                        Icons.Outlined.PermDeviceInformation,
                        "info",
                        tint = MaterialTheme.colors.primary
                    )
                    Column() {
                        TextButton(
                            onClick = {
                                navController.navigate("softwarelicenses")
                            }
                        ) {
                            Text(
                                "Software licences",
                                fontWeight = FontWeight.Bold,
                                fontSize = 14.sp,
                                color = MaterialTheme.colors.onBackground
                            )
                        }

                    }
                }
            }
        }
    }
}

