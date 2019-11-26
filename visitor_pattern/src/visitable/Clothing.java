package visitable;

import visitor.Visitor;

public class Clothing implements Visitable
{
    private double price;

    public Clothing(double price)
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
