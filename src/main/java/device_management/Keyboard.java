package device_management;

import behaviours.IInput;

public class Keyboard implements IInput {

    private int numberOfKeys;

    public Keyboard(int numberOfKeys) {
        this.numberOfKeys = numberOfKeys;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }
}
