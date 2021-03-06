package com.example.notesmanager

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CloudUpload
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.airbnb.lottie.compose.*
import com.example.notesmanager.ui.theme.lightBlue
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import com.shashank.sony.fancytoastlib.FancyToast

//import com.google.firebase.ktx.Firebase

@Composable
fun Upload (navController: NavHostController) {

    val context = LocalContext.current
    var subname by remember { mutableStateOf("") }
    var link by remember { mutableStateOf("") }

   LazyColumn(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
       item{
           Text(
               "UPLOAD NOTES ",
               fontSize = 20.sp,
               textAlign = TextAlign.Center,
               fontWeight = FontWeight.Bold,

           )
       }
       item {
           val compositionResult: LottieCompositionResult = rememberLottieComposition(
               spec = LottieCompositionSpec.RawRes(
                   R.raw.cloudupload
               )
           )
           val progress by animateLottieCompositionAsState(
               compositionResult.value,
               isPlaying = true,
               iterations = LottieConstants.IterateForever,
               speed = 1.0f
           )

           LottieAnimation(
               compositionResult.value,
               progress,
               modifier = Modifier.fillParentMaxHeight(0.5f)
           )
       }
       item {
           OutlinedTextField(
               value = subname,
               onValueChange = { subname = it },
               label = { Text("ENTER SUBJECT NAME") },
               maxLines = 1,
               singleLine = true,
           )
       }
       item {
           OutlinedTextField(
               value = link,
               onValueChange = { link = it },
               label = { Text("PASTE NOTES LINK") }
           )
       }
       item {
           IconButton(
               onClick = {
                   val notes = Uploadsbackend(subname, link)
                   try {
                       if(subname.isEmpty() || link.isEmpty()){
                           FancyToast.makeText(
                               context,
                               "Fields should not be empty",
                               FancyToast.LENGTH_LONG,
                               FancyToast.WARNING,
                               false
                           ).show()
                       }else {
                           Firebase.firestore.collection("notes").add(notes)
                           FancyToast.makeText(
                               context,
                               "Upload Succeed... Your notes will be authenticated and uploaded soon",
                               FancyToast.LENGTH_LONG,
                               FancyToast.SUCCESS,
                               true
                           ).show()
                       }
                   }catch(e: Exception){
                       FancyToast.makeText(
                           context,
                           "No Internet",
                           FancyToast.LENGTH_LONG,
                           FancyToast.ERROR,
                           false
                       ).show()
                   }

               },
               modifier = Modifier
                   .padding(vertical = 10.dp)
           ) {
               Icon(
                   Icons.Filled.CloudUpload,
                   "Upload",
                   modifier = Modifier.size(50.dp),
                   tint = lightBlue
               )
           }
       }
    }
}

