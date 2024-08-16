package com.example.medicare

import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicText
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.medicare.ui.theme.MediCareTheme
import com.example.medicare.ui.theme.bluee
import com.example.medicare.ui.theme.green

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Home()


        }
    }
}


@Composable
fun Home(){
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        
    // image
        Image(
            painter = painterResource(id = R.drawable.home),
            contentDescription ="",
            modifier = Modifier.size(350.dp),
        )



    // homepage
        Text(
            text = "MediCare",
            fontSize = 50.sp,
            color = Color.Cyan,
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight.ExtraBold,
            )

        Text(
            text = "We offer the best medical services",
            fontSize = 20.sp,
            fontWeight = FontWeight.Black,


        )
        // button
        // modifier; height,width,padding
        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(bluee),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp)


        ) {
            Text(
                text = "lets Get Started",
                color = Color.Black,
                fontSize = 22.sp,
                fontWeight = FontWeight.SemiBold,
                fontFamily = FontFamily.Serif,

            )

        }




        
    }








    }




@Composable
@Preview(showBackground = true)
fun HomePreview(){
    Home()

}
