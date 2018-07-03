package device_management;

public abstract class SoundDevice {
    int maxVolume;

    public SoundDevice(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMaxVolume() {
        return this.maxVolume;
    }

    public String playSound(String sound) {
        return "playing: " + sound;
    }
}
