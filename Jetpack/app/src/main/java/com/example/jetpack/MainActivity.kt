package com.example.jetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpack.ui.theme.JetpackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    Greeting(desc1 = stringResource(id = R.string.jetpack_desc),
                        desc2 = stringResource(id = R.string.jetpack_desc2),
                        desc3 = stringResource(id = R.string.jetpack_desc3))
                }
            }
        }
    }
}

@Composable
fun Greeting(desc1: String, desc2: String, desc3: String, modifier: Modifier = Modifier) {
    val image = painterResource(id = R.drawable.bg_compose_background)
    Surface {
        Image(
            painter = image,
            contentDescription = null,
            modifier = modifier.fillMaxWidth()
        )




        Text(
            text = desc1,
            modifier = modifier
                .fillMaxSize()
                .padding(top = 130.dp)
                 ,
            lineHeight = 50.sp,
            fontSize = 30.sp,


            )
            Text(
                text = desc2,
                modifier = modifier
                    .fillMaxSize()
                    .padding(top = 180.dp)
                    ,
                fontSize = 12.sp,
                lineHeight = 20.sp


            )
            Text(
                text = desc3,
                modifier = modifier
                    .fillMaxSize()
                    .padding(top = 250.dp),
                fontSize = 12.sp,
                lineHeight = 20.sp


            )



    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackTheme {
       Greeting(desc1 = stringResource(id = R.string.jetpack_desc), desc2 = stringResource(id = R.string.jetpack_desc2),
       desc3 = stringResource(id = R.string.jetpack_desc3))
    }
}