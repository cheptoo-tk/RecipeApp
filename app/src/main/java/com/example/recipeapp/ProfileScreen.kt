package com.example.recipeapp

import android.icu.text.CaseMap.Title
import androidx.annotation.Dimension
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringArrayResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.recipeapp.data.Recipe

@Composable
fun ProfileScreen(recipe: Recipe) {
    val scrollState = rememberScrollState()

    Column(modifier = Modifier.fillMaxSize()) {
        BoxWithConstraints {
            Surface {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .verticalScroll(scrollState)
                ) {
                    ProfileHeader(recipe = recipe, containerHeight = this@BoxWithConstraints.maxHeight)
                    ProfileContent(recipe = recipe, containerHeight = this@BoxWithConstraints.maxHeight)
                }
            }
        }
    }
}

@Composable
private fun ProfileHeader(
    recipe: Recipe,
    containerHeight: Dp
) {
    Image(
        modifier = Modifier
            .heightIn(max = containerHeight / 2)
            .fillMaxWidth(),
        painter = painterResource(id = recipe.recipeImageId),
        contentScale = ContentScale.Crop,
        contentDescription = null
    )
}

@Composable
private fun ProfileContent(recipe: Recipe, containerHeight: Dp) {
    Column {
        Title(recipe = recipe)
        ProfileProperty(label = stringResource(id = R.string.type), value = recipe.type)
        ProfileProperty(label = stringResource(id = R.string.serving), value = recipe.serving)
        ProfileProperty(label = stringResource(id = R.string.difficultyLevel), value = recipe.difficultyLevel)
        ProfileProperty(label = stringResource(id = R.string.ingredients), value = recipe.ingredients)
        ProfileProperty(label = stringResource(id = R.string.preparationSteps), value = recipe.preparationSteps)

        Spacer(modifier = Modifier.height((containerHeight - 320.dp).coerceAtLeast(0.dp)))

    }
}

@Composable
private fun Title(recipe: Recipe) {
    Column(modifier = Modifier.padding(16.dp)) {
        Text(
            text = recipe.title,
            style = MaterialTheme.typography.h6,
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold
        )

    }
}

@Composable
private fun ProfileProperty(label: String, value: String) {
    Column(modifier = Modifier.padding(start = 16.dp, end = 16.dp, bottom = 16.dp)) {
        Divider(modifier = Modifier.padding(bottom = 4.dp))
        Text(text = label,
            //modifier = Modifier.height(24.dp),
            style = MaterialTheme.typography.caption,
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = value,
            //modifier = Modifier.height(24.dp),
            style = MaterialTheme.typography.body1,
            overflow = TextOverflow.Visible,
            fontSize = 16.sp,
            fontWeight = FontWeight.Medium
        )
    }
}