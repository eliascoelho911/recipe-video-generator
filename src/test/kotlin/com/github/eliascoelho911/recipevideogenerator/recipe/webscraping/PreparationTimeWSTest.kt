package com.github.eliascoelho911.recipevideogenerator.recipe.webscraping

import com.github.eliascoelho911.RECIPE
import com.github.eliascoelho911.URL
import org.junit.Assert.assertEquals
import org.junit.Test

class PreparationTimeWSTest {
    @Test
    fun preparationTimeMustBeFound() {
        val preparationTimeFinded = PreparationTimeWS(URL).find()
        assertEquals(RECIPE.preparationTime, preparationTimeFinded)
    }
}