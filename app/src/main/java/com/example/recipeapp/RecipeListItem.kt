package com.example.recipeapp

import android.text.Layout.Alignment
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.recipeapp.data.Recipe
import java.time.format.TextStyle

@Composable
fun RecipeListItem(recipe: Recipe, navigateToProfile: (Recipe) -> Unit){
    Card(
        modifier = Modifier
            .padding(horizontal = 8.dp, vertical = 8.dp)
            .fillMaxWidth(),
        elevation = 2.dp,
        shape = RoundedCornerShape(corner = CornerSize(16.dp))
    ) {
        Row(
            Modifier.clickable { navigateToProfile(recipe) }
        ) {
            RecipeImage(recipe = recipe)
            Column(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth()
                    .align(androidx.compose.ui.Alignment.CenterVertically)
            ) {
                Text(text = recipe.title, style = typography.h5, fontWeight = FontWeight.Bold)
                Text(text = "VIEW DETAIL", style = typography.caption)
            }
        }
    }
}

@Composable
private fun RecipeImage(recipe: Recipe){
    Image(
        painter = painterResource(id = recipe.recipeImageId),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .padding(8.dp)
            .size(84.dp)
            .clip(RoundedCornerShape(corner = CornerSize(16.dp)))
    )
}