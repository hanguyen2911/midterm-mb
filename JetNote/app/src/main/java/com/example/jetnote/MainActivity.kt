package com.example.jetnote

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Scaffold
import androidx.compose.material.ScaffoldState
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.rememberCoroutineScope
import com.example.jetnote.routing.Screen
import com.example.jetnote.theme.JetNotesTheme
import com.example.jetnote.ui.components.AppDrawer
import com.example.jetnote.ui.components.Note
import com.example.jetnote.ui.components.NoteScreen
import com.example.jetnote.viewmodel.MainViewModel
import com.example.jetnote.viewmodel.MainViewModelFactory
import kotlinx.coroutines.launch

/**
 * Main activity for the app.
 */
class MainActivity : AppCompatActivity() {

    private val viewModel: MainViewModel by viewModels(factoryProducer = {
        MainViewModelFactory(
            this,
            (application as JetNotesApplication).dependencyInjector.repository
        )
    })


    override fun onCreate(saveInstantState: Bundle?) {
        super.onCreate(saveInstantState)
        setContent {
            JetNotesTheme {

                        NoteScreen(viewModel = viewModel)

            }

        }

    }
}

