package handler

import driver.CalculateChange

class DimeHandler : IHandler
{
    private val nextHandler = NickelHandler()

    override fun handle(change: CalculateChange)
    {
        //handle the request
        if (change.cents >= 10)
        {
            //add the quarter to the list
            change.coins.add("dime")
            change.cents -= 10
            println("Dime handled")
        }
        //if can't handle, send to next handler
        else
        {
            nextHandler.handle(change)
        }
    }
}