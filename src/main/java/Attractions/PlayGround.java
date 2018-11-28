package Attractions;


import Visitor.Visitor;

public class PlayGround extends Attraction {

    public PlayGround(int rating,String name){
        super(rating,name);
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
