package com.github.eliascoelho911.recipevideogenerator.webscraping

class AuthorScraping(url: String) : Scraping<String>(url) {
    override fun find(): String =
        document.select("div.author-info div.txt span[itemprop=name]")
            .text()
}