package com.example.notesmanager

import android.widget.Toast
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@ExperimentalFoundationApi
@Composable
fun Bsc_branches(navController: NavController){

    val images = (0..8).toList()
    LazyVerticalGrid(
        cells = GridCells.Fixed(3),
        contentPadding = PaddingValues(15.dp),
    ) {

        item {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id =R.drawable.maths),
                    contentDescription = "",
                    modifier = Modifier
                        .width(100.dp)
                        .height(100.dp)
                        .padding(top = 40.dp)
                        .clickable(
                            onClick = {
                                navController.navigate("underdev")

                            }
                        )
                )

                Text(
                    "Maths",
                    fontSize = 12.sp,
                    textAlign = TextAlign.Center
                )
            }
        }

        item {

            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id =R.drawable.physics),
                    contentDescription = "",
                    modifier = Modifier
                        .width(100.dp)
                        .height(100.dp)
                        .padding(top = 40.dp)
                        .clickable(
                            onClick = {
                                navController.navigate("underdev")

                            }
                        )
                )

                Text(
                    "Physics",
                    fontSize = 12.sp,
                    textAlign = TextAlign.Center

                )
            }
        }
        item {

            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id =R.drawable.che),
                    contentDescription = "",
                    modifier = Modifier
                        .width(100.dp)
                        .height(100.dp)
                        .padding(top = 40.dp)
                        .clickable(
                            onClick = {
                                navController.navigate("underdev")

                            }
                        )
                )

                Text(
                    "Chemistry",
                    fontSize = 12.sp,
                    textAlign = TextAlign.Center


                )
            }
        }
        item {

            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id =R.drawable.electronics),
                    contentDescription = "",
                    modifier = Modifier
                        .width(100.dp)
                        .height(100.dp)
                        .padding(top = 40.dp)
                        .clickable(
                            onClick = {
                                navController.navigate("underdev")

                            }
                        )
                )

                Text(
                    "Electronics",
                    fontSize = 12.sp,
                    textAlign = TextAlign.Center


                )
            }
        }
        item {

            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id =R.drawable.bioche),
                    contentDescription = "",
                    modifier = Modifier
                        .width(100.dp)
                        .height(100.dp)
                        .padding(top = 40.dp)
                        .clickable(
                            onClick = {
                                navController.navigate("underdev")

                            }
                        )
                )

                Text(
                    "Biochemistry",
                    fontSize = 12.sp,
                    textAlign = TextAlign.Center


                )
            }
        }
        item {

            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id =R.drawable.csc),
                    contentDescription = "",
                    modifier = Modifier
                        .width(100.dp)
                        .height(100.dp)
                        .padding(top = 40.dp)
                        .clickable(
                            onClick = {
                                navController.navigate("underdev")

                            }
                        )
                )

                Text(
                    "Computer Science",
                    fontSize = 12.sp,
                    textAlign = TextAlign.Center


                )
            }
        }

        item {

            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id =R.drawable.itech),
                    contentDescription = "",
                    modifier = Modifier
                        .width(100.dp)
                        .height(100.dp)
                        .padding(top = 40.dp)
                        .clickable(
                            onClick = {
                              navController.navigate("underdev")
                            }
                        )
                )

                Text(
                    "IT",
                    fontSize = 12.sp,
                    textAlign = TextAlign.Center


                )
            }
        }

    }
}