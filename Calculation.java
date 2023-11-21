import java.util.Scanner;
import java.lang.Math;

public class Calculation{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.println("Enter the radius of the circle: ");
	int radius = input.nextInt();

	System.out.printf("Diameter is %d%n", radius * 2);

	System.out.printf("Circumference is %f%n", 2 * Math.PI * radius);
	
	System.out.printf("Area is %f%n", Math.PI * (radius * radius));
   }


}