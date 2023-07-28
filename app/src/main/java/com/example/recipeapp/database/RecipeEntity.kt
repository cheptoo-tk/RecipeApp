package com.example.recipeapp.database

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "recipestable")
data class RecipeEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long,
    val title: String,
    val type: String,
    val serving: String,
    val difficultyLevel: String,
    val ingredients: String,
    val preparationSteps: String,
    val recipeImageId: Int = 0
) : Serializable