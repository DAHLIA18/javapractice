import org.junit.Test;
import static org.junit.Assert.*;

public class DigitExtractorTest {

    @Test
    public void testDigitExtraction() {
        int number = 2342;
        List<Integer> expectedDigits = new ArrayList<>();
        expectedDigits.add(2);
        expectedDigits.add(3);
        expectedDigits.add(4);
        expectedDigits.add(2);
        assertEquals(expectedDigits, DigitExtractor.extractDigits(number));

        int singleDigitNumber = 7;
        List<Integer> expectedSingleDigit = new ArrayList<>();
        expectedSingleDigit.add(7);
        assertEquals(expectedSingleDigit, DigitExtractor.extractDigits(singleDigitNumber));

        int zeroNumber = 0;
        List<Integer> expectedZero = new ArrayList<>();
        expectedZero.add(0);
        assertEquals(expectedZero, DigitExtractor.extractDigits(zeroNumber));

        int negativeNumber = -123;
        List<Integer> expectedNegative = new ArrayList<>();
        expectedNegative.add(1);
        expectedNegative.add(2);
        expectedNegative.add(3);
        assertEquals(expectedNegative, DigitExtractor.extractDigits(negativeNumber));
    }
}
