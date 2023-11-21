import java.util.Scanner;
public class Seperating{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);


	System.out.printf("Enter a five-digit integer: ");
	int number = input.nextInt();


		int digit1 = number % 10;
		number /= 10;
		int digit2 = number % 10;
		number /= 10;
		int digit3 = number % 10;
		number /= 10;
		int digit4 = number % 10;
		number /= 10;
		int digit5 = number % 10;
		number /= 10;
		System.out.printf("%d   %d   %d   %d   %d%n", digit5, digit4, digit3, digit2, digit1);

       }



}