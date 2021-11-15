package com.example.notesmanager

import android.content.Intent
import android.content.Intent.*
import android.net.Uri
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.material.icons.outlined.ReportProblem
import androidx.compose.material.icons.outlined.Feedback
import androidx.compose.material.icons.outlined.Mail
import androidx.compose.runtime.remember
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity
import androidx.navigation.NavHostController

@ExperimentalFoundationApi
@Composable
fun Contact (navController: NavHostController) {
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
                            text = "Contact", fontFamily = FontFamily.Monospace,
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
                        Icons.Outlined.ReportProblem,
                        "problem",
                        tint = Color.Red
                    )

                    Column() {
                        val intent  = Intent(ACTION_SENDTO).apply{
                            data = Uri.parse("mailto:nsarran37@gmail.com")
                        }

                        intent.putExtra(Intent.EXTRA_SUBJECT,"Issue occured")
                        intent.setPackage("com.google.android.gm")

                        TextButton(
                            onClick = {
                                startActivity(context, intent, null)
                            }
                        ) {
                            Text(
                                "Report problem",
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
                        Icons.Outlined.Feedback,
                        "feedback",
                        tint = MaterialTheme.colors.primary
                    )
                    Column() {
                        TextButton(
                            onClick = {
                                Toast.makeText(
                                    context, "Available Soon",
                                    Toast.LENGTH_SHORT
                                )
                                    .show()
                            }
                        ) {
                            Text(
                                "Feedback",
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
                        Icons.Outlined.Mail,
                        "contact",
                        tint = MaterialTheme.colors.primary
                    )

                    Column() {
                        val intent  = Intent(ACTION_SENDTO).apply{
                            data = Uri.parse("mailto:nsarran37@gmail.com")
                        }
                        intent.putExtra(EXTRA_SUBJECT,"Friend Request")
                        intent.setPackage("com.google.android.gm")

                        TextButton(
                            onClick = {
                                startActivity(context, intent, null)
                            }
                        ) {
                            Text(
                                "Developer Contact",
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



