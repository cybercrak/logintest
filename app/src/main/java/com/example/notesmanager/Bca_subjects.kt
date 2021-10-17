package com.example.notesmanager

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.notesmanager.ui.theme.DarkBlue
import com.example.notesmanager.ui.theme.DarkRed
import com.example.notesmanager.ui.theme.lightBlue
import com.example.notesmanager.ui.theme.lightRed

@Composable
fun Bca_yearselection(navController: NavHostController) {
    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {
        item {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 20.dp),
                horizontalAlignment = Alignment.Start
            ) {


                Text(
                    "SEMESTER 1",
                    fontSize = 20.sp,
                    fontFamily = FontFamily.Monospace,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(bottom = 30.dp)
                )
            }

            LazyRow(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
            ) {
                item {
                    Card(
                        modifier = Modifier
                            .width(200.dp)
                            .height(200.dp)
                            .padding(10.dp),
                        elevation = 20.dp,
                        shape = RoundedCornerShape(10.dp)
                    ) {

                        Text(
                            "sub 1", textAlign = TextAlign.Center, fontWeight = FontWeight.Bold,
                            fontSize = 30.sp, modifier = Modifier.padding(10.dp)
                        )

                    }
                }
                item {
                    Card(
                        modifier = Modifier
                            .width(200.dp)
                            .height(200.dp)
                            .padding(10.dp),
                        elevation = 20.dp,
                        shape = RoundedCornerShape(10.dp)
                    ) {

                        Text(
                            "sub 2", textAlign = TextAlign.Center, fontWeight = FontWeight.Bold,
                            fontSize = 30.sp, modifier = Modifier.padding(10.dp)
                        )

                    }
                }
                item {
                    Card(
                        modifier = Modifier
                            .width(200.dp)
                            .height(200.dp)
                            .padding(10.dp),
                        elevation = 20.dp,
                        shape = RoundedCornerShape(10.dp)
                    ) {

                        Text(
                            "sub 3", textAlign = TextAlign.Center, fontWeight = FontWeight.Bold,
                            fontSize = 30.sp, modifier = Modifier.padding(10.dp)
                        )

                    }
                }
                item {
                    Card(
                        modifier = Modifier
                            .width(200.dp)
                            .height(200.dp)
                            .padding(10.dp),
                        elevation = 20.dp,
                        shape = RoundedCornerShape(10.dp)
                    ) {

                        Text(
                            "sub 4", textAlign = TextAlign.Center, fontWeight = FontWeight.Bold,
                            fontSize = 30.sp, modifier = Modifier.padding(10.dp)
                        )

                    }
                }
                item {
                    Card(
                        modifier = Modifier
                            .width(200.dp)
                            .height(200.dp)
                            .padding(10.dp),
                        elevation = 20.dp,
                        shape = RoundedCornerShape(10.dp)
                    ) {

                        Text(
                            "sub 5", textAlign = TextAlign.Center, fontWeight = FontWeight.Bold,
                            fontSize = 30.sp, modifier = Modifier.padding(10.dp)
                        )

                    }
                }
                item {
                    Card(
                        modifier = Modifier
                            .width(200.dp)
                            .height(200.dp)
                            .padding(10.dp),
                        elevation = 20.dp,
                        shape = RoundedCornerShape(10.dp)
                    ) {

                        Text(
                            "sub 6", textAlign = TextAlign.Center, fontWeight = FontWeight.Bold,
                            fontSize = 30.sp, modifier = Modifier.padding(10.dp)
                        )

                    }
                }

            }
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 30.dp),
                horizontalAlignment = Alignment.Start
            ) {


                Text(
                    "SEMESTER 2",
                    fontSize = 20.sp,
                    fontFamily = FontFamily.Monospace,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(bottom = 30.dp)
                )
            }

            LazyRow(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
            ) {
                item {
                    Card(
                        modifier = Modifier
                            .width(200.dp)
                            .height(200.dp)
                            .padding(10.dp),
                        elevation = 20.dp,
                        shape = RoundedCornerShape(10.dp)
                    ) {

                        Text(
                            "sub 1", textAlign = TextAlign.Center, fontWeight = FontWeight.Bold,
                            fontSize = 30.sp, modifier = Modifier.padding(10.dp)
                        )

                    }
                }
                item {
                    Card(
                        modifier = Modifier
                            .width(200.dp)
                            .height(200.dp)
                            .padding(10.dp),
                        elevation = 20.dp,
                        shape = RoundedCornerShape(10.dp)
                    ) {

                        Text(
                            "sub 2", textAlign = TextAlign.Center, fontWeight = FontWeight.Bold,
                            fontSize = 30.sp, modifier = Modifier.padding(10.dp)
                        )

                    }
                }
                item {
                    Card(
                        modifier = Modifier
                            .width(200.dp)
                            .height(200.dp)
                            .padding(10.dp),
                        elevation = 20.dp,
                        shape = RoundedCornerShape(10.dp)
                    ) {

                        Text(
                            "sub 3", textAlign = TextAlign.Center, fontWeight = FontWeight.Bold,
                            fontSize = 30.sp, modifier = Modifier.padding(10.dp)
                        )

                    }
                }
                item {
                    Card(
                        modifier = Modifier
                            .width(200.dp)
                            .height(200.dp)
                            .padding(10.dp),
                        elevation = 20.dp,
                        shape = RoundedCornerShape(10.dp)
                    ) {

                        Text(
                            "sub 4", textAlign = TextAlign.Center, fontWeight = FontWeight.Bold,
                            fontSize = 30.sp, modifier = Modifier.padding(10.dp)
                        )

                    }
                }
                item {
                    Card(
                        modifier = Modifier
                            .width(200.dp)
                            .height(200.dp)
                            .padding(10.dp),
                        elevation = 20.dp,
                        shape = RoundedCornerShape(10.dp)
                    ) {

                        Text(
                            "sub 5", textAlign = TextAlign.Center, fontWeight = FontWeight.Bold,
                            fontSize = 30.sp, modifier = Modifier.padding(10.dp)
                        )

                    }
                }
                item {
                    Card(
                        modifier = Modifier
                            .width(200.dp)
                            .height(200.dp)
                            .padding(10.dp),
                        elevation = 20.dp,
                        shape = RoundedCornerShape(10.dp)

                    ) {

                        Text(
                            "sub 6", textAlign = TextAlign.Center, fontWeight = FontWeight.Bold,
                            fontSize = 30.sp, modifier = Modifier.padding(10.dp)
                        )

                    }
                }


            }


            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 30.dp),
                horizontalAlignment = Alignment.Start
            ) {


                Text(
                    "SEMESTER 3",
                    fontSize = 20.sp,
                    fontFamily = FontFamily.Monospace,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(bottom = 30.dp)
                )
            }

            LazyRow(
                modifier = Modifier
                    .fillMaxWidth()
                  //  .padding(top = 630.dp)
                    .wrapContentHeight()
            ) {
                item {
                    Card(
                        modifier = Modifier
                            .width(200.dp)
                            .height(200.dp)
                            .padding(10.dp),
                        elevation = 20.dp,
                        shape = RoundedCornerShape(10.dp)
                    ) {

                        Text(
                            "sub 1", textAlign = TextAlign.Center, fontWeight = FontWeight.Bold,
                            fontSize = 30.sp, modifier = Modifier.padding(10.dp)
                        )

                    }
                }
                item {
                    Card(
                        modifier = Modifier
                            .width(200.dp)
                            .height(200.dp)
                            .padding(10.dp),
                        elevation = 20.dp,
                        shape = RoundedCornerShape(10.dp)
                    ) {

                        Text(
                            "sub 2", textAlign = TextAlign.Center, fontWeight = FontWeight.Bold,
                            fontSize = 30.sp, modifier = Modifier.padding(10.dp)
                        )

                    }
                }
                item {
                    Card(
                        modifier = Modifier
                            .width(200.dp)
                            .height(200.dp)
                            .padding(10.dp),
                        elevation = 20.dp,
                        shape = RoundedCornerShape(10.dp)
                    ) {

                        Text(
                            "sub 3", textAlign = TextAlign.Center, fontWeight = FontWeight.Bold,
                            fontSize = 30.sp, modifier = Modifier.padding(10.dp)
                        )

                    }
                }
                item {
                    Card(
                        modifier = Modifier
                            .width(200.dp)
                            .height(200.dp)
                            .padding(10.dp),
                        elevation = 20.dp,
                        shape = RoundedCornerShape(10.dp)
                    ) {

                        Text(
                            "sub 4", textAlign = TextAlign.Center, fontWeight = FontWeight.Bold,
                            fontSize = 30.sp, modifier = Modifier.padding(10.dp)
                        )

                    }
                }
                item {
                    Card(
                        modifier = Modifier
                            .width(200.dp)
                            .height(200.dp)
                            .padding(10.dp),
                        elevation = 20.dp,
                        shape = RoundedCornerShape(10.dp)
                    ) {

                        Text(
                            "sub 5", textAlign = TextAlign.Center, fontWeight = FontWeight.Bold,
                            fontSize = 30.sp, modifier = Modifier.padding(10.dp)
                        )

                    }
                }
                item {
                    Card(
                        modifier = Modifier
                            .width(200.dp)
                            .height(200.dp)
                            .padding(10.dp),
                        elevation = 20.dp,
                        shape = RoundedCornerShape(10.dp)

                    ) {

                        Text(
                            "sub 6", textAlign = TextAlign.Center, fontWeight = FontWeight.Bold,
                            fontSize = 30.sp, modifier = Modifier.padding(10.dp)
                        )

                    }
                }
            }


            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 30.dp),
                horizontalAlignment = Alignment.Start
            ) {


                Text(
                    "SEMESTER 4",
                    fontSize = 20.sp,
                    fontFamily = FontFamily.Monospace,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(bottom = 30.dp)
                )
            }

            LazyRow(
                modifier = Modifier
                    .fillMaxWidth()
                  //  .padding(top = 930.dp)
                    .wrapContentHeight()
            ) {
                item {
                    Card(
                        modifier = Modifier
                            .width(200.dp)
                            .height(200.dp)
                            .padding(10.dp),
                        elevation = 20.dp,
                        shape = RoundedCornerShape(10.dp)
                    ) {

                        Text(
                            "sub 1", textAlign = TextAlign.Center, fontWeight = FontWeight.Bold,
                            fontSize = 30.sp, modifier = Modifier.padding(10.dp)
                        )

                    }
                }
                item {
                    Card(
                        modifier = Modifier
                            .width(200.dp)
                            .height(200.dp)
                            .padding(10.dp),
                        elevation = 20.dp,
                        shape = RoundedCornerShape(10.dp)
                    ) {

                        Text(
                            "sub 2", textAlign = TextAlign.Center, fontWeight = FontWeight.Bold,
                            fontSize = 30.sp, modifier = Modifier.padding(10.dp)
                        )

                    }
                }
                item {
                    Card(
                        modifier = Modifier
                            .width(200.dp)
                            .height(200.dp)
                            .padding(10.dp),
                        elevation = 20.dp,
                        shape = RoundedCornerShape(10.dp)
                    ) {

                        Text(
                            "sub 3", textAlign = TextAlign.Center, fontWeight = FontWeight.Bold,
                            fontSize = 30.sp, modifier = Modifier.padding(10.dp)
                        )

                    }
                }
                item {
                    Card(
                        modifier = Modifier
                            .width(200.dp)
                            .height(200.dp)
                            .padding(10.dp),
                        elevation = 20.dp,
                        shape = RoundedCornerShape(10.dp)
                    ) {

                        Text(
                            "sub 4", textAlign = TextAlign.Center, fontWeight = FontWeight.Bold,
                            fontSize = 30.sp, modifier = Modifier.padding(10.dp)
                        )

                    }
                }
                item {
                    Card(
                        modifier = Modifier
                            .width(200.dp)
                            .height(200.dp)
                            .padding(10.dp),
                        elevation = 20.dp,
                        shape = RoundedCornerShape(10.dp)
                    ) {

                        Text(
                            "sub 5", textAlign = TextAlign.Center, fontWeight = FontWeight.Bold,
                            fontSize = 30.sp, modifier = Modifier.padding(10.dp)
                        )

                    }
                }
                item {
                    Card(
                        modifier = Modifier
                            .width(200.dp)
                            .height(200.dp)
                            .padding(10.dp),
                        elevation = 20.dp,
                        shape = RoundedCornerShape(10.dp)

                    ) {

                        Text(
                            "sub 6", textAlign = TextAlign.Center, fontWeight = FontWeight.Bold,
                            fontSize = 30.sp, modifier = Modifier.padding(10.dp)
                        )

                    }
                }
            }

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 30.dp),
                horizontalAlignment = Alignment.Start
            ) {


                Text(
                    "SEMESTER 5",
                    fontSize = 20.sp,
                    fontFamily = FontFamily.Monospace,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(bottom = 30.dp)
                )
            }

            LazyRow(
                modifier = Modifier
                    .fillMaxWidth()
                   // .padding(top = 1230.dp)
                    .wrapContentHeight()
            ) {
                item {
                    Card(
                        modifier = Modifier
                            .width(200.dp)
                            .height(200.dp)
                            .padding(10.dp),
                        elevation = 20.dp,
                        shape = RoundedCornerShape(10.dp)
                    ) {

                        Text(
                            "Operating System", textAlign = TextAlign.Center, fontWeight = FontWeight.Bold,
                            fontSize = 30.sp, modifier = Modifier.padding(10.dp)
                        )

                    }
                }
                item {
                    Card(
                        modifier = Modifier
                            .width(200.dp)
                            .height(200.dp)
                            .padding(10.dp),
                        elevation = 20.dp,
                        shape = RoundedCornerShape(10.dp)
                    ) {

                        Text(
                            "Mobile Application Development", textAlign = TextAlign.Center, fontWeight = FontWeight.Bold,
                            fontSize = 30.sp, modifier = Modifier.padding(10.dp)
                        )

                    }
                }
                item {
                    Card(
                        modifier = Modifier
                            .width(200.dp)
                            .height(200.dp)
                            .padding(10.dp),
                        elevation = 20.dp,
                        shape = RoundedCornerShape(10.dp)
                    ) {

                        Text(
                            "sub 3", textAlign = TextAlign.Center, fontWeight = FontWeight.Bold,
                            fontSize = 30.sp, modifier = Modifier.padding(10.dp)
                        )

                    }
                }
                item {
                    Card(
                        modifier = Modifier
                            .width(200.dp)
                            .height(200.dp)
                            .padding(10.dp),
                        elevation = 20.dp,
                        shape = RoundedCornerShape(10.dp)
                    ) {

                        Text(
                            "sub 4", textAlign = TextAlign.Center, fontWeight = FontWeight.Bold,
                            fontSize = 30.sp, modifier = Modifier.padding(10.dp)
                        )

                    }
                }
                item {
                    Card(
                        modifier = Modifier
                            .width(200.dp)
                            .height(200.dp)
                            .padding(10.dp),
                        elevation = 20.dp,
                        shape = RoundedCornerShape(10.dp)
                    ) {

                        Text(
                            "sub 5", textAlign = TextAlign.Center, fontWeight = FontWeight.Bold,
                            fontSize = 30.sp, modifier = Modifier.padding(10.dp)
                        )

                    }
                }
                item {
                    Card(
                        modifier = Modifier
                            .width(200.dp)
                            .height(200.dp)
                            .padding(10.dp),
                        elevation = 20.dp,
                        shape = RoundedCornerShape(10.dp)

                    ) {

                        Text(
                            "sub 6", textAlign = TextAlign.Center, fontWeight = FontWeight.Bold,
                            fontSize = 30.sp, modifier = Modifier.padding(10.dp)
                        )

                    }
                }
            }

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 30.dp),
                horizontalAlignment = Alignment.Start
            ) {


                Text(
                    "SEMESTER 6",
                    fontSize = 20.sp,
                    fontFamily = FontFamily.Monospace,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(bottom = 30.dp)
                )
            }

            LazyRow(
                modifier = Modifier
                    .fillMaxWidth()
                  //  .padding(top = 1530.dp)
                    .wrapContentHeight()
            ) {
                item {
                    Card(
                        modifier = Modifier
                            .width(200.dp)
                            .height(200.dp)
                            .padding(10.dp),
                        elevation = 20.dp,
                        shape = RoundedCornerShape(10.dp)
                    ) {

                        Text(
                            "sub 1", textAlign = TextAlign.Center, fontWeight = FontWeight.Bold,
                            fontSize = 30.sp, modifier = Modifier.padding(10.dp)
                        )

                    }
                }
                item {
                    Card(
                        modifier = Modifier
                            .width(200.dp)
                            .height(200.dp)
                            .padding(10.dp),
                        elevation = 20.dp,
                        shape = RoundedCornerShape(10.dp)
                    ) {

                        Text(
                            "sub 2", textAlign = TextAlign.Center, fontWeight = FontWeight.Bold,
                            fontSize = 30.sp, modifier = Modifier.padding(10.dp)
                        )

                    }
                }
                item {
                    Card(
                        modifier = Modifier
                            .width(200.dp)
                            .height(200.dp)
                            .padding(10.dp),
                        elevation = 20.dp,
                        shape = RoundedCornerShape(10.dp)
                    ) {

                        Text(
                            "sub 3", textAlign = TextAlign.Center, fontWeight = FontWeight.Bold,
                            fontSize = 30.sp, modifier = Modifier.padding(10.dp)
                        )

                    }
                }
                item {
                    Card(
                        modifier = Modifier
                            .width(200.dp)
                            .height(200.dp)
                            .padding(10.dp),
                        elevation = 20.dp,
                        shape = RoundedCornerShape(10.dp)
                    ) {

                        Text(
                            "sub 4", textAlign = TextAlign.Center, fontWeight = FontWeight.Bold,
                            fontSize = 30.sp, modifier = Modifier.padding(10.dp)
                        )

                    }
                }
                item {
                    Card(
                        modifier = Modifier
                            .width(200.dp)
                            .height(200.dp)
                            .padding(10.dp),
                        elevation = 20.dp,
                        shape = RoundedCornerShape(10.dp)
                    ) {

                        Text(
                            "sub 5", textAlign = TextAlign.Center, fontWeight = FontWeight.Bold,
                            fontSize = 30.sp, modifier = Modifier.padding(10.dp)
                        )

                    }
                }
                item {
                    Card(
                        modifier = Modifier
                            .width(200.dp)
                            .height(200.dp)
                            .padding(10.dp),
                        elevation = 20.dp,
                        shape = RoundedCornerShape(10.dp)

                    ) {

                        Text(
                            "sub 6", textAlign = TextAlign.Center, fontWeight = FontWeight.Bold,
                            fontSize = 30.sp, modifier = Modifier.padding(10.dp)
                        )

                    }
                }
            }
        }
    }
}