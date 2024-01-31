import java.util.Scanner;
public class MultiplicationTable{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	int number = 0;
	System.out.print("Enter a number :");
	number = input.nextInt();

	for (int i = 1; i <= 10; i++);
	for (int j = 1; j <= 10; j++) {
    System.out.print(number * j + " * ");
}
System.out.println();

}
}