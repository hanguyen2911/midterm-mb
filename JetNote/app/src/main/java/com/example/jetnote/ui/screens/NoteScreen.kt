package com.example.jetnote.ui.screens

import NoteColor
import androidx.activity.viewModels
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Scaffold
import androidx.compose.material.ScaffoldState
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.List
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetnote.JetNotesApplication
import com.example.jetnote.data.database.model.NoteDbModel
import com.example.jetnote.domain.model.NoteModel
import com.example.jetnote.routing.Screen
import com.example.jetnote.ui.components.AppDrawer
import com.example.jetnote.ui.components.TopAppBar
import com.example.jetnote.util.fromHex
import com.example.jetnote.viewmodel.MainViewModel
import com.example.jetnote.viewmodel.MainViewModelFactory
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch

@Composable
fun NoteScreen(viewModel: MainViewModel) {
    val notes: List<NoteModel> by viewModel.notesNotInTrash.observeAsState(listOf())
    val scaffoldState: ScaffoldState = rememberScaffoldState()
    val coroutineScope = rememberCoroutineScope()
    Scaffold( scaffoldState = scaffoldState,topBar = {
        TopAppBar(
            title = "Menu",
            icon = Icons.Filled.List,
            onIconClick = { coroutineScope.launch { scaffoldState.drawerState.open() } })
    },
        drawerContent = {
            AppDrawer (currentScreen = Screen.Notes,
                closeDrawerAction = {
                    coroutineScope.launch {
                        scaffoldState.drawerState.close()
                    }
                }
            )
        },
        content = {
            if(notes.isEmpty()){
                Text(text = "Hello")

            }else{
                NoteList(notes = notes, onNoteCheckedChange = { }, onNoteClick = {})
            }

        }
    )
}

@Composable
private fun NoteList(
    notes: List<NoteModel>,
    onNoteCheckedChange: (NoteModel) -> Unit,
    onNoteClick: (NoteModel) -> Unit

) {
    val backgroundShape: Shape = RoundedCornerShape(4.dp)
    LazyColumn {
        items(notes) { element ->
            Row(
                modifier = Modifier
                    .padding(7.dp)
                    .shadow(1.dp, backgroundShape)
                    .heightIn(min = 64.dp)
                    .background(
                        Color.White, backgroundShape
                    )
            ) {

                NoteColor(
                    modifier = Modifier
                        .padding(start = 16.dp, end = 16.dp),
                    color = Color.fromHex(element.color.hex),
                    size = 40.dp,
                    border = 2.dp
                )
                Column(
                    modifier = Modifier
                        .weight(1f)
                        .align(Alignment.CenterVertically)
                ) {
                    Text(
                        text = element.title,
                        maxLines = 1,
                        color = Color.Black,
                        style = TextStyle(
                            fontWeight = FontWeight.Normal,
                            fontSize = 16.sp,
                            letterSpacing = 0.15.sp
                        )
                    )
                    Text(
                        text = element.content,
                        maxLines = 1,
                        color = Color.Black.copy(alpha = 0.75f),
                        style = TextStyle(
                            fontWeight = FontWeight.Normal,
                            fontSize = 14.sp,
                            letterSpacing = 0.25.sp
                        )
                    )

                }
            }
        }

    }
}

@Preview
@Composable
private fun NotesListPreview() {
    NoteList(
        notes = listOf(
            NoteModel(1, "Food", "Chicken, noodle"),
            NoteModel(2, "Drink", "Coca, milk, coffe,..."),
            NoteModel(3, "Title 3", "Content 3"),
            NoteModel(4, "Title 4", "Content 4", false),
            NoteModel(5, "Title 5", "Content 5", false)
        ),
        onNoteClick = {},
        onNoteCheckedChange = {},
    )
}

