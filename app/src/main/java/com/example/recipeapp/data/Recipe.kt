package com.example.recipeapp.data

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "recipes")
data class Recipe(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val title: String,
    val type: String,
    val serving: String,
    val difficultyLevel: String,
    val ingredients: String,
    val preparationSteps: String,
    val recipeImageId: Int = 0
) : Serializable
