package Stalls;

import Interfaces.Iticketed;
import Visitor.Visitor;

public class TobaccoStall extends Stall {

    public TobaccoStall(int rating ,String name,String ownerName,String parkingSpot){
        super(rating,name,ownerName,parkingSpot);
    }

    public Boolean isAllowedTo(Visitor visitor){
        if(visitor.getAge() >= 18 ){
            return true;
        }
        else{
            return false;
        }
    }

    public double price(){
        return 6.60;
    }

    public double priceForCustomer(Visitor visitor){
        return price();

    }


}
