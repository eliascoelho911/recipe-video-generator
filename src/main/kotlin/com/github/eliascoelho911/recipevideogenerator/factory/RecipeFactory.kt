package com.github.eliascoelho911.recipevideogenerator.factory

import com.github.eliascoelho911.recipevideogenerator.model.Recipe
import com.github.eliascoelho911.recipevideogenerator.webscraping.*

object RecipeFactory {
    fun create(url: String): Recipe {
        val author = AuthorScraping(url).find()
        val recipeName = RecipeNameScraping(url).find()
        val preparationTime = PreparationTimeScraping(url).find()
        val income = IncomeScraping(url).find()
        val ingredients = IngredientsScraping(url).find()
        val preparationSteps = PreparationStepsScraping(url).find()
        return Recipe(url, recipeName, preparationTime, income, author, ingredients, preparationSteps)
    }
}
