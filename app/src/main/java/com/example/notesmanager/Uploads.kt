package com.example.notesmanager

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
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
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.notesmanager.ui.theme.lightBlue
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

//import com.google.firebase.ktx.Firebase

@Composable
fun Upload (navController: NavHostController) {

    val context = LocalContext.current

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(ImageBitmap.imageResource(id = R.drawable.upload), contentDescription = "",alignment = Alignment.Center)

        var subname by remember { mutableStateOf("") }
        OutlinedTextField(
            value = subname,
            onValueChange = { subname = it },
            label = { Text("ENTER SUBJECT NAME") },
            maxLines = 1,
            singleLine = true,
            )
        var link by remember { mutableStateOf("") }
        OutlinedTextField(
            value = link,
            onValueChange = { link = it },
            label = { Text("PASTE NOTES LINK") }
        )

        IconButton(
            onClick={
                val notes = Uploadsbackend(subname, link)
                Firebase.firestore.collection("notes").add(notes)
                Toast.makeText(context,"Uploaded", Toast.LENGTH_SHORT).show()
        },
            modifier = Modifier.align(Alignment.CenterHorizontally)
                .padding(vertical = 10.dp)
        ){
            Icon(Icons.Filled.CloudUpload,
            "Upload",
                modifier = Modifier.size(50.dp),
           tint =lightBlue)
        }
    }
}
