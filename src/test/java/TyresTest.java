import carcomponents.Tyres;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TyresTest {

    Tyres tyres;

    @Before
    public void before(){
        tyres = new Tyres(4, "Kevlar");
    }

    @Test
    public void hasFourTyres(){
        assertEquals(4, tyres.getNumberOfTyres());
    }

    @Test
    public void hasCompound(){
        assertEquals("Kevlar", tyres.getCompound());
    }
}
