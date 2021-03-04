package com.github.eliascoelho911.recipevideogenerator.recipe

private const val BASE_URL = "https://www.tudogostoso.com.br"

object RecipeFinder {
    fun find(path: String): Recipe {
        val url = createUrl(path)
        return RecipeFactory.create(url)
    }

    private fun createUrl(path: String) =
        "$BASE_URL${path[0].takeIf { it.toString() == "/" } ?: "/"}$path"
}