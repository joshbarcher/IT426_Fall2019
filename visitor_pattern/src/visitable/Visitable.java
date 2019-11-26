package visitable;

import visitor.Visitor;

public interface Visitable
{
    double accept(Visitor visitor);
}
