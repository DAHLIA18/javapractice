import java.util.Scanner;
public class IntegerAnalyzer{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

		int number1, number2, number3, number4, number5;
		int largest, smallest;

		System.out.print("Enter first integer: ");
		number1 = input.nextInt();

		System.out.print("Enter second integer: ");
		number2 = input.nextInt();

		System.out.print("Enter third integer: ");
		number3 = input.nextInt();

		System.out.print("Enter fourth integer: ");
		number4 = input.nextInt();

		System.out.print("Enter fifth integer: ");
		number5 = input.nextInt();

		largest = number1;
		if (number2 > largest)
			largest = number2;
		if (number3 > largest)
			largest = number3;
		if (number4 > largest)
			largest = number4;
		if (number5 > largest)
			largest = number5;

		smallest = number1;
		if (number2 < smallest)
			smallest = number2;
		if (number3 < smallest)
			smallest = number3;
		if (number4 < smallest)
			smallest = number4;
		if (number5 < smallest)
			smallest = number5;

		System.out.printf("Largest is %d%n", largest);
		System.out.printf("Smallest is %d%n", smallest);
        }

}




































































































































































































































