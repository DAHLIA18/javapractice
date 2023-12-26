import java.util.List;

public class PrintOddPositions {
    public static void printOddPositions(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("List is null or empty");
        }

        for (int i = 0; i < list.size(); i++) {
            if (i % 2 != 0) {
                System.out.println("Element at position " + i + ": " + list.get(i));
            }
        }
    }

    public static void main(String[] args) {
       
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

       
        printOddPositions(numbers);
    }
}
