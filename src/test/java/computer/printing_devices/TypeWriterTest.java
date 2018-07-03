package computer.printing_devices;

import computer.printing_devices.TypeWriter;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TypeWriterTest {

    TypeWriter typeWriter;

    @Before
    public void before() {
        typeWriter = new TypeWriter("Olivetti", "Lettera");
    }

    @Test
    public void hasMake() {
        assertEquals("Olivetti", typeWriter.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("Lettera", typeWriter.getModel());
    }
}
