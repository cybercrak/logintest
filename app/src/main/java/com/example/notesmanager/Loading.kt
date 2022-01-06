package com.example.notesmanager

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

import androidx.navigation.NavHostController
import com.airbnb.lottie.compose.*

@Composable
fun Loading (navController: NavHostController){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {



            val compositionResult: LottieCompositionResult = rememberLottieComposition(
                spec = LottieCompositionSpec.RawRes(
                    R.raw.loader
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
                modifier = Modifier.fillMaxSize()
            )

        }

    }