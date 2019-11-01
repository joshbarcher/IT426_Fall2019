package template

class ActionMovie : Movie()
{
    override fun plot(person1: String)
    {
        println("$person1 is being chased!")
    }

    override fun resolution(person1: String, person2: String)
    {
        println("$person1 and $person2 fight. $person1 wins.")
    }
}