package com.example.recipeapp.data

import java.io.Serializable

data class Recipe(
    val id: Int,
    val title: String,
    val type: String,
    val serving: String,
    val difficultyLevel: String,
    val ingredients: String,
    val preparationSteps: String,
    val recipeImageId: Int = 0
) : Serializable
