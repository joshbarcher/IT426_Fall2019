package test

fun main()
{
    var decorators: IHtmlDecorate = DivDecorator(
        HtmlSubject("Hello, World!"), "highlight"
    )
    decorators = StyleDecorator(decorators, "border: 2px solid black")

    val html = decorators.decorateAndReturn()
    println(html)
}
