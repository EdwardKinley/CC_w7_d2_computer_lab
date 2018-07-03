import device_management.Mouse;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MouseTest {

    Mouse mouse;

    @Before
    public void before(){
        mouse = new Mouse("wireless", 2);
    }

    @Test
    public void canGetType(){
        assertEquals("wireless", mouse.getType());
    }

    @Test
    public void canGetNumberOfButtons(){
        assertEquals(2, mouse.getNumberOfButtons());
    }

    @Test
    public void canSendData(){
        assertEquals("clicking: submit", mouse.sendData("submit"));
    }
}
