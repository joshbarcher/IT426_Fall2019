package example1.program

import example1.components.Observable

data class LineItem(val type: String,
                    val value: Double,
                    val quantity: Int)
data class Order(val id: Long,
                 val items: List<LineItem>)

class Orders : Observable()
{
    val orders = mutableSetOf<Order>()

    fun placeOrders(vararg newOrders: Order)
    {
        for (newOrder in newOrders)
        {
            placeOrder(newOrder)
        }
    }

    fun placeOrder(newOrder: Order)
    {
        if (!orders.any { it.id == newOrder.id })
        {
            orders.add(newOrder)
            notifyObservers(arrayOf("Order created: ${newOrder.id}"))
        }
    }
}