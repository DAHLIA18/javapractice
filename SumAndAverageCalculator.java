import java.util.Scanner;

public class SumAndAverageCalculator {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int totalSum = 0;

        while (true) {
            System.out.print("Enter an integer number (enter 0 to finish): ");
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            totalSum += num;
            count++;
        }

        if (count == 0) {
            System.out.println("No numbers to calculate.");
        } else {
            double average = (double) totalSum / count;
            System.out.println("Sum of the numbers: " + totalSum);
            System.out.println("Average of the numbers: " + average);
        }
    }
}