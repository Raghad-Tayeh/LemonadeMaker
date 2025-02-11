package com.example.lemonademaker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.lemonademaker.ui.theme.LemonadeMakerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LemonadeMakerTheme {
                defineScreen()
            }
        }
    }
}

@Composable
fun lemonTree(navController: NavController) {

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFFFEB3B))
    ) {
        Text(
            text = stringResource(R.string.lemonade),
            modifier = Modifier
                .align(Alignment.TopCenter)
                .padding(all = 15.dp),
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold
        )
    }
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {
        Box(
            modifier = Modifier
                .size(120.dp)
                .background(color = Color(0xFFB3E5FC), shape = RoundedCornerShape(25.dp))
                .align(Alignment.CenterHorizontally)
        ) {
            Image(
                painter = painterResource(R.drawable.lemon_tree),
                contentDescription = stringResource(R.string.lemon_tree),
                modifier = Modifier
                    .clickable {
                        navController?.navigate("squeezeLemon")
                    }
                    .size(75.dp)
                    .align(Alignment.Center)
            )
        }

        Spacer(modifier = Modifier.height(15.dp))

        Text(
            text = stringResource(R.string.tap_lemon_tree),
            modifier = Modifier
                .align(Alignment.CenterHorizontally),
            fontSize = 15.sp
        )
    }
}

@Composable
fun squeezeLemon(navController: NavController) {
    var noOfClicks by remember { mutableStateOf(2) }

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFFFEB3B))
    ) {
        Text(
            text = stringResource(R.string.lemonade),
            modifier = Modifier
                .align(Alignment.TopCenter)
                .padding(all = 15.dp),
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold
        )
    }
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {
        Box(
            modifier = Modifier
                .size(120.dp)
                .background(color = Color(0xFFB3E5FC), shape = RoundedCornerShape(25.dp))
                .align(Alignment.CenterHorizontally)
        ) {
            Image(
                painter = painterResource(R.drawable.lemon_squeeze),
                contentDescription = stringResource(R.string.lemon),
                modifier = Modifier
                    .clickable {
                       if (noOfClicks <= 4) {
                           noOfClicks++
                       }

                        if (noOfClicks > 4) {
                            navController?.navigate("drinkLemonade")
                        }
                    }
                    .size(75.dp)
                    .align(Alignment.Center)
            )
        }

        Spacer(modifier = Modifier.height(15.dp))

        Text(
            text = stringResource(R.string.keep_squeezing),
            modifier = Modifier
                .align(Alignment.CenterHorizontally),
            fontSize = 15.sp
        )
    }
}

@Composable
fun drinkLemonade(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFFFEB3B))
    ) {
        Text(
            text = stringResource(R.string.lemonade),
            modifier = Modifier
                .align(Alignment.TopCenter)
                .padding(all = 15.dp),
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold
        )
    }
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {
        Box(
            modifier = Modifier
                .size(120.dp)
                .background(color = Color(0xFFB3E5FC), shape = RoundedCornerShape(25.dp))
                .align(Alignment.CenterHorizontally)
        ) {
            Image(
                painter = painterResource(R.drawable.lemon_drink),
                contentDescription = stringResource(R.string.lemonade),
                modifier = Modifier
                    .clickable {
                        navController?.navigate("startAgain")
                    }
                    .size(75.dp)
                    .align(Alignment.Center)
            )
        }

        Spacer(modifier = Modifier.height(15.dp))

        Text(
            text = stringResource(R.string.tap_the_lemonade),
            modifier = Modifier
                .align(Alignment.CenterHorizontally),
            fontSize = 15.sp
        )
    }
}

@Composable
fun startAgain(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFFFEB3B))
    ) {
        Text(
            text = stringResource(R.string.lemonade),
            modifier = Modifier
                .align(Alignment.TopCenter)
                .padding(all = 15.dp),
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold
        )
    }
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {
        Box(
            modifier = Modifier
                .size(120.dp)
                .background(color = Color(0xFFB3E5FC), shape = RoundedCornerShape(25.dp))
                .align(Alignment.CenterHorizontally)
        ) {
            Image(
                painter = painterResource(R.drawable.lemon_restart),
                contentDescription = stringResource(R.string.empty_glass),
                modifier = Modifier
                    .clickable {
                        navController?.navigate("home")
                    }
                    .size(75.dp)
                    .align(Alignment.Center)
            )
        }

        Spacer(modifier = Modifier.height(15.dp))

        Text(
            text = stringResource(R.string.tap_the_empty_glass),
            modifier = Modifier
                .align(Alignment.CenterHorizontally),
            fontSize = 15.sp
        )
    }
}

@Composable
fun defineScreen() {
    val navController = rememberNavController()
    androidx.navigation.compose.NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            lemonTree(navController)
        }

        composable("squeezeLemon") {
            squeezeLemon(navController)
        }

        composable("drinkLemonade") {
            drinkLemonade(navController)
        }

        composable("startAgain") {
            startAgain(navController)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun lemonadeAppPreview() {
    LemonadeMakerTheme {
        defineScreen()
    }
}