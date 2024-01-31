import java.util.Scanner;
public class ReverseDigit{

    public static void main(String[] args) {
	int number = 0;

	while (number < 5) {
    System.out.print("Enter the digit (1-9): ");
    number = input.nextInt();

for (int i = number - 1; i >= 0; i--) {
        System.out.print(i);
    }
}
}