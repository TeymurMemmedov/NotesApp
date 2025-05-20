package com.example.notesapp

import java.util.UUID

data class Note(
    val id:UUID,
    val content:String
){
    constructor(content:String):this(UUID.randomUUID(),content)
}