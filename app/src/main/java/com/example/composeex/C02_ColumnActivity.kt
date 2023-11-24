package com.example.composeex

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class C2_ColumnActivity : AppCompatActivity(){
    //let you to arrange ui elements in vertically
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var msg = Message("Android","Compose")
            messageCard(msg)
        }
    }
}

data class Message(val author: String,val body: String)
@Composable
fun messageCard(msg: Message){
    Column() {
        Text(text = msg.author)
        Text(text = msg.body)
    }
}

@Preview
@Composable
fun previewMessage(){
        var msg = Message("Android","Compose")
        messageCard(msg)
}