package example1.observers

import example1.components.IObserver

class ConsoleObserver : IObserver
{
    override fun update(args: Array<Any>)
    {
        for (arg in args)
        {
            println(arg)
        }
    }
}