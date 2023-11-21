import java.util.Scanner;
public class Divisible{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	
	int number;

	System.out.print("Enter a number: ");
	number = input.nextInt();

	if ( number % 3 == 0){ 
	   System.out.println("The number is divisible by 3.");
	}else { 
	System.out.println("The number is not divisible by 3.");
	}

	System.out.println("Results: " + number + "is/is not divisible by 3");
     }

}