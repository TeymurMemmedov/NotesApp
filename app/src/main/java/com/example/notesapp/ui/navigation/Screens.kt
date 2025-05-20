package com.example.notesapp.ui.navigation

import com.example.notesapp.CreateNoteFragment
import com.example.notesapp.ui.home.HomeFragment
import com.github.terrakok.cicerone.androidx.FragmentScreen

object Screens {
    fun home() = FragmentScreen { HomeFragment() }
    fun noteCreating() = FragmentScreen { CreateNoteFragment() }
}
