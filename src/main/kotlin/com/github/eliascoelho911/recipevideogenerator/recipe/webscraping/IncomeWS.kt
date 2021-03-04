package com.github.eliascoelho911.recipevideogenerator.recipe.webscraping

class IncomeWS(url: String) : WebScraping<String>(url) {
    override fun find(): String =
        document.select("data.p-yield")
            .text()
}