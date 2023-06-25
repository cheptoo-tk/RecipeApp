package com.example.recipeapp.data

import com.example.recipeapp.R

object DataProvider {
    val recipe =
        Recipe(
            id = 1,
            title = "East African Pilau",
            type = "Lunch/Dinner",
            serving = "6 People",
            difficultyLevel = "Intermediate",
            ingredients = "1 Teaspoon cloves\n" +
                    "2 Tablespoon cumin seeds\n" +
                    "½ Tablespoon black peppercorn seeds\n" +
                    "12 Pods Cardamon\n" +
                    "1 Stick Cinnamon\n" +
                    "2 Cups Basmati rice\n" +
                    "5 Potatoes (medium size [peeled and cut into quarters])\n" +
                    "¼ Cup vegetable oil\n" +
                    "2 Red onions (medium size [thinly sliced])\n" +
                    "4 Cloves garlic (minced)\n" +
                    "2 Tablespoons ginger (minced)\n" +
                    "1 Serrano chili (finely chopped)\n" +
                    "1 Tablespoon pilau masala\n" +
                    "2 Beef stock cubes\n" +
                    "¼ Cup fresh cilantro (roughly chopped)\n" +
                    "1 lb Beef sirloin (cubed)\n" +
                    "3 Roma tomatoes (diced)\n" +
                    "4 Cups water\n" +
                    "2 Bay leaves\n" +
                    "Salt to taste",
            preparationSteps = "1.\tPlace the cumin, black peppers, cinnamon, cardamom, and cloves in a dry pan.\n" +
                    "2.\tRoast over low heat until warmed through and fragrant and blend until smooth.\n" +
                    "3.\tYou need just 1 to 1½ tablespoons for this recipe (depending on how fragrant you want the rice to be). Feel free to store the leftover spice powder in an airtight container for up to 3 months or refrigerate for up to 6 months.\n" +
                    "4.\tHeat a stockpot on medium-high heat. Add oil and heat until hot but not smoking.\n" +
                    "5.\tAdd the sliced onions and fry for 10-15 minutes or till the onions starts to turn golden brown (be careful not to burn it).\n" +
                    "6.\tAdd the garlic, ginger, serrano pepper, Cook for 1-2 minutes, until fragrant.\n" +
                    "7.\tAdd the cubed beef, pilau masala, beef stock cubes, bay leaves, cilantro, and salt to taste. Cook until the meat browns and caramelizes stirring occasionally about 8 to 10 minutes.\n" +
                    "8.\tAdd the diced tomatoes and cook for 4-5 minutes, until the tomatoes have released their liquid.\n" +
                    "9.\tStir in the potatoes and the water. Bring to a boil and cook for 10 minutes.\n" +
                    "10.\tStir in the rice and cover tightly with a foil paper (to keep the steam in) if necessary. Reduce the heat to low and cook for 20 minutes, until the rice is cooked, and the liquid is absorbed.\n" +
                    "11.\tOnce the rice is dry, remove the foil paper and fluff with a fork to ensure the seasonings are well distributed all around the rice.\n" +
                    "12.\tServe hot with fresh Kachumbari – salsa.",
            recipeImageId = R.drawable.f1
        )

    val recipeList = listOf(
        recipe,
        Recipe(
            id = 2,
            title = "Kachumbari",
            type = "Lunch/Dinner",
            serving = "2 People",
            difficultyLevel = "Beginner",
            ingredients = "1 Red onion (medium size)\n" +
                    "3 Tomatoes (large size)\n" +
                    "1 Cucumber (large size)\n" +
                    "1 Lemon\n" +
                    "1 Jalapeno pepper (seeds removed)\n" +
                    "Fresh cilantro (or coriander leaves)\n" +
                    "Salt and pepper to taste",
            preparationSteps = "1.\tDice the onions, tomatoes, cucumber, and green chili (if using).\n" +
                    "2.\tAdd all the veggies into a bowl, add the cilantro, squeeze in the lemon juice, and season with salt and black pepper.\n" +
                    "3.\tServe with rice or any other meal of your choice.\n",
            recipeImageId = R.drawable.f2
        ),
        Recipe(
            id = 3,
            title = "Saffron Rice",
            type = "Lunch/Dinner",
            serving = "4 People",
            difficultyLevel = "Intermediate",
            ingredients = "A generous pinch of saffron threads (about ¼ teaspoon)\n" +
                    "¼ Cup hot water\n" +
                    "2 Cups long-grain white rice (preferably basmati or jasmine)\n" +
                    "4 Cups low-sodium chicken\n" +
                    "2 Tablespoons unsalted butter (or olive oil)\n" +
                    "1 Small onion (finely chopped)\n" +
                    "2 Cloves garlic (minced)\n" +
                    "Salt and black pepper\n" +
                    "¼ Cup chopped fresh parsley (or cilantro for garnish)",
            preparationSteps = "1.\tInfuse saffron: In a small bowl or cup, add the saffron threads to ¼ cup of hot water. Let it sit for 10-15 minutes, allowing the saffron to infuse the water and releasing its colour and flavour.\n" +
                    "2.\tRinse and drain the rice: Place the rice in a fine-mesh sieve and rinse under cold running water until the water runs clear. This helps to remove excess starch and prevents the rice from becoming sticky. Drain well and set aside.\n" +
                    "3.\tSauté the onions and garlic: In a large skillet or saucepan with a tight-fitting lid, heat the butter or olive oil over medium heat. Add the chopped onion and cook, stirring occasionally, for 5-7 minutes, or until soft and translucent. Add the minced garlic and cook for another 1-2 minutes, until fragrant.\n" +
                    "4.\tToast the rice: Add the drained rice to the skillet with the onions and garlic. Cook, stirring constantly, for 2-3 minutes, until the rice is lightly toasted and coated with the butter or oil.\n" +
                    "5.\tAdd the broth, saffron water, and seasonings: Pour the chicken or vegetable broth and the saffron-infused water (including the saffron threads) into the skillet. Stir to combine. Add the salt and black pepper and stir well.\n" +
                    "6.\tCook the rice: Bring the mixture to a boil, then reduce the heat to low, cover with the lid, and simmer for 18-20 minutes, or until the rice is tender and the liquid is absorbed.\n" +
                    "7.\tFluff and garnish the rice: When the rice is cooked, remove the skillet from the heat and let it stand, covered, for 5 minutes. Then, using a fork, gently fluff the rice to separate the grains. Sprinkle the chopped parsley or cilantro over the saffron rice. If desired, add toasted slivered almonds, pine nuts, or raisins for additional texture and flavour.\n" +
                    "8.\tServe: Transfer the saffron rice to a serving platter or individual plates and serve immediately. Enjoy!",
            recipeImageId = R.drawable.f3
        ),
        Recipe(
            id = 4,
            title = "Fufu",
            type = "Lunch/Dinner",
            serving = "4 People",
            difficultyLevel = "Beginner",
            ingredients = "1 Yuca root (cassava)\n" +
                    "1 Plantain (Green)\n" +
                    "¼ Cup water",
            preparationSteps = "1.\tPeel the cassava, slice the tuber half lengthwise, remove the inner wooden core, and dice the potatoes into small cubes.\n" +
                    "2.\tPeel the plantain and cut it into small cubes.\n" +
                    "3.\tAdd everything inside the blender and blend till a smooth batter is formed.\n" +
                    "4.\tPeel the cassava, slice the tuber half lengthwise, remove the inner wooden core, and dice the potatoes into small cubes.\n" +
                    "5.\tPeel the plantain and cut it into small cubes.\n" +
                    "6.\tAdd everything inside the blender and blend till a smooth batter is formed.",
            recipeImageId = R.drawable.f4
        ),
        Recipe(
            id = 5,
            title = "Buttermilk Waffles",
            type = "Breakfast",
            serving = "6 People",
            difficultyLevel = "Beginner",
            ingredients = "2 Cups all-purpose flour\n" +
                    "2 Tablespoons granulated sugar\n" +
                    "2 Teaspoons baking powder\n" +
                    "1 Teaspoon baking soda\n" +
                    "½ Teaspoon salt\n" +
                    "2 Cups buttermilk\n" +
                    "½ Cup unsalted butter (melted and cooled)\n" +
                    "2 Large eggs\n" +
                    "2 Teaspoons pure vanilla extract\n" +
                    "Non-stick cooking spray (for the waffle iron)" +
                    "Toppings of your choice (e.g., maple syrup, whipped cream, fresh fruit, or powdered sugar)\n",
            preparationSteps = "1.\tIn a large mixing bowl, whisk together the dry ingredients: flour, sugar, baking powder, baking soda, and salt. Set aside.\n" +
                    "2.\tIn a separate medium-sized mixing bowl, whisk together the wet ingredients: buttermilk, melted butter, eggs, and vanilla extract.\n" +
                    "3.\tPour the wet ingredients into the bowl with the dry ingredients, and gently mix until just combined. Be careful not to overmix the batter; it’s okay if there are a few lumps.\n" +
                    "4.\tPreheat your waffle iron according to the manufacturer’s instructions. Once heated, lightly spray the waffle iron with non-stick cooking spray.\n" +
                    "5.\tPour a portion of the waffle batter onto the center of the waffle iron (the amount will depend on the size of your waffle iron; usually around ½ to 3/4 cup). Close the lid and cook the waffle until golden brown and crisp, usually between 3-5 minutes, depending on your waffle iron’s settings.\n" +
                    "6.\tCarefully remove the cooked waffle from the iron using a fork or tongs and place it on a wire rack to cool slightly. This will help to maintain the waffle’s crispiness. Repeat the cooking process with the remaining batter.\n" +
                    "7.\tServe the waffles warm with your choice of toppings, such as maple syrup, whipped cream, fresh fruit, or a dusting of powdered sugar.",
            recipeImageId = R.drawable.f5
        ),
        Recipe(
            id = 6,
            title = "Spicy Shrimp Pasta",
            type = "Dinner",
            serving = "6 People",
            difficultyLevel = "Advanced",
            ingredients = "12 oz Rotini pasta (most pasta type will work)\n" +
                    "1 Red bell pepper (halved and seeded)\n" +
                    "4 Large Roma tomatoes (halved)\n" +
                    "1 Large red onion (cut into thick slices)\n" +
                    "2 Tablespoons olive oil\n" +
                    "4 Garlic cloves (minced)\n" +
                    "Grated ginger\n" +
                    "½ cup chicken broth\n" +
                    "1 Teaspoon chicken bouillon\n" +
                    "2 Tsp oregano\n" +
                    "1 Tsp chili flakes (or add to taste)\n" +
                    "A handful of parsley\n" +
                    "Salt and pepper to (taste)\n" +
                    "1 lb Shrimp (deveined and cleaned)\n" +
                    "¼ Teaspoon paprika\n" +
                    "¼ Teaspoon garlic powder\n" +
                    "Salt and pepper to taste\n" +
                    "2 Tablespoons olive oil",
            preparationSteps = "1.\tPreheat your oven to 400°F (200°C).\n" +
                    "2.\tArrange bell peppers, tomatoes, and onion slices in a single layer on the prepared baking sheet. Drizzle with 2 tablespoons of olive oil and season with salt and freshly ground black pepper. Roast in the preheated oven for 20-25 minutes or until the vegetables are tender and slightly charred.\n" +
                    "3.\tWhile the veggies are roasting in the oven, bring a large pot of water to a boil. Add the pasta and salt and cook the pasta al dente according to package instructions; drain well and reserve 1 cup of pasta water.\n" +
                    "4.\tOnce the veggies are roasting. Put them in a heat-safe high-speed blender and blend until smooth. Set aside for later.\n" +
                    "5.\tIn a large skillet, heat 2 tablespoons of olive oil over medium heat. Season shrimp with garlic powder, paprika, salt, and pepper. Add the shrimp tom the skillet and cook for 2-3 minutes per side or until pink and cooked through. Remove the shrimp from the skillet and set aside.\n" +
                    "6.\tAdd the minced garlic and grated ginger in the same pan and deglaze the pan with chicken broth.\n" +
                    "7.\tStir in the roasted tomato sauce, bouillon powder, oregano, chili flakes, salt, and pepper. Add 1/4 cup pasta water add more if needed) and leave to simmer for about 2 to 3 minutes.\n" +
                    "8.\tAdd the cooked pasta and shrimp to the sauce, tossing to combine and ensure everything is well coated. Adjust seasoning if necessary and garnish with chopped parsley.\n" +
                    "9.\tServe immediately.",
            recipeImageId = R.drawable.f6
        ),
        Recipe(
            id = 7,
            title = "Classic Hamburger",
            type = "Breakfast/Lunch/Dinner",
            serving = "4 People",
            difficultyLevel = "Intermediate",
            ingredients = "1 lb ground beef (preferably 80% lean 20% fat)\n" +
                    "¼ Cup finely diced yellow onion\n" +
                    "¼ Cup breadcrumbs\n" +
                    "1 Large egg (lightly beaten)\n" +
                    "2 Cloves garlic (minced)\n" +
                    "1 Tablespoon Worcestershire sauce\n" +
                    "1 Tablespoon ketchup\n" +
                    "1 Teaspoon Dijon mustard\n" +
                    "½ Teaspoon each salt and freshly ground black pepper\n" +
                    "½ Teaspoon smoked paprika\n" +
                    "½ Teaspoon dried oregano",
            preparationSteps = "1.\tIn a large mixing bowl, combine the ground beef, diced onion, breadcrumbs, beaten egg, minced garlic, Worcestershire sauce, ketchup, Dijon mustard, salt, freshly ground black pepper, smoked paprika, and dried oregano. Mix gently with your hands or a fork until all ingredients are evenly distributed. Be careful not to overmix, as this can make the patties tough.\n" +
                    "2.\tDivide the mixture into four equal portions. Shape each portion into a round ball and then gently flatten it into a patty, approximately 1/2-inch thick and 4 inches in diameter. Press a shallow indentation in the center of each patty with your thumb to help it cook evenly and prevent it from puffing up in the middle.\n" +
                    "3.\tPreheat a grill or a grill pan over medium-high heat—lightly oil the grates or pan to prevent sticking.\n" +
                    "4.\tCook the hamburger patties for 4-5 minutes on one side until they develop a nice sear and grill marks. Flip the patties and cook for an additional 3-4 minutes on the other side for medium doneness or until they reach your desired level of doneness. The internal temperature should read 160°F (71°C) for medium.\n" +
                    "5.\tIf desired, add a slice of your favorite cheese on top of each patty during the last minute of cooking, and cover the grill or pan with a lid to melt the cheese.\n" +
                    "6.\tRemove the cooked patties from the grill or pan and let them rest for a few minutes to allow the juices to redistribute.\n" +
                    "7.\tAssemble your hamburgers by placing each patty on a bun and adding your favorite toppings, such as lettuce, tomato, onion, pickles, and condiments.\n" +
                    "8.\tServe immediately and enjoy your delicious and juicy homemade hamburger patties!\n" +
                    "9.\tMix the patties until just combined. Be careful not to over mix the patties, as this can make the patties tough.\n" +
                    "10.\tAfter flattening the patties, press a shallow indentation in the center of each patty with your thumb to help it cook evenly and prevent it from puffing up in the middle.\n" +
                    "11.\tThe patties are done when the internal temperature reads 160°F (71°C). for medium.\n" +
                    "12.\tPreheat the grill before adding the patties to create a nice sear and lock in the juices.\n" +
                    "13.\tAvoid pressing down on the patties with a spatula while they cook. This can squeeze out the juices and result in a drier patty.",
            recipeImageId = R.drawable.f7
        ),
        Recipe(
            id = 8,
            title = "Chicken Samosa",
            type = "Snack",
            serving = "15 Pieces",
            difficultyLevel = "Intermediate",
            ingredients = "2 Cups all-purpose flour\n" +
                    "4 Tablespoons oil\n" +
                    "6-8 Tablespoons water (or as needed)\n" +
                    "½ Teaspoon salt\n" +
                    "1 Tablespoon oil\n" +
                    "1 Small onion (finely diced)\n" +
                    "2 Sloves garlic (inced)\n" +
                    "1 Pound ground chicken\n" +
                    "2 Medium potatoes (peeled and diced)\n" +
                    "½ Cup green peas\n" +
                    "½ Teaspoon freshly grated ginger\n" +
                    "½ Teaspoon paprika\n" +
                    "½ Teaspoon thyme\n" +
                    "½ Teaspoon curry powder\n" +
                    "Salt to taste (or add to taste)\n" +
                    "½ Teaspoon black pepper (or add to taste)\n" +
                    "1 Scotch bonnet minced (or any chilies to taste)\n" +
                    "Parsley or coriander\n" +
                    "Oil enough for deep frying",
            preparationSteps = "1.\tCombine the flour, salt, and oil in a large bowl, and use your fingers to rub the oil into the flour until you get a crumbly texture.\n" +
                    "2.\tAdd in the water, about a tablespoon at a time, and mix until a smooth and firm dough is formed. Then knead for about 7 to 10 minutes or till it's smooth and elastic. Cover it up with plastic wrap and allow it to rest for about 30 minutes.\n" +
                    "3.\tIn a large skillet, heat the oil over medium-high heat. Add the onion and cook until the onion is translucent, about 3 minutes.\n" +
                    "4.\tAdd the minced garlic and cook until fragrant, about 30 seconds.\n" +
                    "5.\tAdd the ground chicken and cook, breaking it up with a wooden spoon, until it is browned. Add the diced potatoes, green peas, grated ginger, paprika, thyme, curry powder, salt, black pepper, and scotch bonnet. Stir and leave to cook until the potatoes are tender, and the meat is cooked through, about 10 minutes. (Add some water if needed)\n" +
                    "6.\tRemove the skillet from the heat and let the chicken cool.\n" +
                    "7.\tDivide the dough into 8 equal portions then roll each portion into a ball and flatten it into a disc.\n" +
                    "8.\tCut each disc in half to make two semi-circles. Take one semi-circle and fold it into a cone shape, sealing the edges with water.\n" +
                    "9.\tFill the cone with 1-2 tablespoons of the filling.\n" +
                    "10.\tSeal the open end of the cone by applying water to the edges and pressing them together.\n" +
                    "11.\tRepeat the process with the remaining dough and filling.\n" +
                    "12.\tHeat enough oil in a deep-frying pan on medium-high heat.\n" +
                    "13.\tOnce the oil is hot, (about 350F) add a few samosas at a time and fry until golden brown on both sides.\n" +
                    "14.\tRemove the samosas from the oil and drain on paper towels.\n" +
                    "15.\tServe with African hot sauce or any other dipping sauce of your choice.",
            recipeImageId = R.drawable.f8
        ),
        Recipe(
            id = 9,
            title = "Fluffy Pancakes",
            type = "Breakfast",
            serving = "4 People",
            difficultyLevel = "Intermediate",
            ingredients = "2 Cups all-purpose flour\n" +
                    "4 Teaspoon baking powder\n" +
                    "¼ Teaspoon baking soda\n" +
                    "¼ Cup sugar (or sweetener of choice)\n" +
                    "½ Teaspoon salt\n" +
                    "1 ¾ Cup milk\n" +
                    "1 Egg\n" +
                    "¼ Cup butter (melted and cooled a little, plus a little more for cooking)\n" +
                    "2 Teaspoon vanilla extract",
            preparationSteps = "1.\tWhisk together the flour, baking powder, baking soda, sugar, and salt into a large mixing bowl.\n" +
                    "2.\tMake a well at the center and add the milk, egg, melted butter, and vanilla extract. Whisk them together starting at the center, slowly incorporating the dry ingredients while mixing.\n" +
                    "3.\tIf the batter becomes too thick, add an extra milk a tablespoon at a time until it becomes a creamy consistency. Set the batter aside and let it rest for a few minutes.\n" +
                    "4.\tHeat a nonstick pan over medium-high heat and lightly grease it with a little bit of butter. Ladle ¼ cup of batter into the pan and spread it around to make a round shape with the use of the ladle.\n" +
                    "5.\tCook for 2 minutes or when the sides turn golden brown and the surface begins to form bubbles, flip with a spatula, and cook the other side until the bottom turns golden. Repeat with the rest of the batter.\n" +
                    "6.\tTransfer pancakes to a plate and serve with your favorite syrup or honey, chopped fruits, bacon, or any other breakfast item you want.",
            recipeImageId = R.drawable.f9
        ),
        Recipe(
            id = 10,
            title = "Fluffy Biscuits",
            type = "Snack",
            serving = "10 Biscuits",
            difficultyLevel = "Intermediate",
            ingredients = "2 Cups all-purpose flour\n" +
                    "1 Tsp granulated sugar\n" +
                    "1 Tablespoon baking powder\n" +
                    "¼ Teaspoon baking soda\n" +
                    "¾ Tsp salt\n" +
                    "½ Cup unsalted butter (8 tbsp, diced and cold)\n" +
                    "2 Tablespoons melted butter (for brushing)\n" +
                    "1 Cup buttermilk",
            preparationSteps = "1.\tPreheat oven to 425 degrees F. Place a sheet of parchment paper on a large baking sheet and set aside.\n" +
                    "2.\tIn a large mixing bowl, whisk together the flour, sugar, salt, baking powder, baking soda, and salt. Whisk until combined.\n" +
                    "3.\tAdd the cold cubed butter to the flour mixture. Using a pastry cutter, two knives, or your fingertips, work the butter into the flour mixture until it resembles coarse crumbs. This step is crucial for creating flaky layers in your biscuits.\n" +
                    "4.\tMake a well in the center of the flour mixture and pour in the cold buttermilk. Stir gently with a wooden spoon or spatula until the dough starts to come together. Be careful not to overmix, as this can lead to tough biscuits.\n" +
                    "5.\tTurn the dough out onto a lightly floured surface and Pat or roll the dough out to about ¾-inch thickness.\n" +
                    "6.\tUsing a round biscuit or cookie cutter (about 2 to 2.5 inches in diameter), cut out the biscuits by pressing straight down without twisting the cutter. This ensures that the biscuits rise evenly. Re-roll the scraps and continue cutting out biscuits until all the dough is used up. It should make between 8 to 10 biscuits.\n" +
                    "7.\tPlace the biscuits on the prepared baking sheet, spacing them about 1 inch apart. For softer biscuits with more tender edges, you can place them closer together so they're touching.\n" +
                    "8.\tBrush the tops of the biscuits with a little extra buttermilk. This will help them develop a beautiful golden-brown colour as they bake.\n" +
                    "9.\tBake the biscuits for 12-15 minutes, or until they're golden brown and have risen nicely. You can check for doneness by inserting a toothpick into the center of a biscuit; it should come out clean or with a few crumbs clinging to it.\n" +
                    "10.\tRemove the biscuits from the oven and immediately brush the tops with the melted butter. This adds extra flavour and keeps the tops soft.\n" +
                    "11.\tLet the biscuits cool on the baking sheet for a few minutes before transferring them to a wire rack to cool slightly. Serve warm with butter, honey, jam, or your favorite biscuit toppings.\n",
            recipeImageId = R.drawable.f10
        ),
    )
}