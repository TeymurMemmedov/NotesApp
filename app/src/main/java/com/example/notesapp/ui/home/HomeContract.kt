package com.example.notesapp.ui.home

import com.example.notesapp.Note

interface HomeContract {

    interface HomePresenter {
        fun navigateToCreateNote()
        fun fetchNotes():List<Note>
    }

    interface HomeView {
        fun OnClickToCreateNote()
        fun showNotes()
    }
}