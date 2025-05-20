package com.example.notesapp.ui.home

import com.example.notesapp.data.NotesRepository
import com.example.notesapp.ui.navigation.Screens
import com.github.terrakok.cicerone.Router

class HomePresenterImpl(
    private val router:Router,
    private val notesRepository: NotesRepository
): HomeContract.HomePresenter {

    override fun fetchNotes() = notesRepository.getNotes()

    override fun navigateToCreateNote() {
        router.navigateTo(Screens.noteCreating())
    }
}