import java.util.Scanner;

public class Display{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number:");

	int number1 = input.nextInt();
	if (number1 == 1) {
    System.out.println("  0 ");
}
	if (number1 == 0) {
    System.out.println(" 1 ");
}

}
}