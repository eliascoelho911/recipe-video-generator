package com.github.eliascoelho911.recipevideogenerator.recipe.webscraping

import com.github.eliascoelho911.RECIPE
import com.github.eliascoelho911.URL
import org.junit.Assert.assertEquals
import org.junit.Test

class PreparationStepsWSTest {
    @Test
    fun preparationStepsMustBeFound() {
        val preparationStepsFinded = PreparationStepsWS(URL).find()
        assertEquals(RECIPE.preparationSteps, preparationStepsFinded)
    }
}