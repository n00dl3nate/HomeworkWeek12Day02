package Interfaces;

import Visitor.Visitor;

public interface Iticketed {
    public double price();

    public double priceForCustomer(Visitor visitor);

}
