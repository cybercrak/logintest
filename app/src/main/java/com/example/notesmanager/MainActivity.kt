package com.example.notesmanager

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.notesmanager.ui.theme.NotesManagerTheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.imageResource
import androidx.navigation.compose.rememberNavController
import androidx.compose.ui.unit.dp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NotesManagerTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Login()
                }
            }
        }
    }

}
@Composable
private fun Login() {
    val navController = rememberNavController()
    Column(modifier = Modifier.fillMaxSize() ,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally){


        var email by remember { mutableStateOf("")}
        OutlinedTextField(
            value = email,
            onValueChange = {email = it},
            label = {Text("Email")},
            maxLines = 1,
            singleLine = true,
            leadingIcon = {
                Icon(
                    imageVector = Icons.Filled.Email,
                    contentDescription = "Email Icon"
                )
            })
        var password by remember { mutableStateOf("")}
        OutlinedTextField(
            value = password,
            maxLines =1,
            singleLine = true,
            onValueChange = {password = it},
            label = {Text("Password")}
        )
        Spacer(modifier = Modifier.padding(20.dp))



        fun Context.toast(message: CharSequence)=Toast.makeText(this,message,Toast.LENGTH_SHORT).show()
        Button(onClick={ fun txt(context: Context){context.toast("Available soon")}
        } ,  shape = RoundedCornerShape(50)
        ){
            Text("LOGIN")
        }
    }
}



@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    NotesManagerTheme {
        Login()
    }
}






