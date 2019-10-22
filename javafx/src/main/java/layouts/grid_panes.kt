package layouts

import javafx.application.Application
import javafx.collections.FXCollections
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.control.ColorPicker
import javafx.scene.control.ComboBox
import javafx.scene.control.DatePicker
import javafx.scene.layout.ColumnConstraints
import javafx.scene.layout.GridPane
import javafx.scene.layout.RowConstraints
import javafx.stage.Stage

class GridPanesExample : Application()
{
    override fun start(stage: Stage?)
    {
        if (stage != null)
        {
            stage.title = "Grid Pane Example"
            stage.scene = buildScene()
            stage.show()
        }
    }

    fun buildScene(): Scene
    {
        val panel = GridPane()
        panel.gridLinesVisibleProperty().set(true)

        //set my dimensions
        panel.columnConstraints.addAll(
            ColumnConstraints(150.0),
            ColumnConstraints(150.0),
            ColumnConstraints(150.0),
            ColumnConstraints(150.0)
        )

        panel.rowConstraints.addAll(
            RowConstraints(200.0),
            RowConstraints(200.0)
        )

        val button = Button("Click me!")
        panel.add(button, 2, 0)

        val colorPicker = ColorPicker()
        panel.add(colorPicker, 1, 1)

        val datePicker = DatePicker()
        panel.add(datePicker, 3, 1)

        val dropDown = ComboBox<String>()
        dropDown.items = FXCollections.observableArrayList(
            "first", "second", "third", "fourth"
        )
        panel.add(dropDown, 0, 0)

        return Scene(panel, 600.0, 400.0)
    }
}

fun main()
{
    Application.launch(GridPanesExample::class.java)
}









