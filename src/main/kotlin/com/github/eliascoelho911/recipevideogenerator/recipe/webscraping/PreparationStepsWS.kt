package com.github.eliascoelho911.recipevideogenerator.recipe.webscraping

class PreparationStepsWS(url: String) : WebScraping<List<String>>(url) {
    override fun find(): List<String> =
        document.select("div.e-instructions > ol li span").map { it.text() }
}