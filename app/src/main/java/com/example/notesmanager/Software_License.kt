package com.example.notesmanager

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.shashank.sony.fancytoastlib.FancyToast

@ExperimentalFoundationApi
@Composable
fun Software_License(navController: NavHostController) {
    val context = LocalContext.current
    val images = (0..7).toList()
    LazyVerticalGrid(
        cells = GridCells.Fixed(1),
        contentPadding = PaddingValues(15.dp)
    ) {
        item {
            Column(
                modifier = Modifier
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Notes Manager",
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold,
                )
            }
        }
        item {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 20.dp, bottom = 20.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Image(
                    painter= painterResource(id = R.drawable.notesmanager_logo),
                    contentDescription = "",
                    modifier = Modifier
                        .size(180.dp)
                        .padding(15.dp)
                        .clip(RoundedCornerShape(percent = 50))
                        .clickable(
                            onClick = {
                                FancyToast.makeText(
                                context, "  App Version 2.0.1 \nDeveloped by SARRAN", FancyToast.LENGTH_LONG,
                                FancyToast.CONFUSING,R.drawable.person ,false
                            ).show() }
                        )
                )
                Text(
                    text = "Powered by JetpackCompose",
                    fontSize = 18.sp,
                    color = MaterialTheme.colors.primary
                )
            }
        }

        item {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 15.dp, end = 7.dp),
                horizontalAlignment = Alignment.Start,
            ) {
                Text(
                    text = "android",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "11 licences",
                    fontSize = 12.sp
                )
            }
        }
        item {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 15.dp, end = 7.dp),
                horizontalAlignment = Alignment.Start,
            ) {
                Text(
                    text = "Android SDK",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "1 licence",
                    fontSize = 12.sp
                )
            }
        }
        item {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 15.dp, end = 7.dp),
                horizontalAlignment = Alignment.Start,
            ) {
                Text(
                    text = "android_build",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "1 licence",
                    fontSize = 12.sp
                )
            }
        }
        item {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 15.dp, end = 7.dp),
                horizontalAlignment = Alignment.Start,
            ) {
                Text(
                    text = "Androidx library",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "7 licences",
                    fontSize = 12.sp
                )
            }
        }
        item {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 15.dp, end = 7.dp),
                horizontalAlignment = Alignment.Start,
            ) {
                Text(
                    text = "Airbnb",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "1 licence",
                    fontSize = 12.sp
                )
            }
        }

        item {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 15.dp, end = 7.dp),
                horizontalAlignment = Alignment.Start,
            ) {
                Text(
                    text = "Auth library",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "1 licence",
                    fontSize = 12.sp
                )
            }
        }
        item {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 15.dp, end = 7.dp),
                horizontalAlignment = Alignment.Start,
            ) {
                Text(
                    text = "Androidx viewpager",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "1 licence",
                    fontSize = 12.sp
                )
            }
        }
        item {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 15.dp, end = 7.dp),
                horizontalAlignment = Alignment.Start,
            ) {
                Text(
                    text = "Androidx cardview library",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "1 licence",
                    fontSize = 12.sp
                )
            }
        }
        item {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 15.dp, end = 7.dp),
                horizontalAlignment = Alignment.Start,
            ) {
                Text(
                    text = "Firebase",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "4 licences",
                    fontSize = 12.sp
                )
            }
        }
        item {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 15.dp, end = 7.dp),
                horizontalAlignment = Alignment.Start,
            ) {
                Text(
                    text = "FancyToast",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "1 licence",
                    fontSize = 12.sp
                )
            }
        }
        item {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 15.dp, end = 7.dp),
                horizontalAlignment = Alignment.Start,
            ) {
                Text(
                    text = "Kotlin",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "1 licence",
                    fontSize = 12.sp
                )
            }
        }
        item {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 15.dp, end = 7.dp),
                horizontalAlignment = Alignment.Start,
            ) {
                Text(
                    text = "xml",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "1 licence",
                    fontSize = 12.sp
                )
            }
        }
    }
}
