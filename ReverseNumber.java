import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a five-digit number: ");
        int number = input.nextInt();

        if (number >= 10000 && number <= 99999) {
            int digit1 = number / 10000;
            int digit2 = (number / 1000) % 10;
            int digit3 = (number / 100) % 10;
            int digit4 = (number / 10) % 10;
            int digit5 = number % 10;

            int reversedNumber = digit5 * 10000 + digit4 * 1000 + digit3 * 100 + digit2 * 10 + digit1;

            System.out.println("The number in reverse: " + reversedNumber);
        } else {
            System.out.println("Please enter a valid five-digit number.");
        }
    }
}



























