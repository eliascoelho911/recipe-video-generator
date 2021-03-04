package com.github.eliascoelho911.recipevideogenerator.recipe.webscraping

import com.github.eliascoelho911.RECIPE
import com.github.eliascoelho911.URL
import org.junit.Assert.assertEquals
import org.junit.Test

class AuthorWSTest {
    @Test
    fun authorMustBeFound() {
        val authorFinded = AuthorWS(URL).find()
        assertEquals(RECIPE.author, authorFinded)
    }
}