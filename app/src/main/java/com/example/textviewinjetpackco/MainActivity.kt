package com.example.textviewinjetpackco

import android.bluetooth.BluetoothClass
import android.graphics.fonts.FontStyle
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Device
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.textviewinjetpackco.ui.theme.TextViewInJetpackCoTheme
import java.nio.file.WatchEvent

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            setUi()

        }
    }

    @Composable
    fun setUi() {
        Column (
            modifier= Modifier
                .background(Color.Blue)
                .fillMaxSize()
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly

        ) {


            Text(
                text = "Hello",
                color = Color(0XFF3700B3),
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .width(200.dp)
                    .background(Color.Green, shape = RoundedCornerShape(10.dp))
                    .padding(20.dp)
                    .padding(top = 5.dp)

            )
            Text(
                text = "Android",
                modifier = Modifier
                    .fillMaxWidth()
                    //.padding(30.dp)
                    .padding(bottom = 10.dp, top = 10.dp)
                    .background(Color.Red)
                    .padding(20.dp),
                color = Color.Black,
                fontSize = 30.sp,
                textAlign = TextAlign.Center
            )
            Text(
                text = "Developers",
                color = colorResource(id = R.color.purple_700),
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.DarkGray)
                    .padding(20.dp)
            )
            Button(
                onClick = {
                    Toast.makeText(
                        this@MainActivity,
                        "Test Application",
                        Toast.LENGTH_SHORT
                    ).show()
                },
                modifier = Modifier
                    .height(40.dp)
                    .width(200.dp)
                    .padding(top = 5.dp, start = 20.dp),
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.LightGray
                )

            ) {
                Text(
                    text = "ANDROID",
                    color = Color.Red,
                    fontSize = 8.sp,

                    modifier = Modifier
                        .padding(top = 5.dp, bottom = 5.dp)

                )


            }
            Surface(
                shape = CircleShape,

               modifier = Modifier
                    .padding(top=4.dp)
//                    .width(200.dp)
//                    .height(500.dp)

            ) {
                Image(
                    painter = painterResource(id = R.drawable.img_20),
                    contentDescription = "nature",
                    modifier = Modifier
                        .width(300.dp)
                        .height(200.dp),

                    contentScale = ContentScale.Inside


                )
            }
            Surface(
                shape = CircleShape,

                modifier = Modifier
                    .padding(top=4.dp)
//                    .width(200.dp)
//                    .height(500.dp)

            ) {
                Image(
                    painter = painterResource(id = R.drawable.img_20),
                    contentDescription = "nature",
                    modifier = Modifier
                        .width(300.dp)
                        .height(300.dp),

                    contentScale = ContentScale.Inside


                )
            }
            Surface(
                shape = CircleShape,

                modifier = Modifier
                    .padding(top=4.dp)
//                    .width(200.dp)
//                    .height(300.dp)

            ) {
                Image(
                    painter = painterResource(id = R.drawable.img_20),
                    contentDescription = "nature",
                    modifier = Modifier
                        .width(300.dp)
                        .height(300.dp),

                    contentScale = ContentScale.Inside


                )
            }
        }
    }

    @Preview(
        showBackground = true,
        name = "Test",
        // widthDp = 400,
        // heightDp = 500,
        showSystemUi = true,
        device = Devices.NEXUS_10
    )
    @Composable
    fun setPreview() {
        setUi()

    }




}
