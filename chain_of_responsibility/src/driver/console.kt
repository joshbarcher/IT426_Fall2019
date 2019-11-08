package driver

import handler.QuarterHandler

fun main()
{
    //create a request to the first handler
    val handler = QuarterHandler()

    //instantiate a list of coins with the amount of change we want back
    val change = CalculateChange(74)

    //handle the request
    while (change.cents != 0)
    {
        handler.handle(change)
        println(change.cents)
    }

    //display the coins
    for (coin in change.coins)
    {
        println(coin)
    }
}