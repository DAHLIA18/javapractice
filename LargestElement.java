import java.util.List;

public class LargestElement {
    public static int findLargest(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("List is null or empty");
        }

        int largest = list.get(0); // Assume the first element is the largest

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > largest) {
                largest = list.get(i);
            }
        }

        return largest;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 45, 7, 23, 56, 81);
        int largestNumber = findLargest(numbers);
        System.out.println("The largest number is: " + largestNumber);
    }
}
