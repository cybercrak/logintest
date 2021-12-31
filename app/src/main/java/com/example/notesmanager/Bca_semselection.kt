package com.example.notesmanager

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@ExperimentalMaterialApi
@Composable
fun Bca_semselection(navController: NavHostController) {
    LazyColumn(modifier = Modifier.fillMaxSize(),
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally){
        item{
            Card(onClick = {navController.navigate("underdev") },
                elevation = 40.dp,
                shape = CutCornerShape(bottomEnd = 30.dp),
            modifier = Modifier.fillMaxWidth()
                .height(200.dp)
                .padding(20.dp)) {
                Box(
                    Modifier.background(
                        Brush.verticalGradient(
                            listOf(
                                MaterialTheme.colors.primary,
                                MaterialTheme.colors.primaryVariant
                            )
                        )
                    )
                ) {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                        Text(
                            "Semester 1",
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Center
                        )
                    }
                }
            }
        }
        item{
            Card(onClick = {navController.navigate("underdev")},
                elevation = 40.dp,
                shape = CutCornerShape(bottomEnd = 30.dp),
                modifier = Modifier.fillMaxWidth()
                    .height(200.dp)
                    .padding(20.dp)) {
                Box(
                    Modifier.background(
                        Brush.verticalGradient(
                            listOf(
                                MaterialTheme.colors.primary,
                                MaterialTheme.colors.primaryVariant
                            )
                        )
                    )
                ) {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {

                        Text(
                            "Semester 2",
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Center
                        )
                    }
                }
            }
        }
        item{
            Card(onClick = { navController.navigate("underdev")},
                elevation = 40.dp,
                shape = CutCornerShape(bottomEnd = 30.dp),
                modifier = Modifier.fillMaxWidth()
                    .height(200.dp)
                    .padding(20.dp)) {
                Box(
                    Modifier.background(
                        Brush.verticalGradient(
                            listOf(
                                MaterialTheme.colors.primary,
                                MaterialTheme.colors.primaryVariant
                            )
                        )
                    )
                ) {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {

                        Text(
                            "Semester 3",
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Center
                        )
                    }
                }
            }
        }

        item{
            Card(onClick = { navController.navigate("underdev")},
                elevation = 40.dp,
                shape = CutCornerShape(bottomEnd = 30.dp),
                modifier = Modifier.fillMaxWidth()
                    .height(200.dp)
                    .padding(20.dp)) {
                Box(
                    Modifier.background(
                        Brush.verticalGradient(
                            listOf(
                                MaterialTheme.colors.primary,
                                MaterialTheme.colors.primaryVariant
                            )
                        )
                    )
                ) {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {

                        Text(
                            "Semester 4",
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Center
                        )
                    }
                }
            }
        }

        item{
            Card(onClick = { navController.navigate("sem5qbank") },
                elevation = 40.dp,
                shape = CutCornerShape(bottomEnd = 30.dp),
                modifier = Modifier.fillMaxWidth()
                    .height(200.dp)
                    .padding(20.dp)) {
                Box(
                    Modifier.background(
                        Brush.verticalGradient(
                            listOf(
                                MaterialTheme.colors.primary,
                                MaterialTheme.colors.primaryVariant
                            )
                        )
                    )
                ) {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {

                        Text(
                            "Semester 5",
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Center
                        )
                    }
                }
            }
        }

        item {
            Card(
                onClick = { navController.navigate("underdev") },
                elevation = 40.dp,
                shape = CutCornerShape(bottomEnd = 30.dp),
                modifier = Modifier.fillMaxWidth()
                    .height(200.dp)
                    .padding(20.dp)
            ) {
                Box(
                    Modifier.background(
                        Brush.verticalGradient(
                            listOf(
                                MaterialTheme.colors.primary,
                                MaterialTheme.colors.primaryVariant
                            )
                        )
                    )
                ) {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {


                        Text(
                            "Semester 6",
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Center
                        )
                    }
                }
            }
        }



    }
}