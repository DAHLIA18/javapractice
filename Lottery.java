import java.util.Scanner;
import java.util.Random;

public class Lottery {
        public static void main(String[] args) {
        Random random = new Random();
        int threeDigit = random.nextInt(1000);

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your three-digit number: ");
        int guess = input.nextInt();

        String message = (guess == threeDigit) ? "Congratulations! You won the Lottery." : "Sorry, you lose. Please try again later.";
        System.out.println(message);
    }
}
