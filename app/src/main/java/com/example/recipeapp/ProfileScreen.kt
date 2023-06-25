package com.example.recipeapp

import android.icu.text.CaseMap.Title
import android.text.TextPaint
import androidx.annotation.Dimension
import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringArrayResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextLayoutResult
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.*
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
            .heightIn(max = containerHeight / 4)
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
    }
}

@Composable
private fun Title(recipe: Recipe) {
    Column(modifier = Modifier.padding(12.dp)) {
        Text(
            text = recipe.title,
            style = MaterialTheme.typography.h6,
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold
        )
    }
}

/*
@Composable
private fun ProfileProperty(label: String, value: String) {
    Card(
        shape = RoundedCornerShape(16.dp), modifier = Modifier
            .padding(12.dp)
            .fillMaxWidth(),
        elevation = 4.dp
    ) {
        Column(modifier = Modifier.padding(12.dp)) {
            //Divider(modifier = Modifier.padding(bottom = 4.dp))
            Text(
                text = label,
                //modifier = Modifier.height(24.dp),
                style = MaterialTheme.typography.caption,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
            //Divider(modifier = Modifier.padding(bottom = 4.dp))
            Divider(
                color = Color(0xFF202124), // Customize the color of the divider
                thickness = 2.dp, // Customize the thickness of the divider
                modifier = Modifier.padding(vertical = 8.dp) // Add padding to the divider
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
}*/

@Composable
private fun ProfileProperty(label: String, value: String) {
    Card(
        shape = RoundedCornerShape(16.dp),
        modifier = Modifier
            .padding(12.dp)
            .fillMaxWidth(),
        elevation = 4.dp
    ) {
        Column(modifier = Modifier.padding(12.dp)) {
            Text(
                text = label,
                style = MaterialTheme.typography.caption,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )

            Divider(
                color = Color(0xFF202124),
                thickness = 2.dp,
                modifier = Modifier.padding(vertical = 8.dp)
            )

            ExpandingText(text = value)
        }
    }
}

private const val MINIMIZED_MAX_LINES = 3

@Composable
private fun ExpandingText(modifier: Modifier = Modifier, text: String) {
    var isExpanded by remember { mutableStateOf(false) }
    val textLayoutResultState = remember { mutableStateOf<TextLayoutResult?>(null) }
    var isClickable by remember { mutableStateOf(false) }
    var finalText by remember { mutableStateOf(text) }

    val textLayoutResult = textLayoutResultState.value
    LaunchedEffect(textLayoutResult) {
        if (textLayoutResult == null) return@LaunchedEffect

        when {
            isExpanded -> {
                finalText = "$text Show Less"
            }
            !isExpanded && textLayoutResult.hasVisualOverflow -> {
                val lastCharIndex = textLayoutResult.getLineEnd(MINIMIZED_MAX_LINES - 1)
                val showMoreString = "... Show More"
                val adjustedText = text
                    .substring(startIndex = 0, endIndex = lastCharIndex)
                    .dropLast(showMoreString.length)
                    .dropLastWhile { it == ' ' || it == '.' }

                finalText = "$adjustedText$showMoreString"

                isClickable = true
            }
        }
    }

    Text(
        text = finalText,
        maxLines = if (isExpanded) Int.MAX_VALUE else MINIMIZED_MAX_LINES,
        onTextLayout = { textLayoutResultState.value = it },
        modifier = modifier.clickable(enabled = isClickable) { isExpanded = !isExpanded }.animateContentSize()
    )
}
