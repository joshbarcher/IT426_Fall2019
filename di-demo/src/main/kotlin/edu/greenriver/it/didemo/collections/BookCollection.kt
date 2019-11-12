package edu.greenriver.it.didemo.collections

import edu.greenriver.it.didemo.shelves.IBookShelf
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Component

//this class is going to be a spring bean (a component)
@Component
class BookCollection(@Qualifier(value = "digital") val shelf: IBookShelf)
{
    init
    {
        println("Book collection created by Spring container")
    }

    fun addBook(book: String)
    {
        shelf.addBook(book)
    }
}