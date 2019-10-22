package layouts

import javafx.application.Application
import javafx.scene.Scene
import javafx.scene.image.Image
import javafx.scene.image.ImageView
import javafx.scene.layout.TilePane
import javafx.stage.Stage
import java.io.File

class TilePanePractice: Application()
{
    override fun start(stage: Stage?)
    {
        if (stage != null) {
            stage.title = "Tile Pane Practice"
            stage.scene = getScene()
            stage.show()
        }
    }

    fun getScene() : Scene
    {
        val panel = TilePane()

        val folder = javaClass.classLoader.
            getResource("icons")?.toURI()

        if (folder != null)
        {
            val files = File(folder).listFiles()
            if (files != null)
            {
                for (file in files)
                {
                    val image = Image("file:${file.absolutePath}")
                    val imgView = ImageView(image)

                    imgView.fitHeight = 30.0
                    imgView.fitWidth = 30.0

                    panel.children.add(imgView)
                }
            }
        }

        return Scene(panel, 500.0, 500.0)
    }
}

fun main()
{
    Application.launch(TilePanePractice::class.java)
}