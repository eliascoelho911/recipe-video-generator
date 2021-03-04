package com.github.eliascoelho911.recipevideogenerator.recipe.webscraping

class IngredientsWS(url: String) : WebScraping<List<String>>(url) {
    override fun find(): List<String> =
        document.select("div.ingredients-card > ul li span").map { it.text() }
}