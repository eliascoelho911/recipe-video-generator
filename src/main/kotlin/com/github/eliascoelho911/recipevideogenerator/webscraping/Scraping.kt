package com.github.eliascoelho911.recipevideogenerator.webscraping

import org.jsoup.Jsoup

abstract class Scraping<T>(private val url: String) {
    protected val document by lazy { Jsoup.connect(url).get() }

    abstract fun find(): T
}