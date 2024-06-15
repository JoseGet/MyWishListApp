package com.example.mywishlistproject.data

data class Wish(
    val id: Long = 0L,
    val title: String = "",
    val description: String = ""
)

object DummyWish{
    val wishList = listOf(
        Wish(title = "Samsung Galaxy S23 5G", description = "Korean Smartphone"),
        Wish(title = "Samsung Galaxy S24 Ultra", description = "Korean Smartphone"),
        Wish(title = "Samsung Galaxy S22 +", description = "Korean Smartphone"),
        Wish(title = "Iphone 15 PRO MAX", description = "Apple Smartphone")

    )
}
