package layouts

import javafx.application.Application
import javafx.geometry.Insets
import javafx.scene.Scene
import javafx.scene.control.CheckBox
import javafx.scene.control.Hyperlink
import javafx.scene.control.TextField
import javafx.scene.layout.BorderPane
import javafx.scene.layout.HBox
import javafx.scene.layout.VBox
import javafx.scene.text.Text
import javafx.stage.Stage

class BorderPanePractice: Application()
{
    override fun start(stage: Stage?)
    {
        if (stage != null)
        {
            stage.title = "Border Pane Practice"
            stage.scene = getScene()
            stage.show()
        }
    }

    fun getScene(): Scene
    {
        val panel = BorderPane()

        //set each region
        panel.left = westPanel()
        panel.right = eastPanel()
        panel.top = northPanel()
        panel.center = centerPanel()

        //set the margins of each sub-panel
        BorderPane.setMargin(panel.left, Insets(10.0))
        BorderPane.setMargin(panel.right, Insets(10.0))
        BorderPane.setMargin(panel.top, Insets(10.0))
        BorderPane.setMargin(panel.center, Insets(10.0))

        return Scene(panel, 540.0, 500.0)
    }

    fun westPanel(): VBox
    {
        val panel = VBox()

        val text = Text("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed volutpat aliquam ligula sed dictum. Sed aliquet, magna sit amet porta volutpat, diam leo dapibus sem, et tincidunt nibh mauris faucibus metus.")
        text.wrappingWidth = 100.0
        panel.children.addAll(text)

        return panel
    }

    fun eastPanel(): VBox
    {
        val panel = VBox()

        val text = Text("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed volutpat aliquam ligula sed dictum. Sed aliquet, magna sit amet porta volutpat, diam leo dapibus sem, et tincidunt nibh mauris faucibus metus.")
        text.wrappingWidth = 100.0
        panel.children.addAll(text)

        return panel
    }

    fun northPanel(): HBox
    {
        val panel = HBox()

        panel.children.addAll(
            Hyperlink("Home"),
            Hyperlink("Add"),
            Hyperlink("Remove"),
            Hyperlink("About us")
        )

        return panel
    }

    fun centerPanel(): VBox
    {
        val panel = VBox()

        panel.children.addAll(
            CheckBox("Option #1"),
            CheckBox("Option #2"),
            CheckBox("Option #3"),
            CheckBox("Option #4"),
            CheckBox("Option #5"),
            CheckBox("Option #6")
        )

        return panel
    }
}

fun main()
{
    Application.launch(BorderPanePractice::class.java)
}