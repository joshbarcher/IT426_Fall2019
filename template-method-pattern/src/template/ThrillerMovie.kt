package template

class ThrillerMovie : Movie()
{
    override fun plot(person1: String)
    {
        println("$person1 attacks someone.")
    }

    override fun resolution(person1: String, person2: String)
    {
        println("$person1 dies. $person2 escapes.")
    }
}