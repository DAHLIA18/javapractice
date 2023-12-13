import java.util.Scanner;
public class TaxCalculator{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.println("Enter details for citizen " + i + ":");

            System.out.print("Enter citizen's name: ");
            String name = input.nextLine();

            System.out.print("Enter earnings for the year: $");
            double earnings = input.nextDouble();

            double totalTax = calculateTax(earnings);
            System.out.println(name + "'s total tax for the year: $" + totalTax);
            input.nextLine();
        }
    }

    public static double calculateTax(double earnings) {
        double taxRateFirstBracket = 0.15;
        double taxRateSecondBracket = 0.20;
        double ceiling = 30000;
        
        if (earnings <= ceiling) {
            return earnings * taxRateFirstBracket;
        } else {
            double taxForFirstBracket = ceiling * taxRateFirstBracket;
            double remainingEarnings = earnings - ceiling;
            return taxForFirstBracket + (remainingEarnings * taxRateSecondBracket);
        }
    }
}

