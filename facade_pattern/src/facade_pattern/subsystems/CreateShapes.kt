package facade_pattern.subsystems

import facade_pattern.shapes.*
import java.lang.RuntimeException

class CreateShapes
{
    fun generateEllipse(radiusX: Double, radiusY: Double): Ellipse
    {
        if (radiusX < 0.0 || radiusY < 0.0)
        {
            throw RuntimeException("Invalid radius")
        }

        return Ellipse(radiusX, radiusY)
    }

    fun generateCircle(radius: Double) : Ellipse
    {
        if (radius < 0)
        {
            throw RuntimeException("Invalid radius")
        }
        return Circle(radius)
    }

    fun generateRectangle(length: Double, width: Double): Rectangle
    {
        if (length < 0.0 || width < 0.0)
        {
            throw RuntimeException("Invalid dimensions")
        }

        return Rectangle(length, width)
    }

    fun generateSquare(side: Double): Rectangle
    {
        if (side < 0.0)
        {
            throw RuntimeException("Invalid dimensions")
        }
        return Square(side)
    }

    fun generateLine(x1: Double, y1: Double, x2: Double, y2: Double): Line
    {
        return Line(x1, y1, x2, y2)
    }

    fun generatePoint(x: Double, y: Double) : Line
    {
        return Point(x, y)
    }

    fun generateOrigin(): Line
    {
        return generatePoint(0.0, 0.0)
    }
}

