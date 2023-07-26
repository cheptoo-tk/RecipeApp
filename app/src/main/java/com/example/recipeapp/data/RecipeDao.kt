package com.example.recipeapp.data

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface RecipeDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertRecipe(recipe: Recipe)

    @Update
    fun update(recipe: Recipe)

    @Delete
    fun deleteRecipe(recipe: Recipe)
}