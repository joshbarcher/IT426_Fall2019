package scenes

import javafx.application.Application
import javafx.geometry.Pos
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.control.ProgressIndicator
import javafx.scene.layout.HBox
import javafx.scene.layout.Pane
import javafx.scene.layout.VBox
import javafx.scene.text.Font
import javafx.scene.text.Text
import javafx.stage.Stage

class SwitchingScenes : Application()
{
    lateinit var stage: Stage

    override fun start(stage: Stage?)
    {
        if (stage != null)
        {
            //save our stage for later
            this.stage = stage

            stage.title = "Switching Scenes"
            stage.scene = getScene()
            stage.show()
        }
    }

    fun getScene(name: String = ""): Scene
    {
        val panel: Pane = when(name) {
            "loading" -> loadingPanel()
            "buttons" -> choicesPanel()
            else -> loadingPanel()
        }

        return Scene(panel, 400.0, 400.0)
    }

    fun loadingPanel(): Pane
    {
        val panel = VBox()
        panel.alignment = Pos.CENTER
        panel.spacing = 20.0

        val header = Text("Loading")
        header.font = Font.font(30.0)
        val progress = ProgressIndicator()

        panel.children.addAll(header, progress)

        progress.setOnMouseClicked {
            stage.scene = getScene("buttons")
        }

        return panel
    }

    fun choicesPanel(): Pane
    {
        val panel = HBox()

        val choice1 = Button("Choice #1")
        val choice2 = Button("Choice #2")

        panel.children.addAll(choice1, choice2)

        return panel
    }
}

fun main()
{
    Application.launch(SwitchingScenes::class.java)
}