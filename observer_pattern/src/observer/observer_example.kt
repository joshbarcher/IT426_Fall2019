package observer

data class LineItem(val type: String,
                    val value: Double,
                    val quantity: Int)
data class Order(val id: Long,
                 val items: List<LineItem>)

class Orders
{
    val orders = mutableSetOf<Order>()

    fun placeOrder(newOrder: Order)
    {
        if (!orders.any { it.id == newOrder.id })
        {
            orders.add(newOrder)
        }
    }
}