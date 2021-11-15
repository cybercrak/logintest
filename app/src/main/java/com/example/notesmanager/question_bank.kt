package com.example.notesmanager

import android.widget.Toast
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@ExperimentalFoundationApi
@Composable
fun qbank(navController: NavController){
    val context = LocalContext.current

    val images = (0..7).toList()
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
                    painter = painterResource(id =R.drawable.bca),
                    contentDescription = "",
                    modifier = Modifier
                        .width(100.dp)
                        .height(100.dp)
                        .padding(top = 40.dp)
                        .clickable(
                            onClick = {
                                navController.navigate("sembca")
                            }
                        )
                )

                Text(
                    "BCA",
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
                    painter = painterResource(id =R.drawable.bsc),
                    contentDescription = "",
                    modifier = Modifier
                        .width(100.dp)
                        .height(100.dp)
                        .padding(top = 40.dp)
                        .clickable(
                            onClick = {
                                Toast
                                    .makeText(
                                        context, "Available soon", Toast.LENGTH_SHORT
                                    )
                                    .show()
                            }
                        )
                )

                Text(
                    "BSC",
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
                    painter = painterResource(id =R.drawable.bcom),
                    contentDescription = "",
                    modifier = Modifier
                        .width(100.dp)
                        .height(100.dp)
                        .padding(top = 40.dp)
                        .clickable(
                            onClick = {
                                Toast
                                    .makeText(
                                        context, "Available soon", Toast.LENGTH_SHORT
                                    )
                                    .show()
                            }
                        )
                )

                Text(
                    "B.COM",
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
                    painter = painterResource(id =R.drawable.ba),
                    contentDescription = "",
                    modifier = Modifier
                        .width(100.dp)
                        .height(100.dp)
                        .padding(top = 40.dp)
                        .clickable(
                            onClick = {
                                Toast
                                    .makeText(
                                        context, "Available soon", Toast.LENGTH_SHORT
                                    )
                                    .show()
                            }
                        )
                )

                Text(
                    "BA",
                    fontSize = 12.sp,
                    textAlign = TextAlign.Center


                )
            }
        }

    }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top
    ) {

        Text(
            "QUESTION BANK",
            fontSize = 20.sp,
            fontFamily = FontFamily.Monospace,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
        Text(
            "Select Department",
            fontSize = 15.sp,
            color = MaterialTheme.colors.primary,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Serif,
            modifier = Modifier.padding(start=3.dp,top=5.dp)

        )


    }
}