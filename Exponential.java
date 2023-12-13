import java.util.Scanner;

public class Exponential {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of x: ");

        double x = input.nextDouble();
        System.out.print("Enter the number of terms for estimation: ");
        int n = input.nextInt();

        double result = 1.0;
        double factorial = 1.0;
        double power = 1.0;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
            power *= x;
            result += power / factorial;
        }
        System.out.println("Estimation of e^x: " + result);
    }
}