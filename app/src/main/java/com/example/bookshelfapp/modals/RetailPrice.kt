package com.example.bookshelfapp.modals


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class RetailPrice(
    @SerialName("amountInMicros")
    val amountInMicros: Long,
    @SerialName("currencyCode")
    val currencyCode: String
)