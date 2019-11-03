package facade.subsystems

import facade.shapes.Ellipse
import facade.shapes.Line
import facade.shapes.Rectangle
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
        return generateEllipse(radius, radius)
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
        return generateRectangle(side, side)
    }

    fun generateLine(x1: Double, y1: Double, x2: Double, y2: Double): Line
    {
        return Line(x1, y1, x2, y2)
    }

    fun generatePoint(x: Double, y: Double) : Line
    {
        return generateLine(x, y, x, y)
    }

    fun generateOrigin(): Line
    {
        return generatePoint(0.0, 0.0)
    }
}

