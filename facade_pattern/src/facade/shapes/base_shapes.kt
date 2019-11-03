package facade.shapes

open class Ellipse(
    var radiusX: Double,
    var radiusY: Double
) : Shape(ShapeType.ELLIPSE)

open class Rectangle(
    var length: Double,
    var width: Double
) : Shape(ShapeType.RECTANGLE)

open class Line(
    var x1: Double,
    var y1: Double,
    var x2: Double,
    var y2: Double
) : Shape(ShapeType.LINE)

