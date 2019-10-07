package intro

fun main()
{
    val adder: (Int, Int) -> Int = { a, b -> a + b }
    val subtracter: (Int, Int) -> Int = { a, b -> a - b }
    val multiplier: (Int, Int) -> Int = { a, b -> a * b }
    val divider: (Int, Int) -> Int = { a, b -> if (b != 0) a / b else 0 }

    println(calculator(adder, 10, 20))
    println(calculator(multiplier, 30, 10))

    val transforms = arrayOf<(String) -> String>(
        { it.replace(" ", "_") },
        { it.toLowerCase() },
        { it.replace("a", "@") }
    )
    val inputString = "I know you can be over and under whelmed, " +
                      "can you ever just be whelmed"
    val interestingString = applyStringTransforms(transforms, inputString)
    println("After changes - $interestingString")
}

fun calculator(func: (Int, Int) -> Int, op1: Int, op2: Int): Int
{
    return func(op1, op2)
}

fun applyStringTransforms(transforms: Array<(String) -> String>, input: String) : String
{
    var changes = input
    for (transform in transforms)
    {
        changes = transform(changes)
    }

    return changes
}

