package adapter.points

class Plane2D
{
    //holds a list of points
    val points = mutableListOf<ICartesianPoint>()

    fun addPoint(point: ICartesianPoint)
    {
        points.add(point)
    }

    fun printPlane()
    {
        points.forEach { println(it) }
    }
}

