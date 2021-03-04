package com.github.eliascoelho911.recipevideogenerator.webscraping

class IncomeScraping(url: String) : Scraping<String>(url) {
    override fun find(): String =
        document.select("data.p-yield")
            .text()
}