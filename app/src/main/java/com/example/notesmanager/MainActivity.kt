package com.example.notesmanager


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.notesmanager.ui.theme.NotesManagerTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NotesManagerTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Navigation()
                }
            }
        }
    }

}
@Composable
fun Navigation(){
    val navController = rememberNavController()

    NavHost(navController = navController,startDestination = "login"){
        composable("login"){ Login(navController= navController)}
        composable("logout"){ Logout(navController= navController)}

    }
}

@Composable
fun Logout(navController: NavHostController) {

    Column(modifier = Modifier.fillMaxSize(),
    verticalArrangement = Arrangement.Center,
     horizontalAlignment = Alignment.CenterHorizontally){
        Button(onClick = { navController.navigate("login") }) {
            Text(text = "Logout")
        }
    }
}

@Composable
private fun Login(navController: NavHostController) {

    Column(modifier = Modifier.fillMaxSize() ,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally){
        Image(ImageBitmap.imageResource(id=R.drawable.login),contentDescription = "")

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
        Button(onClick={ navController.navigate("logout")
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
        Navigation()
    }
}






