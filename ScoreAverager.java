import java.util.Scanner;

public class ScoreAverager {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    
        int sum = 0;

   
        for (int number = 1; number <= 10; number++) {
            System.out.print("Enter score " + number + ": ");
            int score = input.nextInt();

        
            sum += score;
        }

   
        double average = (double) sum / 10;

     
        System.out.println("Average of the scores: " + average);

        scanner.close();
    }
}