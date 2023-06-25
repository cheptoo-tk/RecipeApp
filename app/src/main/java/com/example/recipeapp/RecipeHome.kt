package com.example.recipeapp

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.dp
import com.example.recipeapp.data.DataProvider
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import com.example.recipeapp.data.Recipe

@Composable
fun RecipeHomeContent(navigateToProfile: (Recipe) -> Unit) {
    val recipes = remember { DataProvider.recipeList}
    LazyColumn(
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
    ) {
        item {
            Text(
                text = "Recipes",
                style = typography.h4,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(12.dp)
            )
        }
        items(
            items = recipes,
            itemContent = {
                RecipeListItem(recipe = it, navigateToProfile)
            }
        )
    }
}