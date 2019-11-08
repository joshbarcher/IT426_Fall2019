package handler

import driver.CalculateChange

class PennyHandler : IHandler
{
    override fun handle(change: CalculateChange)
    {
        //handle the request
        if (change.cents >= 1)
        {
            //add the quarter to the list
            change.coins.add("penny")
            change.cents -= 1
            println("Penny handled")
        }
        //if can't handle, send to next handler
        else
        {
            println("Something went wrong")
        }
    }
}