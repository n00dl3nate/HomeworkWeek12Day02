package ThemePark;

import Attractions.Attraction;
import Interfaces.Ireviewed;
import Interfaces.Isecurity;
import Visitor.Visitor;

import java.util.ArrayList;

public class ThemePark implements Isecurity {
    protected int rating;
    private ArrayList<Ireviewed> reviews;

    public ThemePark(int rating){
        this.rating = rating;
        this.reviews = new ArrayList<>();
    }

    public int getRating() {
        return rating;
    }

    public Boolean isAllowedTo(Visitor visitor){
        return true;
    }

    public void addNewReview(Ireviewed review){
        this.reviews.add(review);
    }

    public ArrayList getAllReviewed(){
        return this.reviews;
    }

    public void visit(Visitor visitor, Attraction attractions){

    }
}
