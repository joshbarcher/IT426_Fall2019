package example2

import javafx.beans.property.SimpleBooleanProperty
import javafx.beans.property.SimpleDoubleProperty
import javafx.beans.property.SimpleIntegerProperty

class CodeMetrics
{
    val linesOfCode = SimpleIntegerProperty()
    val codeCoverage = SimpleDoubleProperty()
    val fullyDocumented = SimpleBooleanProperty()
}

fun main()
{
    val metrics = CodeMetrics()

    //add an observer
    metrics.codeCoverage.addListener { observable, old, new ->
        println("Old $old")
        println("New $new")
        println()
    }

    //make changes to the observable and let observers
    //react!
    metrics.codeCoverage.set(.5)
    metrics.codeCoverage.set(.6)
}










