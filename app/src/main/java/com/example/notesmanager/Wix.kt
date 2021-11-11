package com.example.notesmanager

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.core.content.ContextCompat
import androidx.navigation.NavHostController


@SuppressLint("SetJavaScriptEnabled")
@Composable
fun Wix(navController: NavHostController){
    val context = LocalContext.current
    val intent = Intent(
        Intent.ACTION_VIEW,
        Uri.parse(
            "https://sarransarran4465.wixsite.com/cybercrak"
        )
    )
    ContextCompat.startActivity(context, intent, null)
}