package program

import observers.ConsoleObserver
import observers.FileLoggerObserver

fun main()
{
    //create orders and the order system
    val orderSystem = Orders()

    val order1 = Order(
        id = 1,
        items = listOf(
            LineItem("Surfboard", 99.99, 2),
            LineItem("Bowling Ball", 19.99, 1)
        )
    )

    val order2 = Order(
        id = 2,
        items = listOf(
            LineItem("Bulk Paper", 7.99, 5)
        )
    )

    //create an observer of my order system
    orderSystem.addObserver(ConsoleObserver())
    orderSystem.addObserver(FileLoggerObserver())

    //make something interesting happen...
    orderSystem.placeOrders(order1, order2)
}









