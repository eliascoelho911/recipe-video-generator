package com.github.eliascoelho911.recipevideogenerator.recipe.webscraping

import org.jsoup.Jsoup
import org.jsoup.nodes.Document

abstract class WebScraping<T>(private val url: String) {
    protected val document: Document by lazy { Jsoup.connect(url).get() }

    abstract fun find(): T
}