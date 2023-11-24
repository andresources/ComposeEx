package com.example.composeex

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
//https://developer.android.com/jetpack/compose/tutorial
class C01_Basics : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { //setContent block defines the activity's layout where composable functions are called
            //Jetpack Compose uses a Kotlin compiler plugin to transform these composable functions into the app's UI elements
            msgCard()
        }
    }
}
//To make a function composable, add the @Composable annotation.
//Jetpack Compose is built around composable functions.
// These functions let you define your app's UI programmatically by describing how it should look and providing data dependencies,
//  rather than focusing on the process of the UI's construction (initializing an element, attaching it to a parent, etc.).
//**Composable functions can only be called from other composable functions.
@Composable
fun msgCard(){
    //Text is a composable fun. to display text like textview
    Text(text = "Hello")
}
//The @Preview annotation lets you preview your composable functions within Android Studio without having to build and install the app to an Android device or emulator.
@Preview
@Composable
fun previewMsg(){
    msgCard()
}