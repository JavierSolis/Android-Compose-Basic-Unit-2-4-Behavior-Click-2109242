package codelab.javiersolis.unit2_4.i210924.lemonade

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.ColorRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import codelab.javiersolis.unit2_4.i210924.lemonade.ui.theme.LemonadeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LemonadeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    LemonadeApp(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun LemonadeApp( modifier: Modifier = Modifier) {
    Column(modifier = modifier.background(colorResource(id = R.color.content_background))) {
        AppTitle()
        GuideUser()
    }
}

@Composable
fun GuideUser() {
    var stepCurrent by remember { mutableStateOf(1) }
    var squezzeTotal by remember { mutableStateOf(0) }
    var squezzeCurrent by remember { mutableStateOf(0) }

    val textStep = when(stepCurrent) {
        1 -> stringResource(id = R.string.step_1)
        2 -> stringResource(id = R.string.step_2)
        3 -> stringResource(id = R.string.step_3)
        4 -> stringResource(id = R.string.step_4)
        else -> stringResource(id = R.string.step_1)
    }

    val imgStep = when(stepCurrent) {
        1 -> painterResource(id = R.drawable.lemon_tree)
        2 -> painterResource(id = R.drawable.lemon_squeeze)
        3 -> painterResource(id = R.drawable.lemon_drink)
        4 -> painterResource(id = R.drawable.lemon_restart)
        else -> painterResource(id = R.drawable.lemon_tree)
    }

    val descImg = when(stepCurrent) {
        1 -> stringResource(id = R.string.lemon_tree)
        2 -> stringResource(id = R.string.lemon)
        3 -> stringResource(id = R.string.glass_of_lemonade)
        4 -> stringResource(id = R.string.empty_glass)
        else -> stringResource(id = R.string.lemon_tree)
    }
    
    Column(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.Center)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Button(
            onClick = {
                when(stepCurrent) {
                    1 -> {
                        stepCurrent++
                        squezzeTotal = (2..4).random()
                        Log.d("GuideUser", "squezzeTotal: $squezzeTotal")
                        squezzeCurrent = 0
                    }
                    2 -> {
                        squezzeCurrent++
                        if(squezzeCurrent >= squezzeTotal) {
                            stepCurrent++
                        }
                    }
                    3 -> stepCurrent++
                    4 -> stepCurrent=1
                    else -> stepCurrent=1
                }
            },
            shape = RoundedCornerShape(16.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = colorResource(id = R.color.step)
            ),
        ) {
            Image(
                painter = imgStep,
                contentDescription = descImg,
            )
        }
        Spacer(modifier = Modifier
            .height(20.dp)
        )

        Text(
            text = textStep,
            fontSize = 16.sp,
            color = colorResource(id = R.color.guide_step_text_color),
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth()
        )
    }
}

@Composable
fun AppTitle() {
    Text(
        text = stringResource(id = R.string.app_name),
        color = colorResource(id = R.color.title_text),
        fontSize = 18.sp,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Center,
        modifier = Modifier
            .background(colorResource(id = R.color.title_background))
            .padding(16.dp)
            .fillMaxWidth()

    )
}

@Preview(showBackground = true)
@Composable
fun LemonadeAppPreview() {
    LemonadeTheme {
        LemonadeApp(modifier = Modifier.fillMaxSize())
    }
}