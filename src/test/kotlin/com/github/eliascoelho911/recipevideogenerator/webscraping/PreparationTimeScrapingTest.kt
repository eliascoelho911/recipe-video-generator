package com.github.eliascoelho911.recipevideogenerator.webscraping

import com.github.eliascoelho911.RECIPE
import com.github.eliascoelho911.URL
import org.junit.Assert.*
import org.junit.Test

class PreparationTimeScrapingTest {
    @Test
    fun preparationTimeMustBeFound() {
        val preparationTimeFinded = PreparationTimeScraping(URL).find()
        assertEquals(RECIPE.preparationTime, preparationTimeFinded)
    }
}