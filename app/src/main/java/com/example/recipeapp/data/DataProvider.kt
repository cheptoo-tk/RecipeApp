package com.example.recipeapp.data

import com.example.recipeapp.R

object DataProvider {
    val recipe =
        Recipe(
            id = 1,
            title = "East African Pilau",
            type = "Lunch",
            serving = "6 People",
            difficultyLevel = "Intermediate",
            ingredients = "1 teaspoon cloves.\n" +
                    "2 tablespoon cumin seeds.\n" +
                    "1/2 tablespoon black peppercorn seeds.\n" +
                    "12 pods Cardamon.\n" +
                    "1 stick cinnamon.\n" +
                    "2 cups basmati rice.\n" +
                    "5 potatoes medium size [peeled and cut into quarters]\n" +
                    "¼ cup vegetable oil\n" +
                    "2 Red onions medium size [thinly sliced]\n" +
                    "4 cloves garlic minced\n" +
                    "2 tablespoons ginger minced\n" +
                    "1 serrano chile finely chopped\n" +
                    "1 tablespoon pilau masala\n" +
                    "2 beef stock cubes\n" +
                    "¼ cup fresh cilantro roughly chopped\n" +
                    "1 lb beef sirloin cubed\n" +
                    "3 Roma tomatoes diced\n" +
                    "4 cups water\n" +
                    "2 Bay leaves\n" +
                    "Salt to taste",
            preparationSteps = "Heat a stockpot on medium-high heat. Add oil and heat until hot but not smoking.\n" +
                    "Add the sliced onions and fry for 10-15 minutes or till the onions starts to turn golden brown (be careful not to burn it).\n" +
                    "Add the garlic, ginger, serrano pepper, Cook for 1-2 minutes, until fragrant.\n" +
                    "Add the cubed beef, pilau masala, beef stock cubes, bay leaves, cilantro, and salt to taste. Cook until the meat browns and caramelizes stirring occasionally about 8 to 10 minutes.\n" +
                    "Add the diced tomatoes and cook for 4-5 minutes, until the tomatoes have released their liquid.\n" +
                    "Stir in the potatoes and the water. Bring to a boil and cook for 10 minutes.\n" +
                    "Stir in the rice, and cover tightly with a foil paper (to keep the steam in) if necessary. Reduce the heat to low and cook for 20 minutes, until the rice is cooked and the liquid is absorbed.\n" +
                    "Once the rice is dry, remove the foil paper and fluff with a fork to ensure the seasonings are well distributed all around the rice.\n" +
                    "Serve hot with fresh Kachumbari – salsa. Enjoy!",
            recipeImageId = R.drawable.f1
        )

    val recipeList = listOf(
        recipe,
        Recipe(
            id = 2,
            title = "Kachumbari",
            type = "Lunch",
            serving = "2 People",
            difficultyLevel = "Beginner",
            ingredients = "1 Red onion (medium size)\n" +
                    "3 Tomatoes (large size)\n" +
                    "1 Cucumber (large size)\n" +
                    "1 Lemon\n" +
                    "1 Jalapeno pepper seeds removed (or any green chili - optional)\n" +
                    "Fresh cilantro or coriander leaves\n" +
                    "Salt and pepper to taste",
            preparationSteps = "1.Dice the onions, tomatoes, cucumber, and green chili (if using).\n" +
                    "2.Add all the veggies into a bowl, add the cilantro, squeeze in the lemon juice, and season with salt and black pepper.\n" +
                    "3.Serve with rice or any other meal of your choice.",
            recipeImageId = R.drawable.f2
        ),
        Recipe(
            id = 3,
            title = "Saffron Rice",
            type = "Lunch",
            serving = "4 People",
            difficultyLevel = "Intermediate",
            ingredients = "A generous pinch of saffron threads about 1/4 teaspoon\n" +
                    "1/4 cup hot water\n" +
                    "2 cups long-grain white rice preferably basmati or jasmine\n" +
                    "4 cups low-sodium chicken or vegetable broth\n" +
                    "2 tablespoons unsalted butter or olive oil\n" +
                    "1 small onion finely chopped\n" +
                    "2 cloves garlic minced\n" +
                    "salt and black pepper to taste\n" +
                    "1/4 cup chopped fresh parsley or cilantro for garnish\n" +
                    "Optional add-ins: toasted slivered almonds pine nuts, or raisins",
            preparationSteps = "1. Infuse saffron: In a small bowl or cup, add the saffron threads to 1/4 cup of hot water. Let it sit for 10-15 minutes, allowing the saffron to infuse the water and releasing its color and flavor.\n" +
                    "2.Rinse and drain the rice: Place the rice in a fine-mesh sieve and rinse under cold running water until the water runs clear. This helps to remove excess starch and prevents the rice from becoming sticky. Drain well and set aside.\n" +
                    "3.Sauté the onions and garlic: In a large skillet or saucepan with a tight-fitting lid, heat the butter or olive oil over medium heat. Add the chopped onion and cook, stirring occasionally, for 5-7 minutes, or until soft and translucent. Add the minced garlic and cook for another 1-2 minutes, until fragrant.\n" +
                    "4.Toast the rice: Add the drained rice to the skillet with the onions and garlic. Cook, stirring constantly, for 2-3 minutes, until the rice is lightly toasted and coated with the butter or oil.\n" +
                    "5.Add the broth, saffron water, and seasonings: Pour the chicken or vegetable broth and the saffron-infused water (including the saffron threads) into the skillet. Stir to combine. Add the salt and black pepper, and stir well.\n" +
                    "6.Cook the rice: Bring the mixture to a boil, then reduce the heat to low, cover with the lid, and simmer for 18-20 minutes, or until the rice is tender and the liquid is absorbed.\n" +
                    "7.Fluff and garnish the rice: When the rice is cooked, remove the skillet from the heat and let it stand, covered, for 5 minutes. Then, using a fork, gently fluff the rice to separate the grains. Sprinkle the chopped parsley or cilantro over the saffron rice. If desired, add toasted slivered almonds, pine nuts, or raisins for additional texture and flavor.\n" +
                    "8.Serve: Transfer the saffron rice to a serving platter or individual plates and serve immediately.",
            recipeImageId = R.drawable.f3
        ),
    )
}