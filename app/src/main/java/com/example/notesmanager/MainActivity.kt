package com.example.notesmanager

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.Icon
import androidx.compose.material.icons.filled.Email
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.view.WindowCompat
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.notesmanager.ui.theme.NotesManagerTheme
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
//import kotlinx.coroutines.flow.MutableStateFlow
//import kotlinx.coroutines.launch
//import kotlinx.coroutines.tasks.await
import androidx.lifecycle.viewmodel.compose.viewModel




class MainActivity : ComponentActivity() {
   // private lateinit var auth: FirebaseAuth
    @ExperimentalFoundationApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //auth = Firebase.auth
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


@ExperimentalFoundationApi
@Composable
fun Navigation(){
    val navController = rememberNavController()

    NavHost(navController = navController,startDestination = "login"){ 
        composable("login"){ Login(navController= navController)}
        composable("Main"){ MainScreen(navController= navController)}

    }
}

//@Composable
//fun Logout(navController: NavHostController) {
//
//    Column(modifier = Modifier.fillMaxSize(),
//    verticalArrangement = Arrangement.Center,
//     horizontalAlignment = Alignment.CenterHorizontally){
//        Button(onClick = { navController.navigate("login") }) {
//            Text(text = "Logout")
//        }
//    }
//}

@Composable
private fun Login(navController: NavHostController/*,viewModel: LoginScreenViewModel = viewModel()*/) {
    //val state by viewModel.loadingState.collectAsState()
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(ImageBitmap.imageResource(id = R.drawable.login), contentDescription = "")

        var email by remember { mutableStateOf("") }
        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            label = { Text("Email") },
            maxLines = 1,
            singleLine = true,
            leadingIcon = {
                Icon(
                    imageVector = Icons.Filled.Email,
                    contentDescription = "Email Icon"
                )
            })
        var password by remember { mutableStateOf("") }
        OutlinedTextField(
            value = password,
            maxLines = 1,
            singleLine = true,
            onValueChange = { password = it },
            label = { Text("Password") }
        )

        Spacer(modifier = Modifier.padding(20.dp))
        Button(
            onClick = { /*viewModel.signInWithEmailAndPassword(email.trim(),password.trim())*/
                navController.navigate("Main")
            }, shape = RoundedCornerShape(50)
        ){
            Text("LOGIN")
//            when(state.status){
//                LoadingState.Status.SUCCESS -> {Text(text = "Success")}
//                LoadingState.Status.FAILED -> {Text(text = state.msg ?: "Error")}
//
//            }
        }
    }
}

    @ExperimentalFoundationApi
    @Composable
    fun MainScreen(navController: NavHostController) {
        val images = (0..7).toList()
        LazyVerticalGrid(
            cells = GridCells.Fixed(3),
            contentPadding = PaddingValues(15.dp),
        ) {
            item {

                Image(ImageBitmap.imageResource(id = R.drawable.calculator),
                    contentDescription = "",
                    modifier = Modifier
                        .width(100.dp)
                        .height(100.dp)
                        .padding(15.dp)
                        .clickable(
                            onClick = { navController.navigate("login") }
                        )
                )
                Text(
                    "Percentage Calculator",
                    fontSize = 12.sp,
                    textAlign = TextAlign.Center
                )
            }
            item {
                Image(ImageBitmap.imageResource(id = R.drawable.books),
                    contentDescription = "",
                    modifier = Modifier
                        .width(100.dp)
                        .height(100.dp)
                        .padding(15.dp)
                        .clickable(
                            onClick = { navController.navigate("login") }
                        )
                )
                Text(
                    "Notes",
                    fontSize = 12.sp,
                    textAlign = TextAlign.Center
                )
            }
            item {
                Image(ImageBitmap.imageResource(id = R.drawable.calculator_1_),
                    contentDescription = "",
                    modifier = Modifier
                        .width(100.dp)
                        .height(100.dp)
                        .padding(15.dp)
                        .clickable(
                            onClick = { navController.navigate("login") }
                        )
                )
                Text(
                    "Uploads",
                    fontSize = 12.sp,
                    textAlign = TextAlign.Center
                )
            }
            item {
                Image(ImageBitmap.imageResource(id = R.drawable.interest_rate),
                    contentDescription = "",
                    modifier = Modifier
                        .width(100.dp)
                        .height(100.dp)
                        .padding(15.dp)
                        .clickable(
                            onClick = { navController.navigate("login") }
                        )
                )
                Text(
                    "Fee",
                    fontSize = 12.sp,
                    textAlign = TextAlign.Center
                )
            }
            item {
                Image(ImageBitmap.imageResource(id = R.drawable.calculator),
                    contentDescription = "",
                    modifier = Modifier
                        .width(100.dp)
                        .height(100.dp)
                        .padding(15.dp)
                        .clickable(
                            onClick = { navController.navigate("login") }
                        )
                )
                Text(
                    "Result",
                    fontSize = 12.sp,
                    textAlign = TextAlign.Center
                )
            }

            item {
                Image(ImageBitmap.imageResource(id = R.drawable.books),
                    contentDescription = "",
                    modifier = Modifier
                        .width(100.dp)
                        .height(100.dp)
                        .padding(15.dp)
                        .clickable(
                            onClick = { navController.navigate("login") }
                        )
                )
                Text(
                    "Cms",
                    fontSize = 12.sp,
                    textAlign = TextAlign.Center
                )
            }
            item {
                Image(ImageBitmap.imageResource(id = R.drawable.calculator_1_),
                    contentDescription = "",
                    modifier = Modifier
                        .width(100.dp)
                        .height(100.dp)
                        .padding(15.dp)
                        .clickable(
                            onClick = { navController.navigate("login") }
                        )
                )
                Text(
                    "Result",
                    fontSize = 12.sp,
                    textAlign = TextAlign.Center
                )
            }

                }
            }









//class LoginScreenViewModel : ViewModel() {
//    val loadingState = MutableStateFlow(LoadingState.IDLE)
//    fun signInWithEmailAndPassword(email: String, password: String) = viewModelScope.launch{
//        try{
//            loadingState.emit(LoadingState.LOADING)
//            Firebase.auth.signInWithEmailAndPassword(email,password).await()
//            loadingState.emit(LoadingState.LOADED)
//        } catch (e: Exception){
//            loadingState.emit(LoadingState.error(e.localizedMessage))
//        }
//    }
//}

//data class LoadingState private constructor(val status: Status, val msg: String? = null){
//companion object {
//    val LOADED = LoadingState(Status.SUCCESS)
//    val IDLE = LoadingState(Status.IDLE)
//    val LOADING = LoadingState(Status.RUNNING)
//    fun error(msg: String?) = LoadingState(Status.FAILED, msg)
//}
//    enum class Status{
//        RUNNING,
//        SUCCESS,
//        FAILED,
//        IDLE
//    }
//
//}


@ExperimentalFoundationApi
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    NotesManagerTheme {
        Navigation()
    }
}






