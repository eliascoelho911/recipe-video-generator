package com.github.eliascoelho911.recipevideogenerator.recipe.webscraping

import com.github.eliascoelho911.RECIPE
import com.github.eliascoelho911.URL
import org.junit.Assert.assertEquals
import org.junit.Test

class IncomeWSTest {
    @Test
    fun incomeMustBeFound() {
        val incomeFinded = IncomeWS(URL).find()
        assertEquals(RECIPE.income, incomeFinded)
    }
}