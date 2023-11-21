import java.util.Scanner;
public class Bmi1{

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

		double weightInKilograms;
		double heightInMeters;
		double bmi;

		System.out.print("Enter your weight (in kilograms): ");
		weightInKilograms = input.nextDouble();

		System.out.print("Enter your height (in meters): ");
		heightInMeters = input.nextDouble();


		bmi = weightInKilograms / (heightInMeters * heightInMeters);

		System.out.printf("%nYour BMI is %,.2f%n%n", bmi);

		System.out.println("BMI Categories:\r\n" + "Underweight =< 18.5\r\n" + "Normal weight = 18.5 24.9\r\n"
				+ "Overweight = 25 29.9\r\n" + "Obesity = BMI of 30 or greater");

	}


}