import java.util.Scanner;

public class DisplayInOrder{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first value: ");
        int value1 = input.nextInt();

	System.out.print("Enter second value: ");
        int value2 = input.nextInt();

	System.out.print("Enter third value: ");
        int value3 = input.nextInt();

        if (value1 > value2) {
            int temp = value1;
            value1 = value2;
            value2 = temp;
        }

        if (value2 > value3) {
            int temp = value2;
            value2 = value3;
            value3 = temp;
        }

        if (value1 > value2) {
            int temp = value1;
            value1 = value2;
            value2 = temp;
        }

        System.out.printf("%n %d %n %d %n %d" , value1 ,value2 , value3);
	}
}