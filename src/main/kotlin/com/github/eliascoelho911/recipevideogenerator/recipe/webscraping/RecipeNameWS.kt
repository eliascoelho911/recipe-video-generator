package com.github.eliascoelho911.recipevideogenerator.recipe.webscraping

class RecipeNameWS(url: String) : WebScraping<String>(url) {
    override fun find(): String =
        document.select("div.recipe-title > h1")
            .text()
}