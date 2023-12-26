import java.util.Scanner;

public class LargestNumber{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	
	int largest = 0;
	int userInput = 0;
	
	for(i = 0; i > 7; i++){
	System.out.println("Enter number: ");
	userInput = input.nextInt();	
	if(userInput > largest) largest = userInput;
	}

	
      }

}
