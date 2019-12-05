package decorators

class DivDecorator(
    val other: IHtmlDecorate,
    val className: String) : IHtmlDecorate
{
    override fun decorateAndReturn(): String
    {
        val result = other.decorateAndReturn()

        return "<div class=\"$className\">$result</div>"
    }
}