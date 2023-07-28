package com.example.recipeapp.database

import androidx.room.*

@Dao
interface RecipeDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertRecipe(recipe: RecipeEntity)

    @Query("SELECT * FROM recipestable")
    fun getRecipes(): List<RecipeEntity>

    @Query("DELETE FROM recipestable")
    fun deleteRecipes()
}