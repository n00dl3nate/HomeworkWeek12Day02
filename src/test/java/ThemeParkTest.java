import Attractions.Dodgems;
import Attractions.PlayGround;
import Attractions.RollerCoaster;
import Stalls.CandyFlossStall;
import Stalls.IceCreamStall;
import Stalls.TobaccoStall;
import ThemePark.ThemePark;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    Dodgems dodgems;
    PlayGround playGround;
    RollerCoaster rollerCoaster;
    CandyFlossStall candyFlossStall;
    IceCreamStall iceCreamStall;
    TobaccoStall tobaccoStall;


    @Before
    public void before() {
        dodgems = new Dodgems(3, "Dodgems");
        playGround = new PlayGround(5, "SpongeLand");
        rollerCoaster = new RollerCoaster(5, "Rip & Saw");
        candyFlossStall = new CandyFlossStall(5,"Candy","Tim","1");
        iceCreamStall = new IceCreamStall(5,"Ice Ice Baby","Bob","2");
        tobaccoStall = new TobaccoStall(1,"Kush","Afroman","3");
        themePark = new ThemePark(4);
    }

    @Test
    public void addingReview(){
        this.themePark.addNewReview(dodgems);
        this.themePark.addNewReview(rollerCoaster);
        assertEquals(2,this.themePark.getAllReviewed().size());
    }

    @Test
    public void reportingReview(){
        this.themePark.addNewReview(dodgems);
        this.themePark.addNewReview(rollerCoaster);
        assertEquals("Dodgems : 3, Rip & Saw : 5,", themePark.reportReviewed());
    }



}
