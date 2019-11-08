package adapter_pattern.points

import adapter_pattern.points.adapter.Point3DAdapter

fun main()
{
    val plane = Plane2D()

    //2D points
    val points = listOf<Point2D>(
        Point2D(1.0, 2.2),
        Point2D(0.0, 0.0),
        Point2D(-3.7, 4.999)
    )

    //3D points
    val point3Ds = listOf<Point3D>(
        Point3D(1.0, 0.0, -3.1),
        Point3D(2.2, 1.0, -4.7)
    )

    //add all points
    for (point in points)
    {
        plane.addPoint(point)
    }

    for (point in point3Ds)
    {
        plane.addPoint(Point3DAdapter(point))
    }

    plane.printPlane()
}

