package facade_pattern.test

import facade_pattern.facade.ShapesFacade
import facade_pattern.shapes.Circle
import facade_pattern.shapes.Point
import facade_pattern.shapes.Rectangle
import facade_pattern.shapes.ShapeType

fun main()
{
    val facade = ShapesFacade()

    val shape1: Circle = facade.generateShape(ShapeType.CIRCLE, 1.3) as Circle
    val shape2: Rectangle = facade.generateShape(ShapeType.RECTANGLE,
                    2.9, 11.7) as Rectangle
    val point: Point = facade.generateShape(ShapeType.POINT, 2.0, 3.1) as Point

}