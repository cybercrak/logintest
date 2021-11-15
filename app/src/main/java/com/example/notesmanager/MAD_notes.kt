package com.example.notesmanager

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.MaterialTheme

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.airbnb.lottie.compose.*
import com.example.notesmanager.ui.theme.lightBlue
import com.example.notesmanager.ui.theme.lightpurple
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

@ExperimentalFoundationApi
@Composable
fun MAD_notes(navController: NavHostController) {

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
                    "What is an application ?",
                    modifier = Modifier.padding(bottom = 15.dp, top = 15.dp),
                    fontSize = 20.sp,
                    color = MaterialTheme.colors.primary,
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    "       An application, also referred to as an application program or application software, " +
                            "it is a computer software package that performs a specific function directly for an end user or," +
                            " in some cases, for another application. " +
                            "An application can be self-contained or a group of programs. " +
                            "The program is a set of operations that runs the application for the user.",
                    fontSize = 18.sp,
                    fontFamily = FontFamily.Serif
                )
                Text(
                    "What is mobile application development?",
                    fontSize = 20.sp,
                    modifier = Modifier.padding(bottom = 15.dp, top = 15.dp),
                    color = MaterialTheme.colors.primary,
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    "       Mobile application development is the process of creating " +
                            "software applications that run on a mobile device, and a typical mobile " +
                            "application utilizes a network connection to work with remote computing" +
                            " resources.\n\n " +
                            "❁ A mobile application, referred to as an application (app), is a" +
                            "type of application software designed to run on a mobile device," +
                            "such as a smart phone or tablet computer.\n" +
                            "\n" +
                            "❁ Mobile applications frequently serve to provide users with similar" +
                            "services to those accessed on PCs.\n" +
                            "\n" +
                            "❁ Applications are generally small, individual software units with" +
                            "limited function.\n" +
                            "\n" +
                            "❁ This use of application software was originally popularized by" +
                            "Apple Inc. and its App Store, which offers thousands of" +
                            "applications for the iPhone, iPad and iPod Touch.\n" +
                            "\n" +
                            "❁ A mobile application also may be known as an app, web app, online" +
                            "app, iPhone app or smartphone app.\n",
                    fontSize = 18.sp,
                    fontFamily = FontFamily.Serif
                )

                Text(
                    "Types of Application",
                    modifier = Modifier.padding(bottom = 15.dp, top = 15.dp),
                    fontSize = 20.sp,
                    color = lightpurple,
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    "1) Gaming apps: \n" +
                            "\n" +
                            "           The equivalent of computer video games." +
                            "They  account  for  one-third  of  all  app  downloads  and" +
                            "three-fourths of all consumer spending.\n\n" +
                            "2) Productivity apps: \n" +
                            "\n" +
                            "           These focus on improving business" +
                            "efficiency by easing various tasks such as sending emails," +
                            "tracking  work  progress,  booking  hotels,  and  much  more.\n\n" +
                            "3) Lifestyle and entertainment apps: \n" +
                            "\n" +
                            "           Increasingly popular," +
                            "these  encompass  many  aspects  of  personal  lifestyle  and" +
                            "socialization  such  as  dating,  communicating  on  social" +
                            "media, as well as sharing (and watching) videos. Some of" +
                            "the most widely known apps such as Netflix, Facebook or" +
                            "TikTok fall into this category.\n",
                    fontSize = 18.sp,
                    fontFamily = FontFamily.Serif
                )
                Text(
                    "Mobile Application Development",
                    modifier = Modifier.padding(bottom = 15.dp, top = 15.dp),
                    fontSize = 20.sp,
                    color = lightpurple,
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    "❁ Mobile app development is the creation of software intended " +
                            "to run on mobile devices and optimized to take advantage of " +
                            "those products' unique features and hardware.\n\n" +
                            "❁ The  types  of  mobile  apps  that  developers  create  include" +
                            "native apps, hybrid apps and HTML5 apps.\n\n" +
                            "❁ The mobile app development business is set to grow to nearly" +
                            "$600 billion in 2020.\n\n" +
                            "❁ Due to the exploding popularity of smartphones and tablets," +
                            "mobile  application  development  is  an  increasingly  popular" +
                            "medium of software creation\n\n",
                    fontSize = 18.sp,
                    fontFamily = FontFamily.Serif
                )


            }
        }
        item {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 15.dp, bottom = 15.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    "PRELIMINARY CONSIDERATION",
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
                    "There are 5 Important Considerations For Mobile Application" +
                            "Development Process.\n",
                    fontSize = 18.sp,
                    fontFamily = FontFamily.Serif
                )
                Text(
                    "1. Connect with cloud based systems:\n",
                    modifier = Modifier.padding(bottom = 15.dp, top = 15.dp),
                    fontSize = 18.sp,
                    color = lightpurple,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    "   -> The key benefits of using cloud computing is its scalability.\n" +
                            "\n" +
                            "   -> Cloud  computing  allows  business  to  easily  upscale  or" +
                            "downscale  IT requirements as and when required.\n" +
                            "\n" +
                            "   ->  Most cloud service providers allow to increase existing" +
                            "resources to accommodate increased business needs or" +
                            "changes.\n" +
                            "\n" +
                            "   -> This will allow to support business growth without expensive" +
                            "changes to existing IT systems.\n",
                    fontSize = 18.sp,
                    fontFamily = FontFamily.Serif
                )
                Text(
                    "2. Component Based Development Methods:\n",
                    modifier = Modifier.padding(bottom = 15.dp, top = 15.dp),
                    fontSize = 18.sp,
                    color = lightpurple,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    "  -> Component  Based  Software  Development  (CBSD)  is  a" +
                            "concept that facilitates the creation of flexible, reliable and" +
                            "reusable systems.\n" +
                            "\n" +
                            "   ->  Such  paradigm  relies  on  the  concept  of  building  and" +
                            "application component which is meant have reusable pieces" +
                            "of code.\n" +
                            "\n" +
                            "   -> It is advisable that each of the component should have" +
                            "some clearly defined functionality and must be independent" +
                            "of the whole system. \n" +
                            "\n" +
                            "   -> Also, within a well-defined architecture these components" +
                            "must communicate with each other using apt interfaces.\n",
                    fontSize = 18.sp,
                    fontFamily = FontFamily.Serif
                )
                Text(
                    "3. Test Driven Development:\n",
                    modifier = Modifier.padding(bottom = 15.dp, top = 15.dp),
                    fontSize = 18.sp,
                    color = lightpurple,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    "  -> This computer programming method comprises of small iterations.\n\n" +
                            "   -> This method implies writing the test cases covering the new functionality.\n\n" +
                            "   -> Next  production code is written which makes the test" +
                            "pass and finally the code is refactored to make it more maintainable.\n\n" +
                            "   -> Running Unit Tests in Test Driven Development gives fast" +
                            "confirmation of whether the code behaves as it should or not\n",
                    fontSize = 18.sp,
                    fontFamily = FontFamily.Serif
                )
                Text(
                    "4. Backend as a Service (BaaS):\n",
                    modifier = Modifier.padding(bottom = 15.dp, top = 15.dp),
                    fontSize = 18.sp,
                    color = lightpurple,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    "  -> Provides a way to connect the applications to backend cloud storage \n\n" +
                            "   -> Also offers some common features such as user management," +
                            "push notifications and social networking integration.\n\n" +
                            "   -> Also offers some features that mobile users demand from their apps\n",
                    fontSize = 18.sp,
                    fontFamily = FontFamily.Serif
                )
                Text(
                    "5) MVC Framework: (Model View Control)\n\n",
                    modifier = Modifier.padding(bottom = 15.dp, top = 15.dp),
                    fontSize = 18.sp,
                    color = lightpurple,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    "  -> Developers can separate business logic, data base access and presentation.\n\n" +
                            "   -> Helps  in  easy  maintenance  of  code  and  reduces  the maintenance cost at client ends.\n\n",
                    fontSize = 18.sp,
                    fontFamily = FontFamily.Serif
                )

            }
        }
        item {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 15.dp, bottom = 15.dp,start=10.dp,end = 10.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    "COST OF DEVELOPMENT",
                    fontSize = 25.sp,
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colors.secondary

                )
            }
        }
        item {

            Text(
                "  There  are  over 3.8  Billion  active  mobile  users  in  2021" +
                        "worldwide. That number amounts to over 50% of the world" +
                        "population, making it preemptive for businesses to invest in a" +
                        "mobile app solution. \n\n",
                fontSize = 18.sp,
                fontFamily = FontFamily.Serif
            )
            Image(
                painter = painterResource(id = R.drawable.madstat),
                contentDescription = "",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(500.dp)
                    .padding(10.dp)

            )

        }
        item {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 15.dp, bottom = 15.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    "WEB SERVICES FOR MOBILE DEVICES",
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
                    "What is web service ?",
                    modifier = Modifier.padding(
                        bottom = 15.dp,
                        top = 15.dp
                    ),
                    fontSize = 20.sp,
                    color = MaterialTheme.colors.primary,
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.Bold
                )

                Text(
                    "   Web  services  are  XML-based  information  exchange systems  that  use  " +
                            "the  Internet  for  directapplication-to-application  interaction.  " +
                            "These  systems  can include programs, objects, messages, or documents.\n\n" +
                            "   -> A  web  service  enables  two  electronic  devices  to" +
                            "communicate over the Internet.\n\n" +
                            "   -> The  World  Wide  Web  Consortium  (W3C)  defines  web" +
                            "service  as  “a  software  system  designed  to  support" +
                            "interoperable  machine-to-machine  interaction  over  a" +
                            "network.”\n\n " +
                            "   -> A  web  service  is  a  collection  of  open  protocols  and standards " +
                            "used for exchanging data between applications or systems.\n\n" +
                            "   -> Software  applications  written  in  various  programming languages and" +
                            " running on various platforms can use web services to exchange data over " +
                            "computer networks like the Internet in a manner similar to inter-process " +
                            "communication on a single computer.\n\n" +
                            "   -> This interoperability (e.g., between Java and Python, or Windows and" +
                            " Linux applications) is due to the use of open standards.\n\n",
                    fontSize = 18.sp,
                    fontFamily = FontFamily.Serif
                )
            }
        }
    }
}
