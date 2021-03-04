package com.github.eliascoelho911.recipevideogenerator.webscraping

class PreparationTimeScraping(url: String) : Scraping<String>(url) {
    override fun find(): String =
        document.select("time.dt-duration")
            .text()
}