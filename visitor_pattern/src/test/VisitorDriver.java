package test;

import visitable.Book;
import visitable.Clothing;
import visitable.Toy;
import visitor.HolidaySaleVisitor;
import visitor.TaxVisitor;

public class VisitorDriver
{
    public static void main(String[] args)
    {
        Toy actionFigure = new Toy(5.2);
        Book harryPotter = new Book(14.25);
        Clothing sweater = new Clothing(20.0);

        TaxVisitor visitor = new TaxVisitor();

        System.out.println(actionFigure.accept(visitor));
        System.out.println(harryPotter.accept(visitor));
        System.out.println(sweater.accept(visitor));
        System.out.println();

        HolidaySaleVisitor holidayVisitor = new HolidaySaleVisitor();
        System.out.println(actionFigure.accept(holidayVisitor));
        System.out.println(harryPotter.accept(holidayVisitor));
        System.out.println(sweater.accept(holidayVisitor));
    }
}
