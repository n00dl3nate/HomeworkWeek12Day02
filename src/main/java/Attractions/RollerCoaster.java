package Attractions;

import Interfaces.Ireviewed;
import Interfaces.Iticketed;
import Visitor.Visitor;

public class RollerCoaster extends Attraction implements Iticketed {

    public RollerCoaster(int rating,String name){
        super(rating,name);
    }

    public double price(){
        return 8.80;
    }

    public double priceForCustomer(Visitor visitor){
        if(visitor.getHeight() >= 200){
            return price()*2;
        }
        else{
            return price();
        }
    }

    public Boolean isAllowedTo(Visitor visitor){
        if(visitor.getAge() >= 12 && visitor.getHeight() >= 145 ){
            return true;
        }
        else{
            return false;
        }
    }


}
