package ThemePark;

import Attractions.Attraction;
import Interfaces.Ireviewed;
import Interfaces.Isecurity;
import Interfaces.Iticketed;
import Stalls.Stall;
import Visitor.Visitor;

import java.util.ArrayList;

public class ThemePark implements Isecurity {
    protected int rating;
    private ArrayList<Ireviewed> reviews;
    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;

    public ThemePark(int rating) {
        this.rating = rating;
        this.reviews = new ArrayList<>();
        this.attractions = new ArrayList<>();
        this.stalls = new ArrayList<>();
    }

    public int getRating() {
        return rating;
    }

    public Boolean isAllowedTo(Visitor visitor) {
        return true;
    }

    public void addNewReview(Ireviewed review) {
        this.reviews.add(review);
    }

    public ArrayList getAllReviewed() {
        return this.reviews;
    }

    public String reportReviewed() {
        String report = "";
        for (Ireviewed e : this.reviews) {
            report += e.getName() + " : " + e.getRating() + ", ";
        }
        return report;
    }

    public void visit(Visitor visitor, Attraction attractions) {

    }

    public ArrayList<Ireviewed> getAllAllowedFor(Visitor visitor) {
        ArrayList<Ireviewed> result = new ArrayList<Ireviewed>();
        for (Ireviewed reviewed : this.reviews) {
            if (reviewed instanceof Isecurity && (((Isecurity) reviewed).isAllowedTo(visitor))) { // notes: this is called 'Casting'
                result.add(reviewed);
            }
        }
        return result;
    }

    public String visit(Isecurity attraction, Visitor visitor) {
        boolean allowed = attraction.isAllowedTo(visitor);
        if (allowed == true) {
            if (attraction instanceof Attraction) {
                double cost = (((Iticketed) attraction).priceForCustomer(visitor));
                visitor.setMoney(visitor.getMoney() - cost);
                return "Visited Attraction";
            }
            if (attraction instanceof Stall) {
                double cost = (((Iticketed) attraction).priceForCustomer(visitor));
                visitor.setMoney(visitor.getMoney() - cost);
                return "Visited Stall";
            }
        }
       return "Not Allowed";
    }

}
