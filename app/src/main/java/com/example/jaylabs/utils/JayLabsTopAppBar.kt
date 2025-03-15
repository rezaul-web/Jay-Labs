package com.example.jaylabs.utils

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.jaylabs.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun JayLabsTopAppBar(
    navController: NavController,
    onPastReportsClick: () -> Unit // Callback for Past Reports button
) {
    TopAppBar(
        colors = TopAppBarDefaults.topAppBarColors(containerColor = Color(0xFFDF99F0).copy(alpha = 0.4f)),
        title = {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {
                Image(
                    painter = painterResource(R.drawable.app_icon),
                    contentDescription = "App Icon",
                    modifier = Modifier.size(32.dp) // Slightly larger icon
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = "Jay Labs",
                    color = Color(0xFF4392F9),
                    style = MaterialTheme.typography.titleMedium.copy(fontSize = 20.sp)
                )
            }
        },
        actions = {
            TextButton(
                onClick = onPastReportsClick
            ) {
                Text(
                    text = "Past Reports",
                    color = Color(0xFF4392F9),
                    style = MaterialTheme.typography.bodyMedium.copy(fontSize = 16.sp)
                )
            }
        }
    )
}
