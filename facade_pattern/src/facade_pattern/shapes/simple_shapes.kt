package facade_pattern.shapes

class Circle(radius: Double)
    : Ellipse(radius, radius)
{
    init
    {
        type = ShapeType.CIRCLE
    }
}

class Square(side: Double)
    : Rectangle(side, side)
{
    init
    {
        type = ShapeType.RECTANGLE
    }
}

class Point(x: Double, y: Double)
    : Line(x, y, x, y)
{
    init
    {
        type = ShapeType.POINT
    }
}

