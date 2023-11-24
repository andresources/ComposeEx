package com.example.composeex

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

class C03_ColumnModifierActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            finitUI()
        }
    }
}
//Modifiers allow you to decorate a composable, and it let you do these sorts of things :
//Change the composable's size, layout, behavior, and appearance
//Add high-level interactions, like making an element clickable, scrollable, draggable, or zoomable
 @Composable
 fun finitUI(){
     Column(modifier = Modifier
         .background(color = Color.Red)
         .fillMaxHeight()
         .fillMaxWidth()
         ) {
            Text(text = "Hello -1")
            Text(text = "Hello -2")
     }
 }

@Preview
@Composable
fun previewinitView(){
    finitUI()
}