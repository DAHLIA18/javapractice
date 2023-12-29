import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RunningTotalTest {

    @Test
    public void testComputeRunningTotal_EmptyList() {
        List<Integer> emptyList = new ArrayList<>();
        int expectedResult = 0;
        int actualResult = RunningTotal.computeRunningTotal(emptyList);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testComputeRunningTotal_SingleElement() {
        List<Integer> singleElementList = Arrays.asList(5);
        int expectedResult = 5;
        int actualResult = RunningTotal.computeRunningTotal(singleElementList);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testComputeRunningTotal_MultipleElements() {
        List<Integer> multipleElementList = Arrays.asList(1, 2, 3, 4, 5);
        int expectedResult = 15;
        int actualResult = RunningTotal.computeRunningTotal(multipleElementList);
        assertEquals(expectedResult, actualResult);
    }

  
}
