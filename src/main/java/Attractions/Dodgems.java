package Attractions;

import Interfaces.Ireviewed;
import Interfaces.Iticketed;
import Visitor.Visitor;

public class Dodgems extends Attraction implements Iticketed{

    public Dodgems(int rating,String name){
        super(rating,name);
    }

    public double price(){
        return 4.50;
    }

    public double priceForCustomer(Visitor visitor){
        if(visitor.getHeight() >= 200){
            return price()*2;
        }
        else{
            return price();
        }
    }



}
