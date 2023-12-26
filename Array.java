import java.util.Scanner;
public class Array{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	int sum = 0;
	int count = 0;

	System.out.println("Enter numbers");
	int numberOfNumbers = input.nextInt();
	int[] numbers = new int[numberOfNumbers];

	while(count < numbers.length){
	System.out.println("Enter number");
	numbers[count] = input.nextInt();
	sum = sum + numbers[count];
	count++;
	}

	System.out.print("The sum of: ");
	
	for(int number: numbers){
	System.out.print(number + " ");
	}
	System.out.printf("is %d%n", sum);

    }


}