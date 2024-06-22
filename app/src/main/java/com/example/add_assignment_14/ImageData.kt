package com.example.add_assignment_14

// ImageData.kt
data class ImageData(
    val id: String,
    val urls: Urls,
    val description: String?
)

data class Urls(
    val regular: String
)

