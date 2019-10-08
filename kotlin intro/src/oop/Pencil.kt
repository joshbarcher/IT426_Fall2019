package oop

class Pencil
{
    var brand: String = ""
        get() { return field.capitalize() }
        set(value) { field = value }
    var thickness: Int = 2
}

fun main()
{
    val pencil = Pencil()
    pencil.brand = "Pentec"
    println(pencil.brand)
}