import java.util.Scanner;

public class ValidateInput {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int option = 0;

        while (option != 1 && option != 2) {
            System.out.println("Enter 1 or 2:");
            while (!input.hasNextInt()) {
                System.out.println("Please enter a valid number (1 or 2):");
                input.next(); // Consume the invalid input
            }
            option = input.nextInt();

            if (option != 1 && option != 2) {
                System.out.println("Invalid input. Please enter 1 or 2.");
            }
        }

        System.out.println("You entered: " + option);

        input.close();
    }
}
