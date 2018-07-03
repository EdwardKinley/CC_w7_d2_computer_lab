package computer.input_devices;

import behaviours.IInput;

public class Mouse implements IInput {

    private String type;
    private int numberOfButtons;

    public Mouse(String type, int numberOfButtons){
        this.type = type;
        this.numberOfButtons = numberOfButtons;
    }

    public String getType() {
        return type;
    }

    public int getNumberOfButtons() {
        return numberOfButtons;
    }

    @Override
    public String sendData(String data) {
        return "clicking: " + data;
    }
}
