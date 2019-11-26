package visitor;

import visitable.Book;
import visitable.Clothing;
import visitable.Toy;

public interface Visitor
{
    double visit(Toy toy);
    double visit(Clothing clothing);
    double visit(Book book);
}
