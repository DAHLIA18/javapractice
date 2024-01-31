import java.util.Scanner;
public class Multiples{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	
	int number1, number2;
	int tripledFirstNumber, doubledSecondNumber;
	
	System.out.print("Enter first number: ");
	number1 = input.nextInt();

	System.out.print("Enter second number: ");
	number2 = input.nextInt();

	tripledFirstNumber = number1 * 3;
	doubledSecondNumber = number2 * 2;

	if (tripledFirstNumber % doubledSecondNumber == 0) System.out.println("Reults: " + The tripled first number +  "is a multiple of the doubled second number");
	
   }


}

System.out.print(number * j + " * ");
}