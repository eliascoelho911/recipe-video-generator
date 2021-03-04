package com.github.eliascoelho911.recipevideogenerator.recipe.webscraping

import com.github.eliascoelho911.RECIPE
import com.github.eliascoelho911.URL
import org.junit.Assert.assertEquals
import org.junit.Test

class RecipeNameWSTest {
    @Test
    fun recipeNameMustBeFound() {
        val recipeNameFinded = RecipeNameWS(URL).find()
        assertEquals(RECIPE.name, recipeNameFinded)
    }
}