import java.util.Scanner;
public class Bmi{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Input weight in pounds:");	
	double weight = input.nextDouble();
	double constant1 = 0.4535927;
	double result1 = weight * constant1;
	System.out.printf("%.2f in pounds to kilogram is: %.6f%n",kilogram);
	  
	System.out.print("Input  height in inches:");
	double height = input.nextDouble();
	double constant2 = 0.0254;
	double result2 = height * constant2;
	System.out.printf("%.2f in inches to meters is: %.6f%n",meters);

	double bmi = (weight/height * height) * 703; 
	System.out.printf("the Bmi is %d%n ",bmi);
	}

   
}