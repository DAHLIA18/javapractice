import java.util.List;

public class ElementChecker {
    public static boolean checkElement(List<Integer> list, int element) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("List is null or empty");
        }

        for (int num : list) {
            if (num == element) {
                return true;
            }
        }

        return false; 
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 3, 5, 7, 9);

        int searchElement = 5;
        boolean found = checkElement(numbers, searchElement);

        if (found) {
            System.out.println(searchElement + " is present in the list.");
        } else {
            System.out.println(searchElement + " is not present in the list.");
        }
    }
}
