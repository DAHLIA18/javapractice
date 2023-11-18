import java.util.Scanner;

public class ComparingInteger{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number: ");
	int number = input.nextInt();
	
	int numberSquare = number * number;
	int sumNumberSquare = numberSquare + number;
	
	if (sumNumberSquare > 100){ 
		System.out.printf("%d > 100%n ", sumNumberSquare);
	}  
	
	if (sumNumberSquare == 100){
		System.out.printf("%d == 100%n", sumNumberSquare);
	}

	if (sumNumberSquare != 100){
		System.out.printf("%d != 100%n", sumNumberSquare);
	}

	if (sumNumberSquare < 100){
		System.out.printf("%d < 100%n",sumNumberSquare);
	}


}

}