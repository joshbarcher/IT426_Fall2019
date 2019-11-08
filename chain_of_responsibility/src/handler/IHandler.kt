package handler

import driver.CalculateChange

interface IHandler
{
    fun handle(change: CalculateChange)
}