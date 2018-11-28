import Attractions.Dodgems;
import Attractions.PlayGround;
import Attractions.RollerCoaster;
import Stalls.CandyFlossStall;
import Stalls.IceCreamStall;
import Stalls.TobaccoStall;
import ThemePark.ThemePark;
import Visitor.Visitor;
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
    Visitor visitor;
    Visitor giantVisitor;
    Visitor youngVisitor;


    @Before
    public void before() {
        dodgems = new Dodgems(3, "Dodgems");
        playGround = new PlayGround(5, "SpongeLand");
        rollerCoaster = new RollerCoaster(5, "Rip & Saw");
        candyFlossStall = new CandyFlossStall(5,"Candy","Tim","1");
        iceCreamStall = new IceCreamStall(5,"Ice Ice Baby","Bob","2");
        tobaccoStall = new TobaccoStall(1,"Kush","Afroman","3");
        themePark = new ThemePark(4);
        visitor = new Visitor(20,100.00,170);
        giantVisitor = new Visitor(30,400.00,220);
        youngVisitor = new Visitor(11,20.00,145);

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
        String result = themePark.reportReviewed();
        assertEquals("Dodgems : 3, Rip & Saw : 5, ",result );
    }

    @Test
    public void checkAllowed(){
        this.themePark.addNewReview(dodgems);
        this.themePark.addNewReview(rollerCoaster);
        this.themePark.addNewReview(tobaccoStall);
        this.themePark.addNewReview(playGround);
        int result1 = themePark.getAllAllowedFor(visitor).size();
        int result2 = themePark.getAllAllowedFor(youngVisitor).size();
        assertEquals(3,result1);
        assertEquals(2,result2);
    }

    @Test
    public void TestVisitAttraction(){
        String result1 = themePark.visit(rollerCoaster,visitor);
        assertEquals("Visited Attraction",result1);
        assertEquals(91.20,visitor.getMoney(),0.01);

        String result2 = themePark.visit(rollerCoaster,youngVisitor);
        assertEquals("Not Allowed",result2);
        assertEquals(20,youngVisitor.getMoney(),0.01);
    }

    @Test
    public void TestVisitStall(){
        String result1 = themePark.visit(iceCreamStall,visitor);
        assertEquals("Visited Stall",result1);
        assertEquals(97.20,visitor.getMoney(),0.01);

        String result2 = themePark.visit(tobaccoStall,youngVisitor);
        assertEquals("Not Allowed",result2);
        assertEquals(20,youngVisitor.getMoney(),0.01);
    }




}
