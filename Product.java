import java.util.Scanner;
public class Product{

	public static void main(String[] args){ 
Scanner input = new Scanner(System.in);

	System.out.print("Enter first value: ");
 	int value1 = input.nextInt();

	System.out.print("Enter second value: ");
	int value2 = input.nextInt();

	int totalValue = number(value1 , value2);
	System.out.println(totalValue);
}
public static int number(int value1, int value2){
	int result = 0;
	for(int count = 0; count < value2; count++){
	result += value1;
    }
	return result;
}
}
