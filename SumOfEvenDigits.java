import java.util.Scanner;

public class SumOfEvenDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

 
        int sumEvenDigits = 0;

      
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter score " + (i + 1) + ": ");
            int score = input.nextInt();

      
            sumEvenDigits += getSumOfEvenDigits(score);
        }

   
        System.out.println("Sum of even digits from scores: " + sumEvenDigits);

        scanner.close();
    }

  
    private static int getSumOfEvenDigits(int number) {
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                sum += digit;
            }
            number /= 10;
        }
        return sum;
    }
}