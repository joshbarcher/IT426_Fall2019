package template

abstract class Movie
{
    private fun introduceLocation()
    {
        println("Setting the scene.")
    }

    private fun introduceCharacters()
    {
        println("Main characters enter.")
    }

    abstract fun plot(person1: String)
    abstract fun resolution(person1: String, person2: String)

    private fun credits()
    {
        println("Directed by Steven Spielberg")
    }

    fun playMovie(person1: String, person2: String)
    {
        introduceLocation()
        introduceCharacters()
        plot(person1)
        resolution(person1, person2)
        credits()
    }
}