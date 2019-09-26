package intro

fun main()
{
    //prompt the user for their name and print it out
    println("First name: ")
    val firstName = readLine()

    println("Middle Initial: ")
    val middle = readLine()

    println("Last name: ")
    val lastName = readLine()

    //print out the name
    println("Your name is ${firstName?.toUpperCase()} $middle. $lastName")
}