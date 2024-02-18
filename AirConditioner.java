public class AirConditioner {
    private boolean isOn;
    private int temperature;

    public AirConditioner() {
        this.isOn = false;
        this.temperature = 22; // Default temperature
    }

    public AirConditioner(boolean isOn) {
        this.isOn = isOn;
        this.temperature = 22; // Default temperature
    }

    public boolean isOn() {
        return isOn;
    }

    public int getTemperature() {
        return temperature;
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public void increaseTemperature() {
        if (isOn && temperature < 30) {
            temperature++;
        }
    }

    public void decreaseTemperature() {
        if (isOn && temperature > 16) {
            temperature--;
        }
    }

    public void setTemperature(int temperature) {
        if (isOn && temperature >= 16 && temperature <= 30) {
            this.temperature = temperature;
        }
    }
}