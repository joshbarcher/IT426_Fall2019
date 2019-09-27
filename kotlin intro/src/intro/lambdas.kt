package intro

fun main()
{
    val adder: (Int, Int) -> Int = { a, b -> a + b }
    val subtracter: (Int, Int) -> Int = { a, b -> a - b }
    val multiplier: (Int, Int) -> Int = { a, b -> a * b }
    val divider: (Int, Int) -> Int = { a, b -> if (b != 0) a / b else 0 }

    println(calculator(adder, 10, 20))
    println(calculator(multiplier, 30, 10))
}

fun calculator(func: (Int, Int) -> Int, op1: Int, op2: Int): Int
{
    return func(op1, op2)
}

