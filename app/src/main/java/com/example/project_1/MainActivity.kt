package com.example.project_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.project_1.Navigation.NavGraph
import com.example.project_1.ui.theme.Project_1Theme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Project_1Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    NavGraph()
                }
            }
        }
    }
}