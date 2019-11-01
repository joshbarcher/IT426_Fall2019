package template

fun main()
{
    val thriller = ThrillerMovie()
    val action = ActionMovie()

    thriller.playMovie("The Shark", "Hopper")
    println()
    action.playMovie("Thulsa Doom", "Conan")
    println()
}