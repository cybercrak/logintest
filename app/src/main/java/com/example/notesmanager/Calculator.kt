package com.example.notesmanager

import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.motion.widget.TransitionBuilder.validate
import androidx.navigation.NavHostController
import com.example.notesmanager.ui.theme.DarkBlue
import com.example.notesmanager.ui.theme.lightBlue

@ExperimentalFoundationApi
@Composable
fun CalcScreen(navController: NavHostController) {
    val context = LocalContext.current

    var mark1 by remember { mutableStateOf("") }
    var mark2 by remember { mutableStateOf("") }
    var mark3 by remember { mutableStateOf("") }
    var mark4 by remember { mutableStateOf("") }
    var mark5 by remember { mutableStateOf("") }
    var mark6 by remember { mutableStateOf("") }

    var No_of_Sub by remember { mutableStateOf("") }

       Column(
           modifier = Modifier.fillMaxSize(),
           verticalArrangement = Arrangement.Top
       ) {


           Text(
               "PERCENTAGE CALCULATOR",
               fontSize = 20.sp,
               fontFamily = FontFamily.Monospace,
               fontWeight = FontWeight.Bold,
               modifier = Modifier
                   .align(Alignment.CenterHorizontally)
                   .padding(bottom = 30.dp)
           )
       }
       val images = (0..7).toList()
       LazyVerticalGrid(
           cells = GridCells.Fixed(2),
           contentPadding = PaddingValues(15.dp)
       ) {
           item {
               Column(
                   modifier = Modifier
                       .fillMaxSize()
                       .padding(top = 50.dp),
                   horizontalAlignment = Alignment.Start
               ) {

                   Card(
                       modifier = Modifier
                           .width(200.dp)
                           .height(50.dp),
                       elevation = 20.dp,
                       shape = RoundedCornerShape(5.dp)
                   ) {
                       Box(
                           modifier = Modifier.fillMaxSize(),
                           contentAlignment = Alignment.Center
                       ) {
                           Text(
                               "Semester 1",
                               fontWeight = FontWeight.Bold,
                               textAlign = TextAlign.Center
//                    buildAnnotatedString {
//                        withStyle(
//                            style = SpanStyle(
//                                color = Color.Black,
//                                fontWeight = FontWeight.Bold,
//
//                            )
//                        ) {
//                            append("Semester")
//                        }
//                        append("")
//
//                        withStyle(
//                            style = SpanStyle(
//                                color = Color.Red,
//                                fontWeight = FontWeight.Bold
//                            )
//                        ) {
//                            append("1")
//                        }
//                    }
                           )
                       }
                   }
               }
           }
           item {
               Column(
                   modifier = Modifier
                       .fillMaxSize()
                       .padding(top = 50.dp),
                   horizontalAlignment = Alignment.End
               ) {


                   TextField(
                       modifier = Modifier
                           .width(100.dp)
                           .height(50.dp),
                       value = mark1,
                       maxLines = 1,
                       label = { Text("Mark") },
                       textStyle = TextStyle(fontSize = (12.sp), color = Color.Green),
                       singleLine = true,
                       onValueChange = { mark1 = it },
                       colors = TextFieldDefaults.textFieldColors(
                           textColor = Color.Green,
                           backgroundColor = Color.Yellow,
                           focusedIndicatorColor = Color.Transparent,
                           unfocusedIndicatorColor = Color.Transparent
                       ),
                       keyboardOptions = KeyboardOptions(
                           keyboardType = KeyboardType.Number,

                           )
                   )
               }
           }
           item {
               Column(
                   modifier = Modifier
                       .fillMaxSize()
                       .padding(top = 8.dp),
                   horizontalAlignment = Alignment.Start
               ) {
                   Card(
                       modifier = Modifier
                           .width(200.dp)
                           .height(50.dp),
                       elevation = 20.dp,
                       shape = RoundedCornerShape(5.dp)
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
           item {
               Column(
                   modifier = Modifier
                       .fillMaxSize()
                       .padding(top = 8.dp),
                   horizontalAlignment = Alignment.End
               ) {


                   TextField(
                       modifier = Modifier
                           .width(100.dp)
                           .height(50.dp),
                       value = mark2,
                       maxLines = 1,
                       label = { Text("Mark") },
                       textStyle = TextStyle(fontSize = (12.sp), color = Color.Green),
                       singleLine = true,
                       onValueChange = { mark2 = it },
                       colors = TextFieldDefaults.textFieldColors(
                           textColor = Color.Green,
                           backgroundColor = Color.Yellow,
                           focusedIndicatorColor = Color.Transparent,
                           unfocusedIndicatorColor = Color.Transparent
                       ),
                       keyboardOptions = KeyboardOptions(
                           keyboardType = KeyboardType.Number,

                           )
                   )
               }
           }

           item {
               Column(
                   modifier = Modifier
                       .fillMaxSize()
                       .padding(top = 8.dp),
                   horizontalAlignment = Alignment.Start
               ) {
                   Card(
                       modifier = Modifier
                           .width(200.dp)
                           .height(50.dp),
                       elevation = 20.dp,
                       shape = RoundedCornerShape(5.dp)
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
           item {
               Column(
                   modifier = Modifier
                       .fillMaxSize()
                       .padding(top = 8.dp),
                   horizontalAlignment = Alignment.End
               ) {


                   TextField(
                       modifier = Modifier
                           .width(100.dp)
                           .height(50.dp),
                       value = mark3,
                       maxLines = 1,
                       label = { Text("Mark") },
                       textStyle = TextStyle(fontSize = (12.sp), color = Color.Green),
                       singleLine = true,
                       onValueChange = { mark3 = it },
                       colors = TextFieldDefaults.textFieldColors(
                           textColor = Color.Green,
                           backgroundColor = Color.Yellow,
                           focusedIndicatorColor = Color.Transparent,
                           unfocusedIndicatorColor = Color.Transparent
                       ),
                       keyboardOptions = KeyboardOptions(
                           keyboardType = KeyboardType.Number,

                           )
                   )
               }
           }

           item {
               Column(
                   modifier = Modifier
                       .fillMaxSize()
                       .padding(top = 8.dp),
                   horizontalAlignment = Alignment.Start
               ) {
                   Card(
                       modifier = Modifier
                           .width(200.dp)
                           .height(50.dp),
                       elevation = 20.dp,
                       shape = RoundedCornerShape(5.dp)
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
           item {
               Column(
                   modifier = Modifier
                       .fillMaxSize()
                       .padding(top = 8.dp),
                   horizontalAlignment = Alignment.End
               ) {


                   TextField(
                       modifier = Modifier
                           .width(100.dp)
                           .height(50.dp),
                       value = mark4,
                       maxLines = 1,
                       label = { Text("Mark") },
                       textStyle = TextStyle(fontSize = (12.sp), color = Color.Green),
                       singleLine = true,
                       onValueChange = { mark4 = it },
                       colors = TextFieldDefaults.textFieldColors(
                           textColor = Color.Green,
                           backgroundColor = Color.Yellow,
                           focusedIndicatorColor = Color.Transparent,
                           unfocusedIndicatorColor = Color.Transparent
                       ),
                       keyboardOptions = KeyboardOptions(
                           keyboardType = KeyboardType.Number,

                           )
                   )
               }
           }

           item {
               Column(
                   modifier = Modifier
                       .fillMaxSize()
                       .padding(top = 8.dp),
                   horizontalAlignment = Alignment.Start
               ) {
                   Card(
                       modifier = Modifier
                           .width(200.dp)
                           .height(50.dp),
                       elevation = 20.dp,
                       shape = RoundedCornerShape(5.dp)
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
               Column(
                   modifier = Modifier
                       .fillMaxSize()
                       .padding(top = 8.dp),
                   horizontalAlignment = Alignment.End
               ) {


                   TextField(
                       modifier = Modifier
                           .width(100.dp)
                           .height(50.dp),
                       value = mark5,
                       maxLines = 1,
                       label = { Text("Mark") },
                       textStyle = TextStyle(fontSize = (12.sp), color = Color.Green),
                       singleLine = true,
                       onValueChange = { mark5 = it },
                       colors = TextFieldDefaults.textFieldColors(
                           textColor = Color.Green,
                           backgroundColor = Color.Yellow,
                           focusedIndicatorColor = Color.Transparent,
                           unfocusedIndicatorColor = Color.Transparent
                       ),
                       keyboardOptions = KeyboardOptions(
                           keyboardType = KeyboardType.Number,

                           )
                   )
               }
           }

           item {
               Column(
                   modifier = Modifier
                       .fillMaxSize()
                       .padding(top = 8.dp),
                   horizontalAlignment = Alignment.Start
               ) {
                   Card(
                       modifier = Modifier
                           .width(200.dp)
                           .height(50.dp),
                       elevation = 20.dp,
                       shape = RoundedCornerShape(5.dp)
                   ) {
                       Box(
                           modifier = Modifier.fillMaxSize(),
                           contentAlignment = Alignment.Center
                       ) {
                           Text(
                               "Semester 6", fontWeight = FontWeight.Bold,
                               textAlign = TextAlign.Center
                           )
                       }
                   }
               }
           }
           item {
               Column(
                   modifier = Modifier
                       .fillMaxSize()
                       .padding(top = 8.dp),
                   horizontalAlignment = Alignment.End
               ) {

                   TextField(
                       modifier = Modifier
                           .width(100.dp)
                           .height(50.dp),
                       value = mark6,
                       maxLines = 1,
                       label = { Text("Mark") },
                       textStyle = TextStyle(fontSize = (12.sp), color = Color.Green),
                       singleLine = true,
                       onValueChange = { mark6 = it },
                       colors = TextFieldDefaults.textFieldColors(
                           textColor = Color.Green,
                           backgroundColor = Color.Yellow,
                           focusedIndicatorColor = Color.Transparent,
                           unfocusedIndicatorColor = Color.Transparent
                       ),
                       keyboardOptions = KeyboardOptions(
                           keyboardType = KeyboardType.Number

                       )
                   )
               }
           }
       }

       Column(
           modifier = Modifier.fillMaxSize(),
           verticalArrangement = Arrangement.Bottom,
           horizontalAlignment = Alignment.CenterHorizontally
       ) {

           TextField(
               modifier = Modifier
                   .padding(bottom = 350.dp),
               value = No_of_Sub,
               maxLines = 1,
               singleLine = true,
               onValueChange = { No_of_Sub = it },
               label = { Text("Number of scored subjects") },
               colors = TextFieldDefaults . textFieldColors (
                   focusedIndicatorColor = DarkBlue,
                   unfocusedIndicatorColor = Color.Transparent
               ),
               textStyle = TextStyle(fontSize = (15.sp)),
               keyboardOptions = KeyboardOptions(
                   keyboardType = KeyboardType.Number
               )
           )

       }


    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        OutlinedButton(modifier = Modifier.padding(bottom = 30.dp), onClick = {
            val result = (mark1.toInt() + mark2.toInt())
            val percent = result / No_of_Sub.toInt()
            if (No_of_Sub == 0.toString() || No_of_Sub.isEmpty() ){
                Toast.makeText(context, "Invalid values", Toast.LENGTH_SHORT).show()
            }
            if (mark1.isEmpty() || mark2.isEmpty() || mark3.isEmpty() ||
                mark4.isEmpty() || mark5.isEmpty() || mark6.isEmpty()
            ) {
            Toast.makeText(context, "Enter 0 in empty fields", Toast.LENGTH_LONG).show()
             }else if (No_of_Sub < 1.toString() || No_of_Sub > 6.toString() ){
                Toast.makeText(context, "Enter valid number of subjects", Toast.LENGTH_SHORT).show()
            }else{
            Toast.makeText(context, "Your Percentage $percent", Toast.LENGTH_SHORT).show()
            }
        }) {
            Text("Show Result",color = Color.Red)
        }
    }
}



