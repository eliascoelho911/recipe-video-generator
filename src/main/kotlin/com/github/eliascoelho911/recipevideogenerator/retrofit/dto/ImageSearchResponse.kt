package com.github.eliascoelho911.recipevideogenerator.retrofit.dto

data class ImageSearchResponse(val items: List<Item>) {
    data class Item(val link: String)
}

