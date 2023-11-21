import java.util.Scanner;
public class Values{

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

		System.out.print("Enter first integer: ");
		int number1 = input.nextInt();

		System.out.print("Enter second integer: ");
		int number2 = input.nextInt();

		System.out.print("Enter third integer: ");
		int number3 = input.nextInt();

		System.out.print("Enter fourth integer: ");
		int number4 = input.nextInt();

		System.out.print("Enter fifth integer: ");
		int number5 = input.nextInt();
		input.close();

		int negatives = 0, positives = 0, zeros = 0;

		if (number1 == 0)
			zeros++;
		if (number2 == 0)
			zeros++;
		if (number3 == 0)
			zeros++;
		if (number4 == 0)
			zeros++;
		if (number5 == 0)
			zeros++;

		if (number1 < 0)
			negatives++;
		if (number2 < 0)
			negatives++;
		if (number3 < 0)
			negatives++;
		if (number4 < 0)
			negatives++;
		if (number5 < 0)
			negatives++;

		if (number1 > 0)
			positives++;
		if (number2 > 0)
			positives++;
		if (number3 > 0)
			positives++;
		if (number4 > 0)
			positives++;
		if (number5 > 0)
			positives++;

		System.out.println("Number of positives: " + positives);
		System.out.println("Number os negatives: " + negatives);
		System.out.println("Number of zeros: " + zeros);


       }



}