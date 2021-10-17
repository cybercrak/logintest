package com.example.notesmanager.ui.theme

import android.widget.Toast
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.notesmanager.R



@ExperimentalFoundationApi
@Composable
fun Notes(navController: NavHostController) {
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
                                navController.navigate("bcayear")
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
                    ImageBitmap.imageResource(id = R.drawable.bca1),
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
                    ImageBitmap.imageResource(id = R.drawable.it),
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
                    "IT",
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
            "NOTES",
            fontSize = 20.sp,
            fontFamily = FontFamily.Monospace,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
        Text(
            "Select Department",
            fontSize = 15.sp,
            color = Color.Blue,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Serif,
            modifier = Modifier.padding(start=3.dp)

        )


    }
}






