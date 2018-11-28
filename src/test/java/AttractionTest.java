import Attractions.Dodgems;
import Attractions.Park;
import Attractions.PlayGround;
import Attractions.RollerCoaster;
import Visitor.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AttractionTest {

    Dodgems dodgems;
    PlayGround playGround;
    RollerCoaster rollerCoaster;
    Visitor visitor;
    Visitor giantVisitor;
    Visitor youngVisitor;
    Visitor midgetVisitor;



    @Before
    public void before(){
        dodgems = new Dodgems(3,"Dodgems");
        playGround = new PlayGround(5,"SpongeLand");
        rollerCoaster = new RollerCoaster(5,"Rip & Saw");
        visitor = new Visitor(20,100.00,170);
        giantVisitor = new Visitor(30,400.00,220);
        youngVisitor = new Visitor(11,20.00,145);
        midgetVisitor = new Visitor(30,40,120);


    }

    @Test
    public void canGetRatingDodgems(){
        assertEquals(3,dodgems.getRating());
    }

    @Test
    public void canGetNameDodgems(){
        assertEquals("Dodgems",dodgems.getName());
    }

    @Test
    public void canGetRatingPlaygroud(){
        assertEquals(5,playGround.getRating());
    }

    @Test
    public void canGetNamePlayground(){
        assertEquals("SpongeLand",playGround.getName());
    }

    @Test
    public void canGetRatingRollerCoaster(){
        assertEquals(5,rollerCoaster.getRating());
    }

    @Test
    public void canGetNameRollerCoaster(){
        assertEquals("Rip & Saw",rollerCoaster.getName());
    }

    @Test
    public void ticketNormalRollerCoaster(){
        double result = rollerCoaster.priceForCustomer(visitor);
        assertEquals(8.80,result,.01);
    }

    @Test
    public void ticketTallRollerCoaster(){
        double result = rollerCoaster.priceForCustomer(giantVisitor);
        assertEquals(17.60,result,0.01);
    }


    @Test
    public void ticketNormalDodgems(){
        double result = dodgems.priceForCustomer(visitor);
        assertEquals(4.50,result,.01);
    }

    @Test
    public void ticketTallDodgems(){
        double result = dodgems.priceForCustomer(giantVisitor);
        assertEquals(9.00,result,0.01);
    }

    @Test
    public void checkHeightForRollerCoaster(){
        assertEquals(true,rollerCoaster.isAllowedTo(visitor));
        assertEquals(false,rollerCoaster.isAllowedTo(midgetVisitor));
    }

    @Test
    public void CheckAgeForRollerCoaster(){
        assertEquals(true,rollerCoaster.isAllowedTo(visitor));
        assertEquals(false,rollerCoaster.isAllowedTo(youngVisitor));
    }

    @Test
    public void canVisitPlayground(){
        assertEquals(false,playGround.isAllowedTo(visitor));
    }










}
