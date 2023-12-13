import java.util.Scanner;

public class NumberComparator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();

        int result = compareNumbers(number1, number2);

        System.out.println("Comparison result: " + result);

        scanner.close();
    }

    public static int compareNumbers(int number1, int number2) {
        if (number1 == number2) {
            return 0;
        } else if (number1 > number2) {
            return 1;
        } else {
            return -1;
        }
    }
}
