package Stalls;

import Visitor.Visitor;

public class IceCreamStall extends Stall{

    public IceCreamStall(int rating, String name,String ownerName,String parkingSpot){
        super(rating,name,ownerName,parkingSpot);
    }

    public double price(){
        return 2.80;
    }

    public double priceForCustomer(Visitor visitor){
        return price();

    }

}