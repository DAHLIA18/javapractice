import java.util.Scanner;

public class ScoreSumAndAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

   
        int sum = 0;
        int count = 0;

        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter score " + i + ": ");
            int score = input.nextInt();

        
            sum += score;
       
            count++;
        }

  
        double average = (double) sum / count;

        System.out.println("Sum of the scores: " + sum);
        System.out.println("Average of the scores: " + average);

        scanner.close();
    }
}