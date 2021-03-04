package com.github.eliascoelho911.recipevideogenerator.recipe.webscraping

import com.github.eliascoelho911.RECIPE
import com.github.eliascoelho911.URL
import org.junit.Assert.assertEquals
import org.junit.Test

class IngredientsWSTest {
    @Test
    fun ingredientsMustBeFound() {
        val ingredientsFinded = IngredientsWS(URL).find()
        assertEquals(RECIPE.ingredients, ingredientsFinded)
    }
}