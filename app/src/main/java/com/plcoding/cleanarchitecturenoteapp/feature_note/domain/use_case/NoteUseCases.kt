package com.plcoding.cleanarchitecturenoteapp.feature_note.domain.use_case

// Class containing references to all the use cases for this feature, to be injected in the VM
data class NoteUseCases(
    val getNotes: UseCaseGetNotes,
    val addNote: UseCaseAddNote,
    val deleteNote: UseCaseDeleteNote
) {
}