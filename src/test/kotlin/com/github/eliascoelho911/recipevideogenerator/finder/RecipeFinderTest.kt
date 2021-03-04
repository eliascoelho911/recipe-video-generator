package com.github.eliascoelho911.recipevideogenerator.finder

import com.github.eliascoelho911.PATH
import com.github.eliascoelho911.RECIPE
import org.junit.Test
import kotlin.test.assertEquals

class RecipeFinderTest {
    @Test
    fun mustCreateTheRecipeWithTheCorrectInformation() {
        val recipeFound = RecipeFinder().find(PATH)
        assertEquals(RECIPE, recipeFound)
    }
}