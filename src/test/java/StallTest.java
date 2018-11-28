import Stalls.CandyFlossStall;
import Stalls.IceCreamStall;
import Stalls.TobaccoStall;
import Visitor.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StallTest {

    CandyFlossStall candyFlossStall;
    IceCreamStall iceCreamStall;
    TobaccoStall tobaccoStall;
    Visitor visitor;
    Visitor giantVisitor;
    Visitor youngVisitor;

    @Before
    public void before(){
        candyFlossStall = new CandyFlossStall(5,"Candy","Tim","1");
        iceCreamStall = new IceCreamStall(5,"Ice Ice Baby","Bob","2");
        tobaccoStall = new TobaccoStall(1,"Kush","Afroman","3");
        visitor = new Visitor(20,100.00,170);
        giantVisitor = new Visitor(30,400.00,220);
        youngVisitor = new Visitor(12,20.00,120);
    }

    @Test
    public void cangetname(){
        assertEquals("Candy",candyFlossStall.getName());
        assertEquals("Ice Ice Baby",iceCreamStall.getName());
        assertEquals("Kush",tobaccoStall.getName());
    }

    @Test
    public void canGetRating(){
        assertEquals(5,iceCreamStall.getRating());
        assertEquals(5,candyFlossStall.getRating());
        assertEquals(1,tobaccoStall.getRating());
    }

    @Test
    public void canGetOwnerName(){
        assertEquals("Tim",candyFlossStall.getOwnerName());
        assertEquals("Bob",iceCreamStall.getOwnerName());
        assertEquals("Afroman",tobaccoStall.getOwnerName());
    }

    @Test
    public void CheckAgeforTobbaco(){
        assertEquals(true,tobaccoStall.isAllowedTo(visitor));
        assertEquals(false,tobaccoStall.isAllowedTo(youngVisitor));
    }

}
