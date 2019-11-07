package facade_pattern.facade

import facade_pattern.shapes.Ellipse
import facade_pattern.shapes.Rectangle
import facade_pattern.shapes.Shape
import facade_pattern.shapes.ShapeType
import facade_pattern.subsystems.CreateShapes
import facade_pattern.subsystems.ShapeDimensions
import java.lang.IllegalArgumentException

class ShapesFacade
{
    //create a map to validate shape dimensions
    private val numDims = mapOf<ShapeType, Int>(
        ShapeType.ELLIPSE to 2,
        ShapeType.CIRCLE to 1,
        ShapeType.RECTANGLE to 2,
        ShapeType.SQUARE to 1,
        ShapeType.LINE to 4,
        ShapeType.POINT to 2
    )

    fun generateShape(type: ShapeType, vararg dimensions: Double): Shape
    {
        //check that we have the right num of parameters
        if (dimensions.size != numDims[type])
        {
            throw IllegalArgumentException("Number of dimensions are incorrect")
        }

        val createShapes = CreateShapes()
        when (type) {
            ShapeType.ELLIPSE -> return createShapes.generateEllipse(dimensions[0], dimensions[1])
            ShapeType.CIRCLE -> return createShapes.generateCircle(dimensions[0])
            ShapeType.RECTANGLE -> return createShapes.generateRectangle(dimensions[0],
                                            dimensions[1])
            ShapeType.SQUARE -> return createShapes.generateSquare(dimensions[0])
            ShapeType.LINE -> return createShapes.generateLine(dimensions[0], dimensions[1],
                                            dimensions[2], dimensions[3])
            ShapeType.POINT -> return createShapes.generatePoint(dimensions[0], dimensions[1])
        }
    }

    fun getArea(shape: Shape): Double
    {
        val shapeDimensions = ShapeDimensions()

        when (shape.type) {
            ShapeType.ELLIPSE -> return shapeDimensions.ellipseArea(shape as Ellipse)
            ShapeType.CIRCLE -> return shapeDimensions.ellipseArea(shape as Ellipse)
            ShapeType.RECTANGLE -> return shapeDimensions.rectangleArea(shape as Rectangle)
            ShapeType.SQUARE -> return shapeDimensions.rectangleArea(shape as Rectangle)
            ShapeType.LINE -> return 0.0
            ShapeType.POINT -> return 0.0
        }
    }
}











