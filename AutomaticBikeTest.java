import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AutomaticBikeTest {

    @Test
    void testTurnOn() {
        AutomaticBike bike = new AutomaticBike();
        bike.turnOn();
        assertTrue(bike.isOn());
    }

    @Test
    void testTurnOff() {
        AutomaticBike bike = new AutomaticBike();
        bike.turnOff();
        assertFalse(bike.isOn());
    }

    @Test
    void testAccelerateGear1() {
        AutomaticBike bike = new AutomaticBike();
        bike.setGear(1);
        bike.accelerate();
        assertEquals(1, bike.getCurrentSpeed());
    }

    @Test
    void testAccelerateGear2() {
        AutomaticBike bike = new AutomaticBike();
        bike.setGear(2);
        bike.accelerate();
        assertEquals(2, bike.getCurrentSpeed());
    }

    @Test
    void testAccelerateGear3() {
        AutomaticBike bike = new AutomaticBike();
        bike.setGear(3);
        bike.accelerate();
        assertEquals(3, bike.getCurrentSpeed());
    }

    @Test
    void testAccelerateGear4() {
        AutomaticBike bike = new AutomaticBike();
        bike.setGear(4);
        bike.accelerate();
        assertEquals(4, bike.getCurrentSpeed());
    }

    @Test
    void testDecelerateGear1() {
        AutomaticBike bike = new AutomaticBike();
        bike.setGear(1);
        bike.setCurrentSpeed(5);
        bike.decelerate();
        assertEquals(4, bike.getCurrentSpeed());
    }

    @Test
    void testDecelerateGear2() {
        AutomaticBike bike = new AutomaticBike();
        bike.setGear(2);
        bike.setCurrentSpeed(10);
        bike.decelerate();
        assertEquals(8, bike.getCurrentSpeed());
    }

    @Test
    void testDecelerateGear3() {
        AutomaticBike bike = new AutomaticBike();
        bike.setGear(3);
        bike.setCurrentSpeed(15);
        bike.decelerate();
        assertEquals(12, bike.getCurrentSpeed());
    }

    @Test
    void testDecelerateGear4() {
        AutomaticBike bike = new AutomaticBike();
        bike.setGear(4);
        bike.setCurrentSpeed(20);
        bike.decelerate();
        assertEquals(16, bike.getCurrentSpeed());
    }

    @Test
    void testAutomaticGearChange() {
        AutomaticBike bike = new AutomaticBike();
        bike.setGear(1);
        bike.setCurrentSpeed(21);
        assertEquals(2, bike.getCurrentGear());
    }
}