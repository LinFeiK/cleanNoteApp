package com.plcoding.cleanarchitecturenoteapp.feature_note.presentation.screen_notes

import com.plcoding.cleanarchitecturenoteapp.feature_note.domain.model.Note
import com.plcoding.cleanarchitecturenoteapp.feature_note.domain.util.NoteOrder

sealed class NotesEvent {
    data class Order(val noteOrder: NoteOrder): NotesEvent()
    data class DeleteNote(val note: Note): NotesEvent()
    data class RestoreNote(val errorMessage: String): NotesEvent()
    object ToggleOrderSection: NotesEvent()
}