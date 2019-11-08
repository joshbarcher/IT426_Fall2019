package adapter_pattern.points.adapter

import adapter_pattern.points.ICartesianPoint
import adapter_pattern.points.Point3D
import java.io.File

//pass in the incompatible object
//make this class compatible with Plane2D (target system)
class Point3DAdapter(point: Point3D) : ICartesianPoint
{
    //adaptee
    val point: Point3D = point

    //required fields for the target system
    override val x: Double
        get() = point.x
    override val y: Double
        get() = point.y

    override fun toString(): String
    {
        return "(${point.x}, ${point.y})"
    }
}