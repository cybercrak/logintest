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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController


@ExperimentalFoundationApi
@Composable
fun MAD_units(navController: NavHostController) {

    val images = (0..7).toList()
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
                        .width(100.dp)
                        .height(100.dp)
                        .padding(5.dp)
                        .clickable(
                            onClick = {
                                navController.navigate("madnotes")
                            }
                        )
                )


                Column(
                ) {

                    Text(
                        text = "Unit 1", fontWeight = FontWeight.Bold,
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
                        .width(100.dp)
                        .height(100.dp)
                        .padding(5.dp)
                        .clickable(
                            onClick = {
                                navController.navigate("madnotes")
                            }
                        )
                )


                Column(
                ) {

                    Text(
                        text = "Unit 2", fontWeight = FontWeight.Bold,
                        fontSize = 15.sp
                    )


                }
            }
        }
    }
}








