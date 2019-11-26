package factory_methods

fun main()
{
    val point1 = Point.origin()
    val point2 = Point.random()
    val point3 = Point.atCoords(3.0, -2.0);

    println(point1)
    println(point2)
    println(point3)
}