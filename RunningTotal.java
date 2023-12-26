import java.util.ArrayList;
import java.util.List;

public class RunningTotal {
    public static List<Integer> computeRunningTotal(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("List is null or empty");
        }

        List<Integer> runningTotal = new ArrayList<>();
        int sum = 0;

        for (int num : list) {
            sum += num;
            runningTotal.add(sum);
        }

        return runningTotal;
    }

    public static void main(String[] args) {
        
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        List<Integer> runningTotal = computeRunningTotal(numbers);
        System.out.println("Running total: " + runningTotal);
    }
}
