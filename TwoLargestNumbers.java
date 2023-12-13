import java.util.Scanner;

public class TwoLargestNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int counter = 1;
        int largest1 = Integer.MIN_VALUE;
        int largest2 = Integer.MIN_VALUE;

        while (counter <= 10) {
            System.out.print("Enter number " + counter + ": ");
            int number = input.nextInt();

            if (number > largest1) {
                largest2 = largest1;
                largest1 = number;
            } else if (number > largest2 && number != largest1) {
                largest2 = number;
            }

            counter++;
        }

        System.out.println("The largest number is: " + largest1);
        System.out.println("The second largest number is: " + largest2);
    }
}
