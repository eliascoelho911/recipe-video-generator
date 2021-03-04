package com.github.eliascoelho911.recipevideogenerator.webscraping

class IngredientsScraping(url: String) : Scraping<List<String>>(url) {
    override fun find(): List<String> =
        document.select("div.ingredients-card > ul li span").map { it.text() }
}