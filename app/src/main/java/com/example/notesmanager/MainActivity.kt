package com.example.notesmanager

import android.annotation.SuppressLint
import android.app.Person
import android.content.ActivityNotFoundException
import android.content.Context
import android.content.Context.CONNECTIVITY_SERVICE
import android.content.Intent
import android.net.ConnectivityManager
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.webkit.*
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.twotone.RemoveRedEye
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.core.content.ContextCompat.startActivity
import androidx.core.view.WindowCompat
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
//import kotlinx.coroutines.flow.MutableStateFlow
//import kotlinx.coroutines.launch
import kotlinx.coroutines.tasks.await
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.withStyle
import androidx.core.content.ContextCompat.getSystemService
import androidx.navigation.NavOptions
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.notesmanager.ui.theme.*
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.internal.api.FirebaseNoSignedInUserException
import com.shashank.sony.fancytoastlib.FancyToast
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext


class MainActivity : ComponentActivity() {
   // private lateinit var auth: FirebaseAuth

    @ExperimentalMaterialApi
    @ExperimentalFoundationApi
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


@ExperimentalMaterialApi
@ExperimentalFoundationApi
@Composable
fun Navigation(){
    val navController = rememberNavController()

    NavHost(navController = navController,startDestination = "login"){
        composable("signin"){ Signin(navController= navController)}
        composable("login"){ Login(navController= navController)}
        composable("Main"){ MainScreen(navController= navController)}
        composable("Calc"){ CalcScreen(navController= navController)}
        composable("notes"){ Notes(navController= navController)}
        composable("upload"){ Upload(navController= navController)}
        composable("bcayear") { Bca_yearselection(navController = navController) }
        composable("madunits") { MAD_units(navController = navController)}
        composable("madnotes") { MAD_notes(navController = navController)}
        composable("about"){About (navController = navController)}
        composable("setting"){Settings (navController = navController)}
        composable("contact"){Contact (navController = navController)}

        // composable("cms"){ CMSscreen(navController= navController)}
       // composable("fee"){ Fee(navController= navController)}
       // composable("result"){ Result(navController= navController)}
    }
}


//fun userRegistration(navController: NavHostController) {
//
//    Column(modifier = Modifier.fillMaxSize(),
//    verticalArrangement = Arrangement.Center,
//     horizontalAlignment = Alignment.CenterHorizontally){
//        Button(onClick = { navController.navigate("login") }) {
//            Text(text = "Logout")
//        }
//    }

//}
//fun Signuplogic() {
//    var auth = FirebaseAuth.getInstance()
//    val email = email.text.toString()
//    val password = password.text.toString()
//    var Cpassword =  cpassword.text.toString()
//    auth.createUserWithEmailAndPassword(email, Cpassword)
//}
@Composable
private fun Signin(navController: NavHostController/*,viewModel: LoginScreenViewModel = viewModel()*/ ) {
    //val state by viewModel.loadingState.collectAsState()
    val context = LocalContext.current
    var auth = FirebaseAuth.getInstance()
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var cpassword by remember { mutableStateOf("") }
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        item {


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
                },
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Email
                )
            )
        }
        item {

            OutlinedTextField(
                value = password,
                maxLines = 1,
                singleLine = true,
                onValueChange = { password = it },
                label = { Text("Password") },
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Password
                )
            )
        }
        item {

            OutlinedTextField(
                value = cpassword,
                maxLines = 1,
                singleLine = true,
                onValueChange = { cpassword = it },
                label = { Text("Confirm Password") },
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Password
                )
            )
        }


        item {
            Spacer(modifier = Modifier.padding(20.dp))
            Button(
                onClick = { /*viewModel.signInWithEmailAndPassword(email.trim(),password.trim())*/
                    CoroutineScope(Dispatchers.Main).launch {
                        try {

                            if (password == cpassword) {
                                auth.createUserWithEmailAndPassword(email, cpassword).await()
                                withContext(Dispatchers.Main) {

                                    navController.navigate("login")
                                    FancyToast.makeText(
                                        context, "User Registered", FancyToast.LENGTH_SHORT,
                                        FancyToast.SUCCESS,R.drawable.person ,false
                                    ).show()

                                }
                            }
                            else if (email.isEmpty() || password.isEmpty() || cpassword.isEmpty()){
                                FancyToast.makeText(
                                    context, "Fields should not be empty", FancyToast.LENGTH_SHORT,
                                    FancyToast.WARNING,R.drawable.warning,false
                                ).show()

                            }
                            else{
                                FancyToast.makeText(
                                    context, "Check your INTERNET connection", FancyToast.LENGTH_SHORT,
                                    FancyToast.ERROR,false
                                ).show()

                            }

                        } catch (e: Exception) {
                            withContext(Dispatchers.Main) {
                                FancyToast.makeText(
                                    context, "You are already a user..go to login", FancyToast.LENGTH_SHORT,
                                    FancyToast.CONFUSING,R.drawable.person ,false
                                ).show()
                            }
                        }
                    }
                }, shape = RoundedCornerShape(20)
            ) {
                Text("SIGN IN")
//                when(state.status){
//                LoadingState.Status.SUCCESS -> {Text(text = "Success")}
//                LoadingState.Status.FAILED -> {Text(text = state.msg ?: "Error")}
//
//            }
            }

        }

        item {
            Spacer(modifier = Modifier.padding(10.dp))
            ClickableText(//text = AnnotatedString("Dint have account yet ? Register here")
                buildAnnotatedString {  append("")
                    withStyle(
                        style = SpanStyle(
                            color =DarkRed,

                            )
                    ) {
                        append("Already have an account ?")
                    }
                    withStyle(
                        style = SpanStyle(
                            color =  Color.Blue ,
                            fontWeight = FontWeight.Bold
                        )
                    ) {
                        append(" LOGIN")
                    }
                },
                onClick = { navController.navigate("login") })
        }
    }

        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Create Account", textAlign = TextAlign.Center,fontWeight = FontWeight.Bold)
        }
    }


@Composable
private fun Login(navController: NavHostController/*,viewModel: LoginScreenViewModel = viewModel()*/) {
    //val state by viewModel.loadingState.collectAsState()
//    val animationSpec = remember{LottieAnimationSpec.RawRes(R.raw.Loginanim)}
//    val animationState = rememberLottieAnimationState(autoplay= true, repeatCount = Integer.MAX_VALUE)
    val context = LocalContext.current
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    val passwordVisiblity = remember { mutableStateOf(false)}

    var auth = FirebaseAuth.getInstance()

   LazyColumn(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
       item {
           Image(
               ImageBitmap.imageResource(id = R.drawable.login),
               contentDescription = "",
               alignment = Alignment.TopCenter
           )
           // LottieAnimation(animationSpec,animationState=animationState)
       }
       item {

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
               }, keyboardOptions = KeyboardOptions(
                   keyboardType = KeyboardType.Email
               )
           )
       }
       item {

           OutlinedTextField(
               value = password,
               maxLines = 1,
               singleLine = true,
               onValueChange = { password = it },
               label = { Text("Password") },
               leadingIcon = {
                   Icon(
                       imageVector = Icons.Filled.Lock,
                       contentDescription = "lock"
                   )
               },
               trailingIcon ={
                   IconButton(onClick = {passwordVisiblity.value = !passwordVisiblity.value}) {
                       Icon(
                           imageVector = Icons.TwoTone.RemoveRedEye,
                           contentDescription = "eye",
                           tint = if(passwordVisiblity.value) Color.Red else Color.LightGray
                       )
                   }
               },
               visualTransformation = if(passwordVisiblity.value) VisualTransformation.None
                       else PasswordVisualTransformation(),
               keyboardOptions = KeyboardOptions(
                   keyboardType = KeyboardType.Password
               )
           )
       }
       item {
           Spacer(modifier = Modifier.padding(10.dp))
           Button(

               onClick = { /*viewModel.signInWithEmailAndPassword(email.trim(),password.trim())*/
                   CoroutineScope(Dispatchers.Main).launch {
                       try {

                           if (email.isNotEmpty() && password.isNotEmpty()) {
                               auth.signInWithEmailAndPassword(email, password).await()
                               withContext(Dispatchers.Main) {
                                   FancyToast.makeText(
                                       context, "Login Successfull", FancyToast.LENGTH_SHORT,
                                       FancyToast.SUCCESS,false)
                                       .show()
                                   navController.navigate("Main")
                               }
                           }
                           else if(email.isEmpty() || password.isEmpty()){
                               FancyToast.makeText(
                                   context, "Enter valid credentials",
                                   FancyToast.LENGTH_SHORT,
                                   FancyToast.WARNING, R.drawable.warning,false).show()
                           }
                           else {
//                               val connectivityManager = getSystemService(com.google.api.Context.CONNECTIVITY_SERVICE) as ConnectivityManager
//                               val activeNetworkInfo = connectivityManager.getActiveNetworkInfo()
//                               if (activeNetworkInfo = null && activeNetworkInfo.isConnected()) {
                                   FancyToast.makeText(
                                       context,
                                       "Check your INTERNET connection",
                                       FancyToast.LENGTH_SHORT,
                                       FancyToast.ERROR,
                                       false
                                   ).show()
                               //}
                           }
                       } catch (e: Exception) {
                           withContext(Dispatchers.Main) {
                               FancyToast.makeText(
                                   context, "User not registered..go to Sign in  ", FancyToast.LENGTH_SHORT,
                                   FancyToast.ERROR,R.drawable.person,false
                               ).show()

                           }
                       }
//                }else{
//                    Toast.makeText(context,"Enter Valid Credentials",Toast.LENGTH_SHORT).show()
//                }

                   }
               }, shape = RoundedCornerShape(30)
           ) {
               Text("LOGIN")
//            when(state.status){
//                LoadingState.Status.SUCCESS -> {Text(text = "Success")}
//                LoadingState.Status.FAILED -> {Text(text = state.msg ?: "Error")}
//
//            }
           }

       }
       item {
           Spacer(modifier = Modifier.padding(10.dp))
           ClickableText(//text = AnnotatedString("Dint have account yet ? Register here")
                   buildAnnotatedString {  append("")
                       withStyle(
                           style = SpanStyle(
                               color =Color.Blue,

                           )
                       ) {
                           append("Dint have account yet ?")
                       }
                        withStyle(
                            style = SpanStyle(
                                color =  DarkRed ,
                                fontWeight = FontWeight.Bold
                            )
                        ) {
                            append(" Register here")
                        }
                    },
               onClick = { navController.navigate("signin") })
       }
   }
                }




@ExperimentalMaterialApi
@ExperimentalFoundationApi
    @Composable
    fun MainScreen(navController: NavHostController) {

    val images = (0..7).toList()
    LazyVerticalGrid(
        cells = GridCells.Fixed(3),
        contentPadding = PaddingValues(15.dp),
    ) {
        item {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(ImageBitmap.imageResource(id = R.drawable.calc),
                    contentDescription = "",
                    modifier = Modifier
                        .width(100.dp)
                        .height(100.dp)
                        .padding(15.dp)
                        .clickable(
                            onClick = { navController.navigate("Calc") }
                        )
                )
                Text(
                    "Percentage Calculator",
                    fontSize = 12.sp,
                    textAlign = TextAlign.Center,

                    )
            }
        }
        item {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(ImageBitmap.imageResource(id = R.drawable.archives_77899),
                    contentDescription = "",
                    modifier = Modifier
                        .width(100.dp)
                        .height(100.dp)
                        .padding(15.dp)
                        .clickable(
                            onClick = { navController.navigate("notes") }
                        )

                )
                Text(
                    "Notes",
                    fontSize = 12.sp,
                    textAlign = TextAlign.Center
                )
            }
        }
        item {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(ImageBitmap.imageResource(id = R.drawable.uploads),
                    contentDescription = "",
                    modifier = Modifier
                        .width(100.dp)
                        .height(100.dp)
                        .padding(15.dp)
                        .clickable(
                            onClick = {
                                navController.navigate("upload")

                            }
                        )
                )
                Text(
                    "Uploads",
                    fontSize = 12.sp,
                    textAlign = TextAlign.Center
                )
            }
        }
        item {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                val intent = Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse(
                        "https://mis.srcas.ac.in/SNRApp/Fees/StudentFees/FeesOnlinePayment"
                    )
                )
                val context = LocalContext.current
                Image(ImageBitmap.imageResource(id = R.drawable.fee),
                    contentDescription = "",
                    modifier = Modifier
                        .width(100.dp)
                        .height(100.dp)
                        .padding(15.dp)
                        .clickable(
                            onClick = { startActivity(context, intent, null) }
                        )
                )
                Text(
                    "Fee",
                    fontSize = 12.sp,
                    textAlign = TextAlign.Center
                )
            }
        }
        item {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                val intent = Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://mis.srcas.ac.in/SNRApp")
                )
                val context = LocalContext.current
                Image(ImageBitmap.imageResource(id = R.drawable.cms1),
                    contentDescription = "",
                    modifier = Modifier
                        .width(100.dp)
                        .height(100.dp)
                        .padding(15.dp)
                        .clickable(
                            onClick = {
                                startActivity(context, intent, null)
                            }
                        )
                )
                Text(
                    "MIS",
                    fontSize = 12.sp,
                    textAlign = TextAlign.Center
                )
            }
        }

        item {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(ImageBitmap.imageResource(id = R.drawable.questionbank),
                    contentDescription = "",
                    modifier = Modifier
                        .width(100.dp)
                        .height(100.dp)
                        .padding(15.dp)
                        .clickable(
                            onClick = { navController.navigate("signin") }
                        )
                )
                Text(
                    "Question Bank",
                    fontSize = 12.sp,
                    textAlign = TextAlign.Center
                )
            }
        }
        item {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                val intent = Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse(
                        "http://mis.srcas.ac.in/SNRApp/coe/result/viewexamresults"
                    )
                )
                val context = LocalContext.current
                Image(ImageBitmap.imageResource(id = R.drawable.result),
                    contentDescription = "",
                    modifier = Modifier
                        .width(100.dp)
                        .height(100.dp)
                        .padding(15.dp)
                        .clickable(
                            onClick = { startActivity(context, intent, null) }
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

    Row(modifier= Modifier
        .fillMaxSize()
        .padding(5.dp),
    verticalAlignment = Alignment.Bottom,
        horizontalArrangement = Arrangement.SpaceEvenly
    ){
        IconButton(
            onClick={
                navController.navigate("about")
            },

        ){
            Icon(Icons.Filled.Info,
                "About")
        }

        IconButton(
            onClick={
                navController.navigate("setting")
            },

            ){
            Icon(Icons.Filled.Settings,
                "settings")
        }

        IconButton(
            onClick={
                navController.navigate("contact")
            },

            ){
            Icon(Icons.Filled.ContactMail,
                "queries")
        }
    }

}





//@SuppressLint("SetJavaScriptEnabled")
//@Composable
//fun CMSscreen(navController: NavHostController){
//    AndroidView(factory = {
//        WebView(it).apply {
//            layoutParams = ViewGroup.LayoutParams(
//                ViewGroup.LayoutParams.MATCH_PARENT,
//                ViewGroup.LayoutParams.MATCH_PARENT
//            )
//            webViewClient = WebViewClient()
//            loadUrl("http://mis.srcas.ac.in/SNRApp/dist/account/signin?returnurl=%2Fsnrapp")
//        }
//    } ,update = {
//        it.loadUrl("http://mis.srcas.ac.in/SNRApp/dist/account/signin?returnurl=%2Fsnrapp")
//    })
//}


//@SuppressLint("SetJavaScriptEnabled",)
//@Composable
//fun Fee(navController: NavHostController){
//    AndroidView(factory = {
//        WebView(it).apply {
//            layoutParams = ViewGroup.LayoutParams(
//                ViewGroup.LayoutParams.MATCH_PARENT,
//                ViewGroup.LayoutParams.MATCH_PARENT
//            )
//            webViewClient = WebViewClient()
//            loadUrl("https://mis.srcas.ac.in/SNRApp/Fees/StudentFees/FeesOnlinePayment")
//        }
//    } ,update = {
//        it.loadUrl("https://mis.srcas.ac.in/SNRApp/Fees/StudentFees/FeesOnlinePayment")
//    })
//}


//@SuppressLint("SetJavaScriptEnabled")
//@Composable
//fun Result(navController: NavHostController){
//    AndroidView(factory = {
//        WebView(it).apply {
//            layoutParams = ViewGroup.LayoutParams(
//                ViewGroup.LayoutParams.MATCH_PARENT,
//                ViewGroup.LayoutParams.MATCH_PARENT
//            )
//            webViewClient = WebViewClient()
//            loadUrl("http://mis.srcas.ac.in/SNRApp/coe/result/viewexamresults")
//        }
//    } ,update = {
//        it.loadUrl("http://mis.srcas.ac.in/SNRApp/coe/result/viewexamresults")
//    })
//}




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
@ExperimentalMaterialApi
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    NotesManagerTheme {
        Navigation()

    }
}







