import java.util.Scanner;

public class ModifiedDiamondPrinting {

    	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows;

        do {
            System.out.print("Enter an odd number between 1 and 19: ");
            rows = scanner.nextInt();
        } while (rows % 2 == 0 || rows < 1 || rows > 19);

        int midRow = rows / 2 + 1;

        for (int i = 1; i <= rows; i++) {
            int spaces = Math.abs(midRow - i);

            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            int stars = rows - 2 * spaces;
            for (int k = 1; k <= stars; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        scanner.close();
    }
}
