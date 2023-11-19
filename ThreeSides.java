import java.util.Scanner;

public class ThreeSides{
	public static void main(String[] args){


	Scanner input = new Scanner(System.in);
	double side1 = input.nextDouble();
	double side2 = input.nextDouble();
	double side3 = input.nextDouble();

	if (side1 + side2 < side3){
	System.out.println("Input is invalid. Try again.");
	}else if (side3 + side2 < side1){ 
	System.out.println("Input is invalid. Try again.");
	}else if (side2 + side3 < side1){
	System.out.println("Input is invalid. Try again.");
	}

	double perimeter = side1 + side2 + side3;

	System.out.println("Perimeter of the triangle is" + perimeter);


	}


}