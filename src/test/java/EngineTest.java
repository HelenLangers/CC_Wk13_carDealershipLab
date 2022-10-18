import carcomponents.Engine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    Engine engine;

    @Before
    public void before(){
        engine = new Engine("500cc");
    }

    @Test
    public void hasEngineSize(){
        assertEquals("500cc", engine.getEngineSize());
    }


}
