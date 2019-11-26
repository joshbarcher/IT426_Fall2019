package visitor;

import visitable.Book;
import visitable.Clothing;
import visitable.Toy;

public class TaxVisitor implements Visitor
{
    @Override
    public double visit(Toy toy)
    {
        System.out.println("Toy item: Price with Tax.");
        return toy.getPrice() + (toy.getPrice() * 0.5);
    }

    @Override
    public double visit(Clothing clothing)
    {
        System.out.println("Clothing item: Price with Tax.");
        return clothing.getPrice() + (clothing.getPrice() * 0.8);
    }

    @Override
    public double visit(Book book)
    {
        System.out.println("Book item: Price with Tax.");
        return book.getPrice() + (book.getPrice() * 0.1);
    }
}
