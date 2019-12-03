package command_composite_memento

class Car(var makeModel: String, var location: String, var miles: Int)
{
    fun createMemento() : IMemento
    {
        return CarMemento(
            makeModel, location, miles
        )
    }

    fun restoreMemento(memento: IMemento)
    {
        val carMemento = memento as CarMemento

        //reset my fields to their old state, as stored in
        //the memento object
        makeModel = carMemento.makeModel
        location = carMemento.location
        miles = carMemento.miles
    }

    override fun toString(): String
    {
        return "$makeModel, driven $miles miles, located at $location"
    }

    private inner class CarMemento(
        var makeModel: String,
        var location: String,
        var miles: Int
    ): IMemento
}

interface IMemento
{
    //this is a marker interface (Cloneable)
}