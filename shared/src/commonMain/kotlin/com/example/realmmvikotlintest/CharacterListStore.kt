package com.example.realmmvikotlintest

import com.example.realmmvikotlintest.CharacterListStore.Intent
import com.example.realmmvikotlintest.CharacterListStore.State
import com.arkivanov.mvikotlin.core.store.Store

interface CharacterListStore : Store<Intent, State, Nothing> {
    sealed class Intent {
        object Loaded : Intent()
    }

    data class State(
        val characters: List<Character> = emptyList()
    )
}

data class Character(val id: Long)