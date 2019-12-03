package command_composite_memento

import command_composite_memento.commands.ChangeLocationCommand
import command_composite_memento.commands.ChangeMilesCommand
import command_composite_memento.commands.ICarCommand
import command_composite_memento.commands.TripToSeattleCommand
import java.util.function.IntConsumer

fun main()
{
    //create our receivers and command objects
    val car = Car("Ford Fusion", "Mall", 31000)
    val memento = car.createMemento()

    val commands = listOf<ICarCommand>(
        ChangeLocationCommand(car, "Restaurant"),
        ChangeMilesCommand(car, 5),
        TripToSeattleCommand(car)
    )

    println(car)
    for (command in commands)
    {
        command.doSomething()
        println(car)
    }

    //restore my state using the memento
    println()
    car.restoreMemento(memento)
    println(car)
}

fun example1()
{
    //create our receivers and command objects
    val car = Car("Ford Fusion", "Mall", 31000)
    val command1 = ChangeLocationCommand(car, "Restaurant")
    val command2 = ChangeMilesCommand(car, 5)

    //perform the actions
    println(car)
    command1.doSomething()
    command2.doSomething()
    println(car)

    //queue up several commands
    val commands = listOf<ICarCommand>(
        ChangeLocationCommand(car, "Home"),
        ChangeMilesCommand(car, 20),
        ChangeLocationCommand(car, "Gas Station"),
        ChangeMilesCommand(car, 12),
        ChangeLocationCommand(car, "Mall"),
        ChangeMilesCommand(car, 20)
    )

    //perform all actions in sequence
    for (command in commands)
    {
        command.doSomething()
    }
    println(car)

    //undo all actions
    for (command in commands.reversed())
    {
        command.undoSomething()
    }
    println(car)
}