package command_composite_memento.commands

import command_composite_memento.Car

interface ICarCommand
{
    fun doSomething()
    fun undoSomething()
}

//pass in the receiver (Car object)
class ChangeLocationCommand(val car: Car, val newLocation: String) : ICarCommand
{
    private var oldLocation: String = ""

    override fun doSomething()
    {
        //save the old location so we can undo later...
        oldLocation = car.location
        car.location = newLocation
        println("Location changed to $newLocation")
    }

    override fun undoSomething()
    {
        println("Location changed back to $oldLocation")
        car.location = oldLocation
        oldLocation = ""
    }
}

class ChangeMilesCommand(val car: Car, val moreMiles: Int) : ICarCommand
{
    override fun doSomething()
    {
        car.miles += moreMiles
        println("Miles changed to ${car.miles}")
    }

    override fun undoSomething()
    {
        car.miles -= moreMiles
        println("Miles changed back to ${car.miles}")
    }
}