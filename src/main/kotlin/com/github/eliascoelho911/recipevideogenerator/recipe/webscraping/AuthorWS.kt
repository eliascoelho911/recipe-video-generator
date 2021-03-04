package com.github.eliascoelho911.recipevideogenerator.recipe.webscraping

class AuthorWS(url: String) : WebScraping<String>(url) {
    override fun find(): String =
        document.select("div.author-info div.txt span[itemprop=name]")
            .text()
}