package com.example.noteapp.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.noteapp.ui.theme.BabyBlue

@Entity
data class Note(
    @PrimaryKey
    val id : Int? = null,
    val title : String,
    val content: String,
    val timestamp: Long,
    val color : Int
) {
    companion object {
        val noteColors = listOf(BabyBlue)
    }
}

class InvalidNoteException(message: String): Exception(message)
