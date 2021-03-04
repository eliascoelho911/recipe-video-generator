package com.github.eliascoelho911.recipevideogenerator.finder

import com.github.eliascoelho911.recipevideogenerator.factory.RecipeFactory
import com.github.eliascoelho911.recipevideogenerator.model.Recipe

private const val BASE_URL = "https://www.tudogostoso.com.br"

class RecipeFinder {
    fun find(path: String): Recipe {
        val url = createUrl(path)
        return RecipeFactory.create(url)
    }

    private fun createUrl(path: String) =
        "$BASE_URL${path[0].takeIf { it.toString() == "/" } ?: "/"}$path"
}