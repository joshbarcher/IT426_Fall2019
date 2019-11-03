package facade.subsystems

import facade.shapes.Ellipse
import facade.shapes.Line
import facade.shapes.Rectangle
import java.lang.RuntimeException

class ShapeDimensions
{
    //ELLIPSE ******************************************

    fun ellipseArea(ellipse: Ellipse): Double
    {
        return ellipse.radiusX * ellipse.radiusY * Math.PI
    }

    fun ellipseCircumference(ellipse: Ellipse): Double
    {
        //an approximation
        return 2 * Math.PI * Math.sqrt(
            (Math.pow(ellipse.radiusX, 2.0) +
             Math.pow(ellipse.radiusY, 2.0)) / 2
        )
    }

    fun circleCircumference(circle: Ellipse): Double
    {
        if (!isCircle(circle))
        {
            throw RuntimeException("Input is not a circle")
        }

        return 2 * Math.PI * circle.radiusX
    }

    //RECTANGLE ******************************************

    fun rectangleArea(rect: Rectangle): Double
    {
        return rect.length * rect.width
    }

    fun rectanglePerimeter(rect: Rectangle): Double
    {
        return 2 * rect.length + 2 * rect.width
    }

    //LINE ******************************************

    fun distance(line: Line): Double
    {
        return Math.sqrt(
            Math.pow(line.x1 - line.x2, 2.0) +
            Math.pow(line.y1 - line.y2, 2.0)
        )
    }

    //IDENTITY ******************************************

    fun isCircle(ellipse: Ellipse): Boolean
    {
        return ellipse.radiusX == ellipse.radiusY
    }

    fun isSquare(rectangle: Rectangle): Boolean
    {
        return rectangle.length == rectangle.width
    }

    fun isPoint(line: Line): Boolean
    {
        return line.x1 == line.x2 && line.y1 == line.y2
    }
}

