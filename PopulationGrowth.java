import java.util.Scanner;

public class PopulationGrowth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the current world population: ");
        double currentPopulation = input.nextDouble();

        System.out.print("Enter the annual world population growth rate (in percentage): ");
        double growthRate = input.nextDouble();

        double population = currentPopulation;
        int year = 0;
        while (population < 2 * currentPopulation) {
            population = population * (1 + growthRate / 100);
            year++;
        }
        System.out.println("The world population will double in " + year + " years.");
    }
}