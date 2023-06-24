package com.example.recipeapp

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import com.example.recipeapp.data.Recipe
import com.example.recipeapp.ui.theme.RecipeAppTheme

class ProfileActivity : ComponentActivity() {

    private val recipe: Recipe by lazy {
        intent?.getSerializableExtra(Recipe_ID) as Recipe
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { 
            RecipeAppTheme {
                ProfileScreen(recipe = recipe)
            }
        }
    }

    companion object {
        private const val Recipe_ID = "recipe_id"
        fun newIntent(context: Context, recipe: Recipe) =
            Intent(context, ProfileActivity::class.java).apply {
                putExtra(Recipe_ID, recipe)
            }
    }
}