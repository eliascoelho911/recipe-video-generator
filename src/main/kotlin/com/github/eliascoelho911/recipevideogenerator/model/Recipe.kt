package com.github.eliascoelho911.recipevideogenerator.model

data class Recipe(
    val url: String = "",
    val name: String = "",
    val preparationTime: String = "",
    val income: String = "",
    val author: String = "",
    val ingredients: List<String> = listOf(),
    val preparationSteps: List<String> = listOf()
)
