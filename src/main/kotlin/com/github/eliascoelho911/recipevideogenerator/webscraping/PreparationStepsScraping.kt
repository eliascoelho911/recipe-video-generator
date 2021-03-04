package com.github.eliascoelho911.recipevideogenerator.webscraping

class PreparationStepsScraping(url: String) : Scraping<List<String>>(url) {
    override fun find(): List<String> =
        document.select("div.e-instructions > ol li span").map { it.text() }
}