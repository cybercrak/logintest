package com.example.notesmanager

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.notesmanager.ui.theme.lightpurple
import com.example.notesmanager.ui.theme.purple1
import com.example.notesmanager.ui.theme.*

@ExperimentalMaterialApi
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
                        shape = RoundedCornerShape(10.dp),
                        onClick = { navController.navigate("loading") }
                    ) {
                        Box(
                            Modifier.background(
                                Brush.horizontalGradient(
                                    listOf(
                                        MaterialTheme.colors.primaryVariant,
                                        MaterialTheme.colors.primary
                                    )
                                )
                            )
                        ) {
                            Box(
                                modifier = Modifier.fillMaxSize(),
                                contentAlignment = Alignment.Center
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.tamil1),
                                    contentDescription = "",
                                    modifier = Modifier
                                        .width(100.dp)
                                        .height(100.dp)
                                )
                            }
                            Box(
                                modifier = Modifier.fillMaxSize(),
                                contentAlignment = Alignment.BottomCenter
                            ) {
                                Text(
                                    "Tamil-I",
                                    textAlign = TextAlign.Center,
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 15.sp,
                                    modifier = Modifier.padding(10.dp)
                                )
                            }
                        }
                    }
                }


                item {
                    Card(
                        modifier = Modifier
                            .width(200.dp)
                            .height(200.dp)
                            .padding(10.dp),
                        elevation = 20.dp,
                        shape = RoundedCornerShape(10.dp),
                        onClick = { navController.navigate("loading") }
                    ) {
                        Box(
                            Modifier.background(
                                Brush.horizontalGradient(
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
                                Image(
                                    painter = painterResource(id = R.drawable.english_1),
                                    contentDescription = "",
                                    modifier = Modifier
                                        .width(100.dp)
                                        .height(100.dp)
                                )
                            }
                            Box(
                                modifier = Modifier.fillMaxSize(),
                                contentAlignment = Alignment.BottomCenter
                            ) {
                                Text(
                                    "English-I",
                                    textAlign = TextAlign.Center,
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 15.sp,
                                    modifier = Modifier.padding(10.dp)
                                )
                            }
                        }
                    }
                }
                item {
                    Card(
                        modifier = Modifier
                            .width(200.dp)
                            .height(200.dp)
                            .padding(10.dp),
                        elevation = 20.dp,
                        shape = RoundedCornerShape(10.dp),
                        onClick = { navController.navigate("loading") }
                    ) {
                        Box(
                            Modifier.background(
                                Brush.horizontalGradient(
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
                                Image(
                                    painter = painterResource(id = R.drawable.dfco),
                                    contentDescription = "",
                                    modifier = Modifier
                                        .width(100.dp)
                                        .height(100.dp)
                                )
                            }
                            Box(
                                modifier = Modifier.fillMaxSize(),
                                contentAlignment = Alignment.BottomCenter
                            ) {
                                Text(
                                    "DFCO",
                                    textAlign = TextAlign.Center,
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 15.sp,
                                    modifier = Modifier.padding(10.dp)
                                )
                            }
                        }
                    }
                }
                item {
                    Card(
                        modifier = Modifier
                            .width(200.dp)
                            .height(200.dp)
                            .padding(10.dp),
                        elevation = 20.dp,
                        shape = RoundedCornerShape(10.dp),
                        onClick = { navController.navigate("loading") }
                    ) {
                        Box(
                            Modifier.background(
                                Brush.horizontalGradient(
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
                                Image(
                                    painter = painterResource(id = R.drawable.c_program),
                                    contentDescription = "",
                                    modifier = Modifier
                                        .width(100.dp)
                                        .height(100.dp)
                                )
                            }
                            Box(
                                modifier = Modifier.fillMaxSize(),
                                contentAlignment = Alignment.BottomCenter
                            ) {
                                Text(
                                    "C programming",
                                    textAlign = TextAlign.Center,
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 15.sp,
                                    modifier = Modifier.padding(10.dp)
                                )
                            }
                        }
                    }
                }
                item {
                    Card(
                        modifier = Modifier
                            .width(200.dp)
                            .height(200.dp)
                            .padding(10.dp),
                        elevation = 20.dp,
                        shape = RoundedCornerShape(10.dp),
                        onClick = { navController.navigate("loading") }
                    ) {
                        Box(
                            Modifier.background(
                                Brush.horizontalGradient(
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
                                Image(
                                    painter = painterResource(id = R.drawable.accounts),
                                    contentDescription = "",
                                    modifier = Modifier
                                        .width(100.dp)
                                        .height(100.dp)
                                )
                            }
                            Box(
                                modifier = Modifier.fillMaxSize(),
                                contentAlignment = Alignment.BottomCenter
                            ) {
                                Text(
                                    "Business Accounts",
                                    textAlign = TextAlign.Center,
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 15.sp,
                                    modifier = Modifier.padding(10.dp)
                                )
                            }
                        }
                    }
                }
                item {
                    Card(
                        modifier = Modifier
                            .width(200.dp)
                            .height(200.dp)
                            .padding(10.dp),
                        elevation = 20.dp,
                        shape = RoundedCornerShape(10.dp),
                        onClick = { navController.navigate("loading") }
                    ) {
                        Box(
                            Modifier.background(
                                Brush.horizontalGradient(
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
                                Image(
                                    painter = painterResource(id = R.drawable.value_education),
                                    contentDescription = "",
                                    modifier = Modifier
                                        .width(100.dp)
                                        .height(100.dp)
                                )
                            }
                            Box(
                                modifier = Modifier.fillMaxSize(),
                                contentAlignment = Alignment.BottomCenter
                            ) {
                                Text(
                                    "Value Education",
                                    textAlign = TextAlign.Center,
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 15.sp,
                                    modifier = Modifier.padding(10.dp)
                                )
                            }
                        }
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
                        shape = RoundedCornerShape(10.dp),
                        onClick = { navController.navigate("loading") }
                    ) {
                        Box(
                            Modifier.background(
                                Brush.horizontalGradient(
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
                                Image(
                                    painter = painterResource(id = R.drawable.tamil1),
                                    contentDescription = "",
                                    modifier = Modifier
                                        .width(100.dp)
                                        .height(100.dp)
                                )
                            }
                            Box(
                                modifier = Modifier.fillMaxSize(),
                                contentAlignment = Alignment.BottomCenter
                            ) {
                                Text(
                                    "Tamil-II",
                                    textAlign = TextAlign.Center,
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 15.sp,
                                    modifier = Modifier.padding(10.dp)
                                )
                            }
                        }
                    }
                }
                item {
                    Card(
                        modifier = Modifier
                            .width(200.dp)
                            .height(200.dp)
                            .padding(10.dp),
                        elevation = 20.dp,
                        shape = RoundedCornerShape(10.dp),
                        onClick = { navController.navigate("loading") }
                    ) {
                        Box(
                            Modifier.background(
                                Brush.horizontalGradient(
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
                                Image(
                                    painter = painterResource(id = R.drawable.english_2),
                                    contentDescription = "",
                                    modifier = Modifier
                                        .width(100.dp)
                                        .height(100.dp)
                                )
                            }
                            Box(
                                modifier = Modifier.fillMaxSize(),
                                contentAlignment = Alignment.BottomCenter
                            ) {
                                Text(
                                    "English-II",
                                    textAlign = TextAlign.Center,
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 15.sp,
                                    modifier = Modifier.padding(10.dp)
                                )
                            }
                        }
                    }
                }
                item {
                    Card(
                        modifier = Modifier
                            .width(200.dp)
                            .height(200.dp)
                            .padding(10.dp),
                        elevation = 20.dp,
                        shape = RoundedCornerShape(10.dp),
                        onClick = { navController.navigate("loading") }
                    ) {
                        Box(
                            Modifier.background(
                                Brush.horizontalGradient(
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
                                Image(
                                    painter = painterResource(id = R.drawable.nm),
                                    contentDescription = "",
                                    modifier = Modifier
                                        .width(100.dp)
                                        .height(100.dp)
                                )
                            }
                            Box(
                                modifier = Modifier.fillMaxSize(),
                                contentAlignment = Alignment.BottomCenter
                            ) {
                                Text(
                                    "NM & statistics",
                                    textAlign = TextAlign.Center,
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 15.sp,
                                    modifier = Modifier.padding(10.dp)
                                )
                            }
                        }
                    }
                }
                item {
                    Card(
                        modifier = Modifier
                            .width(200.dp)
                            .height(200.dp)
                            .padding(10.dp),
                        elevation = 20.dp,
                        shape = RoundedCornerShape(10.dp),
                        onClick = { navController.navigate("loading") }
                    ) {
                        Box(
                            Modifier.background(
                                Brush.horizontalGradient(
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
                                Image(
                                    painter = painterResource(id = R.drawable.c__),
                                    contentDescription = "",
                                    modifier = Modifier
                                        .width(100.dp)
                                        .height(100.dp)
                                )
                            }
                            Box(
                                modifier = Modifier.fillMaxSize(),
                                contentAlignment = Alignment.BottomCenter
                            ) {
                                Text(
                                    "C++",
                                    textAlign = TextAlign.Center,
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 15.sp,
                                    modifier = Modifier.padding(10.dp)
                                )
                            }
                        }
                    }
                }
                item {
                    Card(
                        modifier = Modifier
                            .width(200.dp)
                            .height(200.dp)
                            .padding(10.dp),
                        elevation = 20.dp,
                        shape = RoundedCornerShape(10.dp),
                        onClick = { navController.navigate("loading") }
                    ) {
                        Box(
                            Modifier.background(
                                Brush.horizontalGradient(
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
                                Image(
                                    painter = painterResource(id = R.drawable.dsa),
                                    contentDescription = "",
                                    modifier = Modifier
                                        .width(100.dp)
                                        .height(100.dp)
                                )
                            }
                            Box(
                                modifier = Modifier.fillMaxSize(),
                                contentAlignment = Alignment.BottomCenter
                            ) {
                                Text(
                                    "Data Structures(DSA)",
                                    textAlign = TextAlign.Center,
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 15.sp,
                                    modifier = Modifier.padding(10.dp)
                                )
                            }
                        }
                    }
                }
                item {
                    Card(
                        modifier = Modifier
                            .width(200.dp)
                            .height(200.dp)
                            .padding(10.dp),
                        elevation = 20.dp,
                        shape = RoundedCornerShape(10.dp),
                        onClick = { navController.navigate("loading") }
                    ) {
                        Box(
                            Modifier.background(
                                Brush.horizontalGradient(
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
                                Image(
                                    painter = painterResource(id = R.drawable.environmentstudies),
                                    contentDescription = "",
                                    modifier = Modifier
                                        .width(100.dp)
                                        .height(100.dp)
                                )
                            }
                            Box(
                                modifier = Modifier.fillMaxSize(),
                                contentAlignment = Alignment.BottomCenter
                            ) {
                                Text(
                                    "EVS",
                                    textAlign = TextAlign.Center,
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 15.sp,
                                    modifier = Modifier.padding(10.dp)
                                )
                            }
                        }
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
                        shape = RoundedCornerShape(10.dp),
                        onClick = { navController.navigate("loading") }
                    ) {
                        Box(
                            Modifier.background(
                                Brush.horizontalGradient(
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
                                Image(
                                    painter = painterResource(id = R.drawable.java_icon),
                                    contentDescription = "",
                                    modifier = Modifier
                                        .width(100.dp)
                                        .height(100.dp)
                                )
                            }
                            Box(
                                modifier = Modifier.fillMaxSize(),
                                contentAlignment = Alignment.BottomCenter
                            ) {
                                Text(
                                    "Java Programming",
                                    textAlign = TextAlign.Center,
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 15.sp,
                                    modifier = Modifier.padding(10.dp)
                                )
                            }
                        }
                    }
                }
                item {
                    Card(
                        modifier = Modifier
                            .width(200.dp)
                            .height(200.dp)
                            .padding(10.dp),
                        elevation = 20.dp,
                        shape = RoundedCornerShape(10.dp),
                        onClick = { navController.navigate("loading") }
                    ) {
                        Box(
                            Modifier.background(
                                Brush.horizontalGradient(
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
                                Image(
                                    painter = painterResource(id = R.drawable.or_1),
                                    contentDescription = "",
                                    modifier = Modifier
                                        .width(100.dp)
                                        .height(100.dp)
                                )
                            }
                            Box(
                                modifier = Modifier.fillMaxSize(),
                                contentAlignment = Alignment.BottomCenter
                            ) {
                                Text(
                                    "Operation Research",
                                    textAlign = TextAlign.Center,
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 15.sp,
                                    modifier = Modifier.padding(10.dp)
                                )
                            }
                        }
                    }
                }
                item {
                    Card(
                        modifier = Modifier
                            .width(200.dp)
                            .height(200.dp)
                            .padding(10.dp),
                        elevation = 20.dp,
                        shape = RoundedCornerShape(10.dp),
                        onClick = { navController.navigate("loading") }
                    ) {
                        Box(
                            Modifier.background(
                                Brush.horizontalGradient(
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
                                Image(
                                    painter = painterResource(id = R.drawable.mobile_phone_settings),
                                    contentDescription = "",
                                    modifier = Modifier
                                        .width(100.dp)
                                        .height(100.dp)
                                )
                            }
                            Box(
                                modifier = Modifier.fillMaxSize(),
                                contentAlignment = Alignment.BottomCenter
                            ) {
                                Text(
                                    "Mobile servicing(OE)",
                                    textAlign = TextAlign.Center,
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 15.sp,
                                    modifier = Modifier.padding(10.dp)
                                )
                            }
                        }
                    }
                }
                item {
                    Card(
                        modifier = Modifier
                            .width(200.dp)
                            .height(200.dp)
                            .padding(10.dp),
                        elevation = 20.dp,
                        shape = RoundedCornerShape(10.dp),
                        onClick = { navController.navigate("loading") }
                    ) {
                        Box(
                            Modifier.background(
                                Brush.horizontalGradient(
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
                                Image(
                                    painter = painterResource(id = R.drawable.relational_database),
                                    contentDescription = "",
                                    modifier = Modifier
                                        .width(100.dp)
                                        .height(100.dp)
                                )
                            }
                            Box(
                                modifier = Modifier.fillMaxSize(),
                                contentAlignment = Alignment.BottomCenter
                            ) {
                                Text(
                                    "RDBMS",
                                    textAlign = TextAlign.Center,
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 15.sp,
                                    modifier = Modifier.padding(10.dp)
                                )
                            }
                        }
                    }
                }
                item {
                    Card(
                        modifier = Modifier
                            .width(200.dp)
                            .height(200.dp)
                            .padding(10.dp),
                        elevation = 20.dp,
                        shape = RoundedCornerShape(10.dp),
                        onClick = { navController.navigate("loading") }
                    ) {
                        Box(
                            Modifier.background(
                                Brush.horizontalGradient(
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
                                Image(
                                    painter = painterResource(id = R.drawable.data_mining_2),
                                    contentDescription = "",
                                    modifier = Modifier
                                        .width(100.dp)
                                        .height(100.dp)
                                )
                            }
                            Box(
                                modifier = Modifier.fillMaxSize(),
                                contentAlignment = Alignment.BottomCenter
                            ) {
                                Text(
                                    "Data Mining",
                                    textAlign = TextAlign.Center,
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 15.sp,
                                    modifier = Modifier.padding(10.dp)
                                )
                            }
                        }
                    }
                }
                item {
                    Card(
                        modifier = Modifier
                            .width(200.dp)
                            .height(200.dp)
                            .padding(10.dp),
                        elevation = 20.dp,
                        shape = RoundedCornerShape(10.dp),
                      //  onClick = { navController.navigate("loading") }

                    ) {
                        Box(
                            Modifier.background(
                                Brush.horizontalGradient(
                                    listOf(
                                        MaterialTheme.colors.primary,
                                        MaterialTheme.colors.primaryVariant
                                    )
                                )
                            ),
                        ) {

                            Text(
                                "sub 6", textAlign = TextAlign.Center, fontWeight = FontWeight.Bold,
                                fontSize = 30.sp, modifier = Modifier.padding(10.dp)
                            )
                        }
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
                        shape = RoundedCornerShape(10.dp),
                        onClick = { navController.navigate("loading") }
                    ) {
                        Box(
                            Modifier.background(
                                Brush.horizontalGradient(
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
                                Image(
                                    painter = painterResource(id = R.drawable.python),
                                    contentDescription = "",
                                    modifier = Modifier
                                        .width(100.dp)
                                        .height(100.dp)
                                )
                            }
                            Box(
                                modifier = Modifier.fillMaxSize(),
                                contentAlignment = Alignment.BottomCenter
                            ) {
                                Text(
                                    "Python programming",
                                    textAlign = TextAlign.Center,
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 15.sp,
                                    modifier = Modifier.padding(10.dp)
                                )
                            }
                        }
                    }
                }
                item {
                    Card(
                        modifier = Modifier
                            .width(200.dp)
                            .height(200.dp)
                            .padding(10.dp),
                        elevation = 20.dp,
                        shape = RoundedCornerShape(10.dp),
                        onClick = { navController.navigate("loading") }
                    ) {
                        Box(
                            Modifier.background(
                                Brush.horizontalGradient(
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
                                Image(
                                    painter = painterResource(id = R.drawable.se),
                                    contentDescription = "",
                                    modifier = Modifier
                                        .width(100.dp)
                                        .height(100.dp)
                                )
                            }
                            Box(
                                modifier = Modifier.fillMaxSize(),
                                contentAlignment = Alignment.BottomCenter
                            ) {
                                Text(
                                    "Software Engineering",
                                    textAlign = TextAlign.Center,
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 14.sp,
                                    modifier = Modifier.padding(10.dp)
                                )
                            }
                        }
                    }
                }
                item {
                    Card(
                        modifier = Modifier
                            .width(200.dp)
                            .height(200.dp)
                            .padding(10.dp),
                        elevation = 20.dp,
                        shape = RoundedCornerShape(10.dp),
                        onClick = { navController.navigate("loading") }
                    ) {
                        Box(
                            Modifier.background(
                                Brush.horizontalGradient(
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
                                Image(
                                    painter = painterResource(id = R.drawable.artificial_intelligence_4),
                                    contentDescription = "",
                                    modifier = Modifier
                                        .width(100.dp)
                                        .height(100.dp)
                                )
                            }
                            Box(
                                modifier = Modifier.fillMaxSize(),
                                contentAlignment = Alignment.BottomCenter
                            ) {
                                Text(
                                    "AI",
                                    textAlign = TextAlign.Center,
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 15.sp,
                                    modifier = Modifier.padding(10.dp)
                                )
                            }
                        }
                    }
                }
                item {
                    Card(
                        modifier = Modifier
                            .width(200.dp)
                            .height(200.dp)
                            .padding(10.dp),
                        elevation = 20.dp,
                        shape = RoundedCornerShape(10.dp),
                        onClick = { navController.navigate("loading") }
                    ) {
                        Box(
                            Modifier.background(
                                Brush.horizontalGradient(
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
                                Image(
                                    painter = painterResource(id = R.drawable.marketing_marketing),
                                    contentDescription = "",
                                    modifier = Modifier
                                        .width(100.dp)
                                        .height(100.dp)
                                )
                            }
                            Box(
                                modifier = Modifier.fillMaxSize(),
                                contentAlignment = Alignment.BottomCenter
                            ) {
                                Text(
                                    "Marketing Management",
                                    textAlign = TextAlign.Center,
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 15.sp,
                                    modifier = Modifier.padding(10.dp)
                                )
                            }
                        }
                    }
                }
                item {
                    Card(
                        modifier = Modifier
                            .width(200.dp)
                            .height(200.dp)
                            .padding(10.dp),
                        elevation = 20.dp,
                        shape = RoundedCornerShape(10.dp),
                        onClick = { navController.navigate("loading") }
                    ) {
                        Box(
                            Modifier.background(
                                Brush.horizontalGradient(
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
                                Image(
                                    painter = painterResource(id = R.drawable.computer_networks),
                                    contentDescription = "",
                                    modifier = Modifier
                                        .width(100.dp)
                                        .height(100.dp)
                                )
                            }
                            Box(
                                modifier = Modifier.fillMaxSize(),
                                contentAlignment = Alignment.BottomCenter
                            ) {
                                Text(
                                    "Computer Networks",
                                    textAlign = TextAlign.Center,
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 15.sp,
                                    modifier = Modifier.padding(10.dp)
                                )
                            }
                        }
                    }
                }
                item {
                    Card(
                        modifier = Modifier
                            .width(200.dp)
                            .height(200.dp)
                            .padding(10.dp),
                        elevation = 20.dp,
                        shape = RoundedCornerShape(10.dp),
                        //onClick = { navController.navigate("loading") }

                    ) {
                        Box(
                            Modifier.background(
                                Brush.horizontalGradient(
                                    listOf(
                                        MaterialTheme.colors.primary,
                                        MaterialTheme.colors.primaryVariant
                                    )
                                )
                            ),
                        ) {

                            Text(
                                "sub 6", textAlign = TextAlign.Center, fontWeight = FontWeight.Bold,
                                fontSize = 30.sp, modifier = Modifier.padding(10.dp)
                            )
                        }
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
                        shape = RoundedCornerShape(10.dp),
                        onClick = { navController.navigate("osunits") }
                    ) {Box(
                        Modifier.background(
                            Brush.horizontalGradient(
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
                            Image(
                                painter = painterResource(id = R.drawable.bca),
                                contentDescription = "",
                                modifier = Modifier
                                    .width(100.dp)
                                    .height(100.dp)
                            )
                        }
                        Box(
                            modifier = Modifier.fillMaxSize(),
                            contentAlignment = Alignment.BottomCenter
                        ) {
                            Text(
                                "Operating System",
                                textAlign = TextAlign.Center,
                                fontWeight = FontWeight.Bold,
                                fontSize = 15.sp,
                                modifier = Modifier.padding(10.dp)
                            )
                        }

                    }
                    }
                }
                item {
                    Card(
                        modifier = Modifier
                            .width(200.dp)
                            .height(200.dp)
                            .padding(10.dp),
                        elevation = 20.dp,
                        shape = RoundedCornerShape(10.dp),
                        onClick = { navController.navigate("madunits") }
                    ) {
                        Box(
                            Modifier.background(
                                Brush.horizontalGradient(
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
                                Image(
                                    painter = painterResource(id = R.drawable.android_studio),
                                    contentDescription = "",
                                    modifier = Modifier
                                        .width(100.dp)
                                        .height(100.dp)
                                )
                            }
                            Box(
                                modifier = Modifier.fillMaxSize(),
                                contentAlignment = Alignment.BottomCenter
                            ) {
                                Text(
                                    "MAD",
                                    textAlign = TextAlign.Center,
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 15.sp,
                                    modifier = Modifier.padding(10.dp)
                                )
                            }
                        }
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
                        Box(
                            Modifier.background(
                                Brush.horizontalGradient(
                                    listOf(
                                        MaterialTheme.colors.primary,
                                        MaterialTheme.colors.primaryVariant
                                    )
                                )
                            )
                        ) {
                            Text(
                                "sub 3", textAlign = TextAlign.Center, fontWeight = FontWeight.Bold,
                                fontSize = 30.sp, modifier = Modifier.padding(10.dp)
                            )
                        }
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
                        Box(
                            Modifier.background(
                                Brush.horizontalGradient(
                                    listOf(
                                        MaterialTheme.colors.primary,
                                        MaterialTheme.colors.primaryVariant
                                    )
                                )
                            )
                        ) {
                            Text(
                                "sub 4", textAlign = TextAlign.Center, fontWeight = FontWeight.Bold,
                                fontSize = 30.sp, modifier = Modifier.padding(10.dp)
                            )
                        }
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
                        Box(
                            Modifier.background(
                                Brush.horizontalGradient(
                                    listOf(
                                        MaterialTheme.colors.primary,
                                        MaterialTheme.colors.primaryVariant
                                    )
                                )
                            )
                        ) {
                            Text(
                                "sub 5", textAlign = TextAlign.Center, fontWeight = FontWeight.Bold,
                                fontSize = 30.sp, modifier = Modifier.padding(10.dp)
                            )
                        }
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
                        Box(
                            Modifier.background(
                                Brush.horizontalGradient(
                                    listOf(
                                        MaterialTheme.colors.primary,
                                        MaterialTheme.colors.primaryVariant
                                    )
                                )
                            )
                        ) {
                            Text(
                                "sub 6", textAlign = TextAlign.Center, fontWeight = FontWeight.Bold,
                                fontSize = 30.sp, modifier = Modifier.padding(10.dp)
                            )
                        }
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
                        Box(
                            Modifier.background(
                                Brush.horizontalGradient(
                                    listOf(
                                        MaterialTheme.colors.primary,
                                        MaterialTheme.colors.primaryVariant
                                    )
                                )
                            ),
                        ) {
                            Text(
                                "sub 1", textAlign = TextAlign.Center, fontWeight = FontWeight.Bold,
                                fontSize = 30.sp, modifier = Modifier.padding(10.dp)
                            )
                        }
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
                        Box(
                            Modifier.background(
                                Brush.horizontalGradient(
                                    listOf(
                                        MaterialTheme.colors.primary,
                                        MaterialTheme.colors.primaryVariant
                                    )
                                )
                            ),
                        ) {
                            Text(
                                "sub 2", textAlign = TextAlign.Center, fontWeight = FontWeight.Bold,
                                fontSize = 30.sp, modifier = Modifier.padding(10.dp)
                            )
                        }
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
                        Box(
                            Modifier.background(
                                Brush.horizontalGradient(
                                    listOf(
                                        MaterialTheme.colors.primary,
                                        MaterialTheme.colors.primaryVariant
                                    )
                                )
                            ),
                        ) {
                            Text(
                                "sub 3", textAlign = TextAlign.Center, fontWeight = FontWeight.Bold,
                                fontSize = 30.sp, modifier = Modifier.padding(10.dp)
                            )
                        }
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
                        Box(
                            Modifier.background(
                                Brush.horizontalGradient(
                                    listOf(
                                        MaterialTheme.colors.primary,
                                        MaterialTheme.colors.primaryVariant
                                    )
                                )
                            ),
                        ) {
                            Text(
                                "sub 4", textAlign = TextAlign.Center, fontWeight = FontWeight.Bold,
                                fontSize = 30.sp, modifier = Modifier.padding(10.dp)
                            )
                        }
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
                        Box(
                            Modifier.background(
                                Brush.horizontalGradient(
                                    listOf(
                                        MaterialTheme.colors.primary,
                                        MaterialTheme.colors.primaryVariant
                                    )
                                )
                            ),
                        ) {
                            Text(
                                "sub 5", textAlign = TextAlign.Center, fontWeight = FontWeight.Bold,
                                fontSize = 30.sp, modifier = Modifier.padding(10.dp)
                            )
                        }
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
                        Box(
                            Modifier.background(
                                Brush.horizontalGradient(
                                    listOf(
                                        MaterialTheme.colors.primary,
                                        MaterialTheme.colors.primaryVariant
                                    )
                                )
                            ),
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
}

