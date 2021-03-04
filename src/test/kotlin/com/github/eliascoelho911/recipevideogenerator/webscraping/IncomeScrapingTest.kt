package com.github.eliascoelho911.recipevideogenerator.webscraping

import com.github.eliascoelho911.URL
import com.github.eliascoelho911.RECIPE
import org.junit.Assert.*
import org.junit.Test

class IncomeScrapingTest {
    @Test
    fun incomeMustBeFound() {
        val incomeFinded = IncomeScraping(URL).find()
        assertEquals(RECIPE.income, incomeFinded)
    }
}