package com.github.eliascoelho911.recipevideogenerator.retrofit.dto

data class RecipeSearchResponse(val items: List<Item>) {
    data class Item(val title: String, val link: String)
}

