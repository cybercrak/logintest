package com.example.notesmanager

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
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.google.firebase.ktx.Firebase

@Composable
fun Upload (navController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        
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
                Firebase.firestore.collection("notes").add(notes) // import error need to import
        },
            modifier = Modifier.align(Alignment.CenterHorizontally)
                .padding(vertical = 10.dp)
        ){
            Icon(Icons.Filled.CloudUpload,
            "Upload",
            Modifier.background(Color.Blue))
        }
    }
}
