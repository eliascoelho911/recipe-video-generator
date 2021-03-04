package com.github.eliascoelho911.recipevideogenerator.recipe.webscraping

class PreparationTimeWS(url: String) : WebScraping<String>(url) {
    override fun find(): String =
        document.select("time.dt-duration")
            .text()
}