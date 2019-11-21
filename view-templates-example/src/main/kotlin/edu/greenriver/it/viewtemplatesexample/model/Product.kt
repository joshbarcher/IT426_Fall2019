package edu.greenriver.it.viewtemplatesexample.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

//this tells JPA we need a product table in our database
@Entity
class Product(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long,
    var name: String,
    var price: Double,
    var description: String,
    var onSale: Boolean
)
{
    constructor(): this(0, "", 0.0, "", false)
}

enum class SaleType
{
    NO_SALE,
    ON_SALE,
    PREMIER_ITEM,
    LIMITED_ITEM
}