import org.junit.Test;
import static org.junit.Assert.*;

public class MenstrualCycleCalculatorTest {

    @Test
    public void testCalculateCycleInformationWithRegularCycle() {
        MenstrualCycleCalculator calculator = new MenstrualCycleCalculator();
        calculator.setAverageCycleLength(28);
        calculator.setStartingDate("2024-01-27");
        calculator.setAge(25);
        calculator.calculateCycleInformation();

        assertNotNull(calculator.getNextPeriodDate());
        assertNotNull(calculator.getOvulationDate());
        assertNotNull(calculator.getSafePeriodStart());
        assertNotNull(calculator.getSafePeriodEnd());
        assertNotNull(calculator.getDisclaimer());

        
    }

    @Test
    public void testCalculateCycleInformationWithLongCycle() {
        MenstrualCycleCalculator calculator = new MenstrualCycleCalculator();
        calculator.setAverageCycleLength(35);
        calculator.setStartingDate("2024-01-27");
        calculator.setAge(30);
        calculator.calculateCycleInformation();

        assertNotNull(calculator.getNextPeriodDate());
        assertNotNull(calculator.getOvulationDate());
        assertNotNull(calculator.getSafePeriodStart());
        assertNotNull(calculator.getSafePeriodEnd());
        assertNotNull(calculator.getDisclaimer());

        // Add more specific assertions based on the expected behavior for a longer cycle
    }

    @Test
    public void testCalculateCycleInformationWithShortCycle() {
        MenstrualCycleCalculator calculator = new MenstrualCycleCalculator();
        calculator.setAverageCycleLength(24);
        calculator.setStartingDate("2024-01-27");
        calculator.setAge(22);
        calculator.calculateCycleInformation();

        assertNotNull(calculator.getNextPeriodDate());
        assertNotNull(calculator.getOvulationDate());
        assertNotNull(calculator.getSafePeriodStart());
        assertNotNull(calculator.getSafePeriodEnd());
        assertNotNull(calculator.getDisclaimer());

    }

    @Test
    public void testCalculateCycleInformationWithIrregularCycle() {
        MenstrualCycleCalculator calculator = new MenstrualCycleCalculator();
        calculator.setAverageCycleLength(28);
        calculator.setStartingDate("2022-01-01");
        calculator.setAge(25);
        // Simulate an irregular cycle by setting a different starting date
        calculator.setStartingDate("2022-02-01");
        calculator.calculateCycleInformation();

        assertNotNull(calculator.getNextPeriodDate());
        assertNotNull(calculator.getOvulationDate());
        assertNotNull(calculator.getSafePeriodStart());
        assertNotNull(calculator.getSafePeriodEnd());
        assertNotNull(calculator.getDisclaimer());

        // Add more specific assertions based on the expected behavior for an irregular cycle
    }

    @Test
    public void testCalculateCycleInformationWithNullInput() {
        MenstrualCycleCalculator calculator = new MenstrualCycleCalculator();
        // Set averageCycleLength to null (invalid input)
        calculator.setAverageCycleLength(null);
        calculator.setStartingDate("2024-01-27");
        calculator.setAge(25);
        calculator.calculateCycleInformation();

        assertNull(calculator.getNextPeriodDate());
        assertNull(calculator.getOvulationDate());
        assertNull(calculator.getSafePeriodStart());
        assertNull(calculator.getSafePeriodEnd());
        assertNotNull(calculator.getDisclaimer());

    }

    @Test
    public void testCalculateCycleInformationWithNegativeCycleLength() {
        MenstrualCycleCalculator calculator = new MenstrualCycleCalculator();
        // Set averageCycleLength to a negative value (invalid input)
        calculator.setAverageCycleLength(-28);
        calculator.setStartingDate("2024-01-27");
        calculator.setAge(25);
        calculator.calculateCycleInformation();

        assertNull(calculator.getNextPeriodDate());
        assertNull(calculator.getOvulationDate());
        assertNull(calculator.getSafePeriodStart());
        assertNull(calculator.getSafePeriodEnd());
        assertNotNull(calculator.getDisclaimer());

    }

    @Test
    public void testCalculateCycleInformationWithEmptyStartingDate() {
        MenstrualCycleCalculator calculator = new MenstrualCycleCalculator();
        calculator.setAverageCycleLength(28);
        calculator.setStartingDate("");
        calculator.setAge(25);
        calculator.calculateCycleInformation();

        assertNull(calculator.getNextPeriodDate());
        assertNull(calculator.getOvulationDate());
        assertNull(calculator.getSafePeriodStart());
        assertNull(calculator.getSafePeriodEnd());
        assertNotNull(calculator.getDisclaimer());

    }

    @Test
    public void testCalculateCycleInformationWithTeenageAge() {
        MenstrualCycleCalculator calculator = new MenstrualCycleCalculator();
        calculator.setAverageCycleLength(28);
        calculator.setStartingDate("2024-01-27");
        calculator.setAge(16);
        calculator.calculateCycleInformation();

        assertNotNull(calculator.getNextPeriodDate());
        assertNotNull(calculator.getOvulationDate());
        assertNotNull(calculator.getSafePeriodStart());
        assertNotNull(calculator.getSafePeriodEnd());
        assertNotNull(calculator.getDisclaimer());

    }

    @Test
    public void testCalculateCycleInformationWithMiddleAge() {
        MenstrualCycleCalculator calculator = new MenstrualCycleCalculator();
        calculator.setAverageCycleLength(28);
        calculator.setStartingDate("2024-01-27");
        calculator.setAge(35);
        calculator.calculateCycleInformation();

        assertNotNull(calculator.getNextPeriodDate());
        assertNotNull(calculator.getOvulationDate());
        assertNotNull(calculator.getSafePeriodStart());
        assertNotNull(calculator.getSafePeriodEnd());
        assertNotNull(calculator.getDisclaimer());

    }

    @Test
    public void testCalculateCycleInformationWithSeniorAge() {
        MenstrualCycleCalculator calculator = new MenstrualCycleCalculator();
        calculator.setAverageCycleLength(28);
        calculator.setStartingDate("2024-01-27");
        calculator.setAge(60);
        calculator.calculateCycleInformation();

        assertNotNull(calculator.getNextPeriodDate());
        assertNotNull(calculator.getOvulationDate());
        assertNotNull(calculator.getSafePeriodStart());
        assertNotNull(calculator.getSafePeriodEnd());
        assertNotNull(calculator.getDisclamier());