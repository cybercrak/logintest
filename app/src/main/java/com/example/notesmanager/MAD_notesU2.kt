package com.example.notesmanager

import android.annotation.SuppressLint
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.navigation.NavHostController
import com.airbnb.lottie.compose.*
import com.example.notesmanager.ui.theme.lightBlue
import com.example.notesmanager.ui.theme.lightpurple

@ExperimentalFoundationApi
@SuppressLint("SetJavaScriptEnabled")
@Composable
fun MAD_notesU2(navController: NavHostController) {

    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top
    ) {
        item {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    "INTRODUCTION",
                    fontSize = 25.sp,
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colors.secondary

                )
            }
        }
        item {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 15.dp, bottom = 15.dp, start = 10.dp, end = 10.dp)
            ) {
                Text(
                    "What is Mobile User Interface ?",
                    modifier = Modifier.padding(bottom = 15.dp, top = 15.dp),
                    fontSize = 20.sp,
                    color = MaterialTheme.colors.primary,
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.Bold
                )

                Text(
                    " ❁ A mobile user interface (mobile UI) is the graphical and" +
                            "usually touch-sensitive display on a mobile device, such as" +
                            "a smartphone or tablet, that allows the user to interact with" +
                            "the device’s apps, features, content and functions.\n\n" +
                            " ❁ Mobile user interface (UI) design requirements are" +
                            "significantly different from those for desktop computers. The" +
                            "smaller screen size and touch screen controls create special" +
                            "considerations in UI design to ensure usability, readability and" +
                            "consistency.\n\n" +
                            " ❁ In a mobile interface, symbols may be used more extensively" +
                            "and controls may be automatically hidden until accessed. The" +
                            "symbols themselves must also be smaller and there is not" +
                            "enough room for text labels on everything, which can cause confusion.\n\n" +
                            " ❁ Users have to be able to understand a command icon and its meaning" +
                            "whether through legible text or comprehensible graphical" +
                            "representation. Basic guidelines for mobile interface design are" +
                            "consistent across modern mobile operating systems.",
                    fontSize = 18.sp,
                    fontFamily = FontFamily.Serif
                )
            }
        }
        item {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 15.dp, bottom = 15.dp, start = 10.dp, end = 10.dp)
            ) {
                Text(
                    "Mobile User Interface Design – Best Practices",
                    modifier = Modifier.padding(bottom = 15.dp, top = 15.dp),
                    fontSize = 20.sp,
                    color = MaterialTheme.colors.primary,
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.Bold
                )

                Text(
                    " 1) The layout of the information, commands, and content in an app" +
                            "should echo those of the operating system in placement," +
                            "composition and colours.\n" +
                            "\n" +
                            "2) Click points must be usable for touch-based selection" +
                            "with a finger. A click point can't be too small or narrow in" +
                            "any direction, to avoid unwanted selection of nearby items." +
                            "\n" +
                            "3) Maximize the content window size. On small screens, the" +
                            "UI should not unnecessarily dominate screen size. It’s" +
                            "important to recognize that the object of a UI is to facilitate" +
                            "use of content and apps, not just use of the interface.\n" +
                            "\n" +
                            "4) The number of controls or commands displayed at any given" +
                            "time should be appropriate to avoid overwhelming the user or" +
                            "making viewing/interacting with content confusing.\n" +
                            "\n" +
                            "5) An app UI should be customized for each mobile OS, as that is" +
                            "the visual language the device user will be immersed in and" +
                            "typically most familiar with.\n\n",
                    fontSize = 18.sp,
                    fontFamily = FontFamily.Serif
                )
            }
        }

        item {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    "EFFECTIVE USE OF SCREEN REAL ESTATE",
                    fontSize = 20.sp,
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colors.secondary

                )
            }
        }
        item {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 15.dp, bottom = 15.dp, start = 10.dp, end = 10.dp)
            ) {
                Text(
                    " ❁ First know the context of use.\n\n" +
                            " ❁ Who are the users, what do they need and why, and how," +
                            "when, and where will they access and use information?\n\n" +
                            " ❁ Cognitive load is the mental effort to comprehend and use" +
                            "an application, whatever the inherent task complexity or" +
                            "information structure may be.\n\n" +
                            " ❁ Effectively use screen real estate by embracing minimalism," +
                            "maintaining a clear visual hierarchy, and staying focused.\n\n",
                    fontSize = 18.sp,
                    fontFamily = FontFamily.Serif
                )
                Text(
                    "How to use screen effectively ?",
                    modifier = Modifier.padding(bottom = 15.dp, top = 15.dp),
                    fontSize = 20.sp,
                    color = MaterialTheme.colors.primary,
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    "1) Embrace Minimalism",
                    modifier = Modifier.padding(bottom = 15.dp, top = 15.dp),
                    fontSize = 18.sp,
                    color = lightpurple,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    "   -> Limit the features available on each screen, and use small," +
                            "targeted design features.\n\n" +
                            "   -> the application designer should be able to explain why that" +
                            "feature is taking up screen space.\n\n" +
                            "   -> Banners, graphics, and bars should all have a Purpose.\n\n",
                    fontSize = 18.sp,
                    fontFamily = FontFamily.Serif
                )
                Text(
                    "2) Use a Visual Hierarchy",
                    modifier = Modifier.padding(bottom = 15.dp, top = 15.dp),
                    fontSize = 18.sp,
                    color = lightpurple,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    " -> Help users fight cognitive distractions with a clear" +
                            "information hierarchy.\n\n" +
                            " -> Draw attention to the most important content with visual" +
                            "emphasis. Users will be drawn to larger items, more intense" +
                            "colors, or elements that are called out with bullets or arrows;\n\n" +
                            " -> A consistent hierarchy means consistent usability; mobile" +
                            "application creators can create a hierarchy with position," +
                            "form, size, shape, color, and contrast.\n\n",
                    fontSize = 18.sp,
                    fontFamily = FontFamily.Serif
                )

                Text(
                    "3) Stay Focused",
                    modifier = Modifier.padding(bottom = 15.dp, top = 15.dp),
                    fontSize = 18.sp,
                    color = lightpurple,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    " -> Focused content means users won’t leave because it takes" +
                            "too long for the overwhelming amount of images per screen" +
                            "to load.\n\n" +
                            " -> Start with a focused strategy, and keep making decisions to" +
                            "stay focused throughout development.\n\n" +
                            " -> A smaller file size is a good indicator of how fast an" +
                            "application will load\n\n" +
                            " -> Text-heavy pages reduce engagement as eyes glaze over and" +
                            "users switch to another application.\n\n" +
                            " -> Build just enough for what users need,\n\n" +
                            " -> Every cognitive stimulus is perceived by users in its simplest form.\n\n" +
                            " -> Key principles include proximity, closure, continuity, figure and ground," +
                            " and similarity.\n\n",
                    fontSize = 18.sp,
                    fontFamily = FontFamily.Serif
                )
            }
        }
        item {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    "UNDERSTANDING APPLICATION USERS",
                    fontSize = 20.sp,
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colors.secondary

                )
            }
        }
        item {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 15.dp, bottom = 15.dp, start = 10.dp, end = 10.dp)
            ) {
                Text(
                    "1) Proximity:",
                    modifier = Modifier.padding(bottom = 15.dp, top = 15.dp),
                    fontSize = 18.sp,
                    color = lightpurple,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    " -> Users tend to group objects together.\n\n" +
                            " -> Elements placed near each other are perceived in groups Icons that " +
                            "accomplish similar tasks may be categorically organized with proximity.\n" +
                            "\n" +
                            " -> Place descriptive text next to graphics thus user can understand the" +
                            " relationship between these graphical and textual objects."
                )

                Text(
                    "2) Closure:",
                    modifier = Modifier.padding(bottom = 15.dp, top = 15.dp),
                    fontSize = 18.sp,
                    color = lightpurple,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    " -> people recognize a triangle even though the figure is not " +
                            "complete.\n\n" +
                            " -> create icons with a strong primary silhouette, without overloading" +
                            " users on pixelated and overdone details."
                )

                Text(
                    "3) Continuity:",
                    modifier = Modifier.padding(bottom = 15.dp, top = 15.dp),
                    fontSize = 18.sp,
                    color = lightpurple,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    " -> Smooth visual transitions can lead users through a mobile" +
                            "application, such as a link with an indicator pointing toward" +
                            "the next object and task."
                )

                Text(
                    "4) Similarity:",
                    modifier = Modifier.padding(bottom = 15.dp, top = 15.dp),
                    fontSize = 18.sp,
                    color = lightpurple,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    " -> Similar elements are grouped in a semi automated manner, according to" +
                            " the strong visual perception of color, form, size, and other" +
                            " attributes.\n\n" +
                            " -> Strict visual grids confuse users by linking unrelated items within " +
                            "the viewport.\n\n" +
                            " -> The layout should encourage the proper grouping of objects and " +
                            "ideas"
                )
            }
        }
            item {
                Column(
                    modifier = Modifier.fillMaxSize()
                        .padding(top = 15.dp, bottom = 15.dp, start = 10.dp, end = 10.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        "USER INTERFACE DESIGN",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.SansSerif,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colors.secondary
                    )
                    AndroidView(factory = {
                        WebView(it).apply {
                            layoutParams = ViewGroup.LayoutParams(
                                ViewGroup.LayoutParams.MATCH_PARENT,
                                ViewGroup.LayoutParams.MATCH_PARENT
                            )
                            webViewClient = WebViewClient()
                            loadUrl("https://imaginxp.com/understanding-mobile-ui-design/")
                        }
                    } , update = {
                        it.loadUrl("https://imaginxp.com/understanding-mobile-ui-design/")
                    })

                }
            }


    }
        }
