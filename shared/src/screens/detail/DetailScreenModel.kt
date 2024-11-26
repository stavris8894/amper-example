package com.example.amper.screens.detail

import cafe.adriel.voyager.core.model.ScreenModel
import com.example.amper.data.MuseumObject
import com.example.amper.data.MuseumRepository
import kotlinx.coroutines.flow.Flow

class DetailScreenModel(private val museumRepository: MuseumRepository) : ScreenModel {
    fun getObject(objectId: Int): Flow<MuseumObject?> =
        museumRepository.getObjectById(objectId)
}
