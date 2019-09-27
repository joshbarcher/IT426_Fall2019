package intro

fun main()
{
    practiceWithLoops()

    val result = add(second = 10, first = 20)
    println("result = $result")

    val nothing = printMe("Hello")
    println(nothing)

    println(getPi())
    println(min(10, 50))
    println(min(-10, -100))

    val descriptor: String = describeNum(100.0)
    println(descriptor)
}

//here are a few "function expressions"
fun getPi(): Double = 3.14159
fun min(valueOne: Int, valueTwo: Int) = if (valueOne < valueTwo) valueOne else valueTwo

fun describeNum(num: Double): String = when {
    num > 0 -> "positive"
    num < 0 -> "negative"
    else -> "zero"
}

fun printMe(message: String)
{
    println(message)
}

fun add(first: Int, second: Int): Int
{
    val result = first + second
    println("You added $first + $second")

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