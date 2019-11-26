package visitable;

import visitor.Visitor;

public class Toy implements Visitable
{
    private double price;

    public Toy(double price)
    {
        this.price = price;
    }

    public double getPrice()
    {
        return price;
    }
    @Override
    public double accept(Visitor visitor)
    {
        return visitor.visit(this);
    }
}
