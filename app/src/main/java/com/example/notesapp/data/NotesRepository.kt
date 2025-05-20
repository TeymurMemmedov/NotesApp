package com.example.notesapp.data

import com.example.notesapp.Note

interface NotesRepository {
    fun getNotes():List<Note>
}