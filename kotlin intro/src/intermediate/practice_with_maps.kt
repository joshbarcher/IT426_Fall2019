package intermediate

fun main()
{
    //create an mutable map
    val mapOfColors = mutableMapOf(
        "red" to 1,
        "blue" to 2,
        "yellow" to 3
    )

    //loop over my key/value pairs
    for (key in mapOfColors.keys)
    {
        //print out the color and ranking
        println("Color $key is ranked ${mapOfColors[key]}")
    }

    //what can we do or not do?
    mapOfColors["green"] = 4
    mapOfColors["pink"] = 5

    if (mapOfColors.containsKey("pink"))
    {
        println("Pink is in the map")
    }
}