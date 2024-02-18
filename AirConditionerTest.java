 import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest {

    @Test
    void testTurnOn() {
        AirConditioner ac = new AirConditioner();
        ac.turnOn();
        assertTrue(ac.isOn());
    }

    @Test
    void testTurnOff() {
        AirConditioner ac = new AirConditioner(true);
        ac.turnOff();
        assertFalse(ac.isOn());
    }

    @Test
    void testIncreaseTemperature() {
        AirConditioner ac = new AirConditioner(true);
        ac.increaseTemperature();
        assertEquals(24, ac.getTemperature());
    }

    @Test
    void testDecreaseTemperature() {
        AirConditioner ac = new AirConditioner(true);
        ac.decreaseTemperature();
        assertEquals(22, ac.getTemperature());
    }

    @Test
    void testSetTemperatureIncrease() {
        AirConditioner ac = new AirConditioner(true);
        ac.setTemperature(30);
        ac.increaseTemperature();
        assertEquals(30, ac.getTemperature());
    }

    @Test
    void testSetTemperatureDecrease() {
        AirConditioner ac = new AirConditioner(true);
        ac.setTemperature(16);
        ac.decreaseTemperature();
        assertEquals(16, ac.getTemperature());
    }
}