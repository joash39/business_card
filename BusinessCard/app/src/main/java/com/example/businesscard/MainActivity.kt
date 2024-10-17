package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting(name = "Joash Kibet",
                        occupation = "Android Developer",
                        phone = "+254703522710",
                        share = "@Joash39",
                        email = "kibetjoash93@gmail.com")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String,occupation : String ,modifier: Modifier = Modifier
,phone : String, share : String, email: String
) {
    val image = painterResource(id = R.drawable.dev)

    Column (verticalArrangement = Arrangement.Center

    ){


        Image(
            painter = image,
            contentDescription = "dev picture",

        )

        Text(
            text = name,
            modifier = modifier.align(alignment = CenterHorizontally),
            fontFamily = FontFamily.Cursive,
            fontStyle = FontStyle(8),
            fontSize = 50.sp
        )

        Text(
            text = occupation,
            modifier = modifier.align(alignment = CenterHorizontally),
            fontFamily = FontFamily.Monospace,
            fontSize = 20.sp,

        )
    }


    Column( modifier = modifier
        .fillMaxSize()
        .padding(start = 160.dp, bottom = 30.dp),
       verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = androidx.compose.ui.Alignment.Start

        ) {


        Text(
            text = phone,

            fontFamily = FontFamily.Default,
            fontSize = 18.sp,
            textAlign = TextAlign.Justify

        )





        Text(
            text = share,

            fontFamily = FontFamily.Default,
            fontSize = 18.sp,
            textAlign = TextAlign.End,


        )


        Text(
            text = email,

            fontFamily = FontFamily.Default,
            fontSize = 18.sp,
            textAlign = TextAlign.Center

            )
    }

    Column( modifier = modifier
        .fillMaxSize()
        .padding(start = 80.dp, bottom = 30.dp),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = androidx.compose.ui.Alignment.Start

    ) {

        val phone_img = painterResource(id = R.drawable.phone_icon)
        val share_img = painterResource(id = R.drawable.share_icon)
        val email_img = painterResource(id = R.drawable.email_icon)


        Image(
            painter = phone_img,
            contentDescription = null,


        )

        Image(
            painter = share_img,
            contentDescription = null,


            )

        Image(
            painter = email_img,
            contentDescription = null,


            )
    }



}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardTheme {

        Surface(modifier = Modifier.fillMaxSize()) {
            Greeting(
                name = "Joash Kibet",
                occupation = "Android Developer",
                phone = "+254703522710",
                share = "@Joash39",
                email = "kibetjoash93@gmail.com"
            )
        }
    }
}