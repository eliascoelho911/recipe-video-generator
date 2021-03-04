package com.github.eliascoelho911.recipevideogenerator.webscraping

import com.github.eliascoelho911.URL
import com.github.eliascoelho911.RECIPE
import org.junit.Assert.*
import org.junit.Test

class AuthorScrapingTest {
    @Test
    fun authorMustBeFound() {
        val authorFinded = AuthorScraping(URL).find()
        assertEquals(RECIPE.author, authorFinded)
    }
}