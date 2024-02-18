import java.util.Scanner;

public class ScoreCollector {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

   
     int sum = 0;

     
        for (int number = 1; number <= 10; number++) {
            System.out.print("Enter score " + number + ": ");
            int score = input.nextInt();

          
            sum += score;
        }

       
        System.out.println("Sum of the scores: " + sum);

        scanner.close();
    }
}