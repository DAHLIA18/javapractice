import java.util.Scanner;
public class CommissionCalculator{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter the number of items sold: ");
        int numberOfItems = input.nextInt();

        double totalSales = 0;

        for (int i = 0; i < numberOfItems; i++) {
            System.out.print("Enter the value of item " + (i + 1) + ": $");
            double itemValue = input.nextDouble();
            totalSales += itemValue;
        }

        double earnings = calculateEarnings(totalSales);

        System.out.println("\nTotal Sales: $" + totalSales);
        System.out.println("Salesperson's Earnings: $" + earnings);

        input.close();
    }

    public static double calculateEarnings(double totalSales) {
        double baseSalary = 200;
        double commission = 0.09 * totalSales;
        return baseSalary + commission;
    }
}
