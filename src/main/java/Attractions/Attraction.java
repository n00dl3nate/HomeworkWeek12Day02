package Attractions;

import Interfaces.Ireviewed;
import ThemePark.ThemePark;

public abstract class  Attraction extends ThemePark implements Ireviewed {

    private String name;

    public Attraction(int rating ,String name){
        super(rating);
        this.name = name;
    }

    public int getRating(){
        return this.rating;


    }
    public String getName(){
        return this.name;
    }



}
