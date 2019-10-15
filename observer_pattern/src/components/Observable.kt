package components

abstract class Observable
{
    //store a list of IObserver objects
    private val observers = mutableListOf<IObserver>()

    //add IObserver objects to see changes in the child class
    fun addObserver(observer: IObserver)
    {
        if (!observers.contains(observer))
        {
            observers.add(observer)
        }
    }

    //inform the IObserver objects when necessary
    fun notifyObservers()
    {
        notifyObservers(arrayOf())
    }

    fun notifyObservers(args: Array<Any>)
    {
        //loop over each IObserver object and inform it
        for (observer in observers)
        {
            observer.update(args)
        }
    }
}










