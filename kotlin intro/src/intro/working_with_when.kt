package intro

fun main()
{
    println("How old is your dog?")
    val input = readLine()

    if (input != null)
    {
        val age = input.toInt()

        when (age) {
            in 0..3 -> println("Your dog is a pup")
            in 4..7 -> println("Your dog is middle-aged")
            else -> println("Your dog is getting old")
        }

        val description = when (age) {
            in 0..3 -> "young"
            in 4..7 -> "middle-aged"
            else -> "old"
        }

        println("Your dog is $description")
    }
}