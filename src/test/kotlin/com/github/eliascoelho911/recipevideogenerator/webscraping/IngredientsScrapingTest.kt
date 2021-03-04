package com.github.eliascoelho911.recipevideogenerator.webscraping

import com.github.eliascoelho911.RECIPE
import com.github.eliascoelho911.URL
import org.junit.Assert.*
import org.junit.Test

class IngredientsScrapingTest {
    @Test
    fun ingredientsMustBeFound() {
        val ingredientsFinded = IngredientsScraping(URL).find()
        assertEquals(RECIPE.ingredients, ingredientsFinded)
    }
}