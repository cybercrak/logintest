package com.example.notesmanager

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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController


@ExperimentalFoundationApi
@Composable
fun sem5_Qbank(navController: NavController){
    val images = (0..7).toList()
    Spacer(modifier = Modifier.padding(30.dp))
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

                Image(
                    painter = painterResource(id = R.drawable.bca),
                    contentDescription = "",
                    modifier = Modifier
                        .width(75.dp)
                        .height(75.dp)
                        .padding(5.dp)
                        .clickable(
                            onClick = {
                                navController.navigate("osqbank")
                            }
                        )
                )


                Column(
                ) {

                    Text(
                        text = "Operating System(OS)", fontWeight = FontWeight.Bold,
                        fontSize = 15.sp
                    )


                }
            }
        }
        item {
            Row(
                modifier = Modifier
                    .fillMaxSize(),
                verticalAlignment = Alignment.CenterVertically

            ) {

                Image(
                    painter = painterResource(id = R.drawable.android_studio),
                    contentDescription = "",
                    modifier = Modifier
                        .width(75.dp)
                        .height(75.dp)
                        .padding(5.dp)
                        .clickable(
                            onClick = {
                                navController.navigate("madqbank")
                            }
                        )
                )


                Column(
                ) {

                    Text(
                        text = "Mobile Application Development(MAD)", fontWeight = FontWeight.Bold,
                        fontSize = 15.sp
                    )


                }
            }
        }
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top
    ) {

        Text(
            "SEMESTER 5",
            fontSize = 20.sp,
            fontFamily = FontFamily.Monospace,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )

    }

}