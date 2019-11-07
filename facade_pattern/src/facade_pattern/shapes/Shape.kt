package facade_pattern.shapes

open class Shape (var type: ShapeType)
{

}

enum class ShapeType
{
    ELLIPSE,
    RECTANGLE,
    LINE,
    CIRCLE,
    SQUARE,
    POINT
}