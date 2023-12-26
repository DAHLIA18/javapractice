import java.util.List;

public class SumOfNumbers {
    public static int sumWithForLoop(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("List is null or empty");
        }

        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        return sum;
    }
    public static int sumWithWhileLoop(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("List is null or empty");
        }

        int sum = 0;
        int i = 0;
        while (i < list.size()) {
            sum += list.get(i);
            i++;
        }
        return sum;
    }
    public static int sumWithDoWhileLoop(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("List is null or empty");
        }

        int sum = 0;
        int i = 0;
        do {
            sum += list.get(i);
            i++;
        } while (i < list.size());
        return sum;
    }

    public static void main(String[] args) {
       
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

       
        System.out.println("Sum using for loop: " + sumWithForLoop(numbers));
        System.out.println("Sum using while loop: " + sumWithWhileLoop(numbers));
        System.out.println("Sum using do-while loop: " + sumWithDoWhileLoop(numbers));
    }
}
