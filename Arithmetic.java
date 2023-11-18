import java.util.Scanner;
   
public class Arithmetic{
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);

	System.out.println("Enter first integer:");
	int number1 = input.nextInt();
	
	System.out.println("Enter second integer:");
	int number2 = input.nextInt();

	int firstNumberSquare = number1 * number1;
	int SecondNumberSquare = number2 * number2;

	int sumOfSquares = firstNumberSquare + SecondNumberSquare;
	int differenceOfSquare = firstNumberSquare - SecondNumberSquare;
	
	System.out.printf("the first Number Square %d%n", firstNumberSquare);
	System.out.printf("the Second Number Square %d%n",SecondNumberSquare);
	System.out.printf("the sum Of Squares %d%n",sumOfSquares);
	System.out.printf("the difference Of Squares %d",differenceOfSquare);
}
}   