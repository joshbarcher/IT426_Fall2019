package command_composite_memento.commands

import command_composite_memento.Car

//renton, tukwila
class TripToSeattleCommand(val car: Car) : ICarCommand
{
    private val tripCommands = listOf<ICarCommand>(
        ChangeMilesCommand(car, 30),
        ChangeLocationCommand(car, "Renton"),
        ChangeMilesCommand(car, 25),
        ChangeLocationCommand(car, "Tukwila"),
        ChangeMilesCommand(car, 31),
        ChangeLocationCommand(car, "Seattle"),
        ChangeMilesCommand(car, 31),
        ChangeLocationCommand(car, "Tukwila"),
        ChangeMilesCommand(car, 25),
        ChangeLocationCommand(car, "Renton"),
        ChangeMilesCommand(car, 30),
        ChangeLocationCommand(car, "Home")
    )

    override fun doSomething()
    {
        for(command in tripCommands)
        {
            command.doSomething()
        }
    }

    override fun undoSomething()
    {
        for(command in tripCommands.reversed())
        {
            command.undoSomething()
        }
    }
}