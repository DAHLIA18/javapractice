import java.util.Scanner;

public class RightAngledTriangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the base of a triangle (1-10): ");
        int base = input.nextInt();
        // Validate the input
        while (base < 1 || base > 10) {
            System.out.print("Invalid input. Enter a number between 1 and 10: ");
            base = input.nextInt();
        }
        input.close();
        // Draw the triangle using nested loops
        for (int row = 1; row <= base; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}