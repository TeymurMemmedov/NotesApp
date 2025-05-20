package com.example.notesapp.data

import com.example.notesapp.Note

class NotesRepositoryImplFake:NotesRepository {
    private val fakeData = listOf<Note>(
        Note("Note 1"),
        Note("Note 2"),
        Note("Note 3"),
        Note("Note 4"),
        Note("Note 5"),
        Note("Note 6"),
        Note("Note 7"),
        Note("Note 8"),
        Note("Note 9"),
        Note("Note 10"),
        Note("Note 11"),
        Note("Note 12"),
        Note("Note 13"),
        Note("Note 14"),
        Note("Note 15")
    )

    override fun getNotes() = fakeData

}