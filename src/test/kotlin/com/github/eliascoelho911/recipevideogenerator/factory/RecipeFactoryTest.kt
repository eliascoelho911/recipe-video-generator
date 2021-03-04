package com.github.eliascoelho911.recipevideogenerator.factory

import com.github.eliascoelho911.RECIPE
import com.github.eliascoelho911.URL
import org.junit.Assert.*
import org.junit.Test

class RecipeFactoryTest {
    @Test
    fun mustCreateTheRecipeWithTheCorrectInformation() {
        assertEquals(RECIPE, RecipeFactory.create(URL))
    }
}