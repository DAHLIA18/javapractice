import java.util.Scanner;
public class LargestNumberFinder{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	int counter = 1;
	int largest = 0;

        while (counter <= 10) {
            System.out.print("Enter number " + counter + ": ");
            int number = input.nextInt();

            if (counter == 1) {
                largest = number;
            } else if (number > largest) {
                largest = number;
            }

            counter++;
        }

        System.out.println("The largest number is: " + largest);
    }
}
