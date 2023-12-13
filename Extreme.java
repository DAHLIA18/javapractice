import java.util.Scanner;
public class Extreme{
	public static void main(String[] args){

	Scanner input = new Scanner(Sytem.in);
	
	System.out.print("Enter the number of values: ");
	int count = input.nextInt();

	int min = integer.MAX_VALUE;
	int max = integer.MIN_VALUE;

	for(int i = 0; i < count; i++){
	System.out.print("Enter a number: ");
	int value = input.nextInt()
	if(value < min){
		min = value;
	 }
	 if (value > max){
		max = value;
	}

     }
	int sumOfExtremes = min + max;
	System.out.println("Minimum value:" + min);
	System.out.println("Maximum value:" + max);
		System.out.println("Sum of the extremes:" + sumOfExtremes);
    }

}