import device_management.Keyboard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KeyboardTest {

    Keyboard keyboard;

    @Before
    public void before() {
        keyboard = new Keyboard(40);
    }

    @Test
    public void canGetNumberOfKeys() {
        assertEquals(40, keyboard.getNumberOfKeys());
    }

}
