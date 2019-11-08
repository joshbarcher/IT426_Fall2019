package handler

import driver.CalculateChange

class QuarterHandler : IHandler
{
    private val nextHandler = DimeHandler()

    override fun handle(change: CalculateChange)
    {
        //handle the request
        if (change.cents >= 25)
        {
            //add the quarter to the list
            change.coins.add("quarter")
            change.cents -= 25
            println("Quarter handled")
        }
        //if can't handle, send to next handler
        else
        {
            nextHandler.handle(change)
        }
    }
}