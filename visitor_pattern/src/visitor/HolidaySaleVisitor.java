package visitor;

import visitable.Book;
import visitable.Clothing;
import visitable.Toy;

public class HolidaySaleVisitor implements Visitor
{
    @Override
    public double visit(Toy toy)
    {
        System.out.println("Toy item: Holiday sale.");
        return toy.getPrice() - (toy.getPrice() * 0.5);
    }

    @Override
    public double visit(Clothing clothing)
    {
        System.out.println("Clothing item: Holiday sale.");
        return clothing.getPrice() - (clothing.getPrice() * 0.25);
    }

    @Override
    public double visit(Book book)
    {
        System.out.println("Book item: Holiday sale.");
        return book.getPrice() - (book.getPrice() * 0.75);
    }
}
