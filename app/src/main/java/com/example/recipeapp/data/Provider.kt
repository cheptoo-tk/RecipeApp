package com.example.recipeapp.data

import android.content.Context
import androidx.room.Room
import com.example.recipeapp.database.RecipeDatabase

object Provider {
    private var recipeDatabase: RecipeDatabase? = null

    fun getDatabase(context: Context): RecipeDatabase {
        if (recipeDatabase == null) {
            recipeDatabase = Room.databaseBuilder(
                context.applicationContext,
                RecipeDatabase::class.java,
                "recipes.db"
            ).build()
        }
        return recipeDatabase as RecipeDatabase
    }
}