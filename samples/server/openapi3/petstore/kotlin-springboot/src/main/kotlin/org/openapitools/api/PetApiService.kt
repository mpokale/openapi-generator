package org.openapitools.api

import org.openapitools.model.ModelApiResponse
import org.openapitools.model.Pet

interface PetApiService {

    fun addPet(pet: Pet): Unit

    fun deletePet(petId: kotlin.Long,apiKey: kotlin.String): Unit

    fun findPetsByStatus(status: kotlin.Array<kotlin.String>): List<Pet>

    fun findPetsByTags(tags: kotlin.Array<kotlin.String>): List<Pet>

    fun getPetById(petId: kotlin.Long): Pet

    fun updatePet(pet: Pet): Unit

    fun updatePetWithForm(petId: kotlin.Long,name: kotlin.String,status: kotlin.String): Unit

    fun uploadFile(petId: kotlin.Long,additionalMetadata: kotlin.String,file: org.springframework.web.multipart.MultipartFile): ModelApiResponse
}
