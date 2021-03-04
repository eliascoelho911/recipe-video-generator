package com.github.eliascoelho911.recipevideogenerator.webscraping

class RecipeNameScraping(url: String) : Scraping<String>(url) {
    override fun find(): String =
        document.select("div.recipe-title > h1")
            .text()
}