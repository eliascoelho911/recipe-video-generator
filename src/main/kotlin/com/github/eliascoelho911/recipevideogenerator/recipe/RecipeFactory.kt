package com.github.eliascoelho911.recipevideogenerator.recipe

import com.github.eliascoelho911.recipevideogenerator.recipe.webscraping.*

object RecipeFactory {
    fun create(url: String): Recipe {
        val author = AuthorWS(url).find()
        val recipeName = RecipeNameWS(url).find()
        val preparationTime = PreparationTimeWS(url).find()
        val income = IncomeWS(url).find()
        val ingredients = IngredientsWS(url).find()
        val preparationSteps = PreparationStepsWS(url).find()
        return Recipe(url, recipeName, preparationTime, income, author, ingredients, preparationSteps)
    }
}
