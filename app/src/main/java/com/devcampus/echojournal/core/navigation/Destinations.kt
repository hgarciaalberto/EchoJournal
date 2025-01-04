package com.devcampus.echojournal.core.navigation

import kotlinx.serialization.Serializable

sealed interface Destinations {
    @Serializable
    data object EntryList : Destinations

    @Serializable
    data object CreateRecord : Destinations
}