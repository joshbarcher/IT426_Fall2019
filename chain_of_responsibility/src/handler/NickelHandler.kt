package handler

import driver.CalculateChange

class NickelHandler : IHandler
{
    private val nextHandler = PennyHandler()

    override fun handle(change: CalculateChange)
    {
        //handle the request
        if (change.cents >= 5)
        {
            //add the quarter to the list
            change.coins.add("nickel")
            change.cents -= 5
            println("Nickel handled")
        }
        //if can't handle, send to next handler
        else
        {
            nextHandler.handle(change)
        }
    }
}