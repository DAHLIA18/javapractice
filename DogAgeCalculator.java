import java.util.Scanner;

public class DogAgeCalculator {
       public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a dog's age in human years: ");
        int humanYears = input.nextInt();
        int dogYears;

        if (humanYears <= 2) {
            dogYears = (int) (humanYears * 10.5);
        } else {
            dogYears = 21 + (humanYears - 2) * 4;
        }
        System.out.println("The dog's age in dog's years is " + dogYears);
    }
}