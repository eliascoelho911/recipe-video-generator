package com.github.eliascoelho911.recipevideogenerator.webscraping

import com.github.eliascoelho911.RECIPE
import com.github.eliascoelho911.URL
import org.junit.Assert.*
import org.junit.Test

class RecipeNameScrapingTest {
    @Test
    fun recipeNameMustBeFound() {
        val recipeNameFinded = RecipeNameScraping(URL).find()
        assertEquals(RECIPE.name, recipeNameFinded)
    }
}