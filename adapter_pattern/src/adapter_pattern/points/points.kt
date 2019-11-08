package adapter_pattern.points

interface ICartesianPoint
{
    val x: Double
    val y: Double
}

class Point2D(
    override val x: Double,
    override val y: Double) : ICartesianPoint
{
    override fun toString(): String
    {
        return "($x, $y)"
    }
}

class Point3D(
    val x: Double,
    val y: Double,
    val z: Double)
{
    override fun toString(): String
    {
        return "($x, $y, $z)"
    }
}

