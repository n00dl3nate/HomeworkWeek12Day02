package ThemePark;

import Attractions.Attraction;
import Interfaces.Ireviewed;
import Interfaces.Isecurity;
import Stalls.Stall;
import Visitor.Visitor;

import java.util.ArrayList;

public class ThemePark implements Isecurity {
    protected int rating;
    private ArrayList<Ireviewed> reviews;
    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;

    public ThemePark(int rating){
        this.rating = rating;
        this.reviews = new ArrayList<>();
        this.attractions = new ArrayList<>();
        this.stalls = new ArrayList<>();
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

    public String reportReviewed(){
        String report = "";
        for (Ireviewed e: this.reviews) {
            report += e.getName() + " : " + e.getRating() + ", ";
        }
        return report;
    }

    public void visit(Visitor visitor, Attraction attractions){

    }
}
