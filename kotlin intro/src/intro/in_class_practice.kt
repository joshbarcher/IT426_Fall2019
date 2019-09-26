package intro

fun main()
{
    practiceWithLoops()

    val result = add(10, 20)
    println("result = $result")
}

fun add(first: Int, second: Int): Int
{
    val result = first + second

    return result
}

fun practiceWithLoops()
{
    //loop with IntRange
    for (num in 1..10)
    {
        println("num = $num")
    }

    for (char in "hello world!")
    {
        println("char = $char")
    }

    val favNumbers = arrayOf(10, 1, 24, 100, 42)
    for (num in favNumbers)
    {
        println("num = $num")
    }

    favNumbers.reverse()
    for (index in favNumbers.indices)
    {
        println("$index = ${favNumbers[index]}")
    }
}