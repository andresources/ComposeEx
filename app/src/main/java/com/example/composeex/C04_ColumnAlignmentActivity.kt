package com.example.composeex

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
//horizontalAlignment = Alignment.CenterHorizontally
class C04_ColumnAlignmentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            funUIAlignments()
        }
    }
}

@Composable
fun funUIAlignments(){
    //padding should be end of the Modifier methods
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .border(width = 2.dp, color = Color.Red)
            .padding(10.dp),
        horizontalAlignment = Alignment.End,
        verticalArrangement = Arrangement.Bottom
    ) {
        Text(text = "Android")
        Text(text = "Jetpack Compose")
    }
}

@Preview
@Composable
fun previewUIAlignment(){
    funUIAlignments()
}
