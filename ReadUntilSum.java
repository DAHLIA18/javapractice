import java.util.Scanner;

public class ReadUntilSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a target number: ");
        int target = scanner.nextInt();

        int sum = 0;
        int count = 0;

        while (sum < target) {
            System.out.print("Enter an integer: ");
            int num = scanner.nextInt();

            sum += num;
            count++;
        }

        System.out.println("The sum has reached or exceeded the target value.");
        System.out.println("Total numbers entered: " + count);

        scanner.close();
    }
}
