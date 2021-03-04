package com.github.eliascoelho911.recipevideogenerator.webscraping

import com.github.eliascoelho911.RECIPE
import com.github.eliascoelho911.URL
import org.junit.Assert.*
import org.junit.Test

class PreparationStepsScrapingTest {
    @Test
    fun preparationStepsMustBeFound() {
        val preparationStepsFinded = PreparationStepsScraping(URL).find()
        assertEquals(RECIPE.preparationSteps, preparationStepsFinded)
    }
}