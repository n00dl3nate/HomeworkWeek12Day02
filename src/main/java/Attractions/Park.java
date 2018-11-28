package Attractions;

import Interfaces.Ireviewed;
import Interfaces.Iticketed;
import Visitor.Visitor;

public class Park  extends Attraction implements Ireviewed {

    public Park(int rating, String name) {
        super(rating, name);
    }

    public Boolean isAllowedTo(Visitor visitor){
        if(visitor.getAge() <= 15 ){
            return true;
        }
        else{
            return false;
        }
    }


}


