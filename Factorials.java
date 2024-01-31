import java.util.Scanner;

public class Factorials {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a positive Value btw 1 and 20: ");
        int value = input.nextInt();
       
        if (value < 1 || value > 20) {
            System.out.println("Invalid input. Please enter a value between 1 and 20.");
            return;
        }
        
        long factorial = 1;
        for (int number = 1; number <= value; number++) {
            factorial *= number;
        }
        
        System.out.println("The factorial of " + value + " is: " + factorial);
    }
}