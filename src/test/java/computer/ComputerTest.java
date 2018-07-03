package computer;

import computer.*;
import computer.input_devices.Keyboard;
import computer.input_devices.Mouse;
import computer.printing_devices.Printer;
import computer.sound_devices.Speaker;
import computer.visual_devices.Monitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ComputerTest {
    Computer computer;
    Monitor monitor;
    Mouse mouse;
    Keyboard keyboard;

    @Before
    public void before() {
        monitor = new Monitor(22, 786432);
        mouse = new Mouse("wireless", 2);
        keyboard = new Keyboard(40);
        computer = new Computer(8, 512, monitor, mouse);
    }

    @Test
    public void hasRam() {
        assertEquals(8, computer.getRam());
    }

    @Test
    public void hasHddSize() {
        assertEquals(512, computer.getHddSize());
    }

    @Test
    public void hasOutputDevice() {
        assertNotNull(computer.getOutputDevice());
    }

    @Test
    public void canOutputData() {
        assertEquals("space invaders is now on screen", computer.outputData("space invaders"));
    }

    @Test
    public void canOutputDataViaPrinter() {
        Printer printer = new Printer("Epson", "Stylus", 120, 4);
        computer = new Computer(8, 512, printer, mouse);
        assertEquals("printing: holiday pictures", computer.outputData("holiday pictures"));
    }

    @Test
    public void canOutputDataViaSpeaker() {
        Speaker speaker = new Speaker(100);
        computer = new Computer(8, 512, speaker, mouse);
        assertEquals("playing: Beep!", computer.outputData("Beep!"));
    }

    @Test
    public void canSetOutputDevice() {
        Printer printer = new Printer("Epson", "Stylus", 120, 4);
        computer.setOutputDevice(printer);
        assertEquals("printing: dissertation", computer.outputData("dissertation"));
    }

    @Test
    public void canOutputDataViaMonitor() {
        Monitor monitor = new Monitor(22, 786432);
        computer = new Computer(8, 512, monitor, mouse);
        assertEquals("space invaders is now on screen", computer.outputData("space invaders"));
    }

    @Test
    public void hasInputDevice(){
        assertNotNull(computer.getInputDevice());
    }

    @Test
    public void canInputDataViaMouse(){
        assertEquals("clicking: submit", computer.inputData("submit"));

    }

    @Test
    public void canInputDataViaKeybaord(){
       computer.setInputDevice(keyboard);
       assertEquals("typing: Hello World", computer.inputData("Hello World"));
    }

    @Test
    public void dataStreamIsInitiallyNull() {
        assertEquals(null, computer.getDataStream());
    }

    @Test
    public void canAddTextToDataStream() {
        computer.inputData("Hello ");
        assertEquals("Hello ", computer.getDataStream());
        computer.inputData("World!");
        assertEquals("Hello World!", computer.getDataStream());
    }

    @Test
    public void canOutputDataStream(){
        computer.inputData("Hello");
        computer.outputDataStream();
        assertEquals("Hello is now on screen", computer.outputDataStream());
        computer.inputData(" World");
        computer.outputDataStream();
        assertEquals("Hello World is now on screen", computer.outputDataStream());
    }
}
