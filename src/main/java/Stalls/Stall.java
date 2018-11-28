package Stalls;


import Interfaces.Ireviewed;
import Interfaces.Isecurity;
import Interfaces.Iticketed;
import ThemePark.ThemePark;
import Visitor.Visitor;

public abstract class Stall extends ThemePark implements Ireviewed, Isecurity, Iticketed {

    protected String name;
    protected String ownerName;
    protected String parkingSpot;

    public Stall(int rating,String name,String ownerName, String parkingSpot){
        super(rating);
        this.name = name;
        this.ownerName = ownerName;
        this.parkingSpot = parkingSpot;
    }

    public int getRating(){
        return this.rating;


    }
    public String getName(){
        return this.name;
    }

    public String getOwnerName() {
        return ownerName;
    }

}
