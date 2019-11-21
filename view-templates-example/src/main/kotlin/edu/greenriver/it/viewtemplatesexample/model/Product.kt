package edu.greenriver.it.viewtemplatesexample.model

class Product(
    var name: String,
    var price: Double,
    var description: String,
    var onSale: Boolean
)
{
    constructor(): this("", 0.0, "", false)
}

enum class SaleType
{
    NO_SALE,
    ON_SALE,
    PREMIER_ITEM,
    LIMITED_ITEM
}