package Stalls;


import Interfaces.Ireviewed;
import Visitor.Visitor;

public class CandyFlossStall extends Stall implements Ireviewed {

    public CandyFlossStall(int rating, String name,String ownerName,String parkingSpot){
        super(rating,name,ownerName,parkingSpot);
    }
}