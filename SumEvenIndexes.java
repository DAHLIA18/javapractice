import java.util.Scanner;

public class SumEvenIndexes {
    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);

       
        int sumEvenIndexes = 0;

      
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter score " + (i + 1) + ": ");
            int score = input.nextInt();

           
            if (i % 2 == 0) {
            
                sumEvenIndexes += score;
            }
        }

  
        System.out.println("Sum of scores at even indexes: " + sumEvenIndexes);

        scanner.close();
    }
}