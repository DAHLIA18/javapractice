import java.util.Scanner;

public class GlobalWarmingQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       
        String question1 = "1. What is the primary greenhouse gas emitted by human activities?";
        String question2 = "2. What is the main cause of the melting of polar ice caps?";
        String question3 = "3. What is the consensus among scientists regarding the primary cause of global warming?";
        String question4 = "4. Which of the following is a potential consequence of global warming?";
        String question5 = "5. What are some proposed solutions to mitigate global warming?";

        
        String options1 = "1. Carbon Dioxide, 2. Methane, 3. Nitrous Oxide, 4. All of the above";
        String options2 = "1. Deforestation, 2. Industrial emissions, 3. Solar radiation, 4. All of the above";
        String options3 = "1. Human activities, 2. Natural climate variability, 3. Combination of both, 4. None of the above";
        String options4 = "1. Sea level rise, 2. Increased frequency of extreme weather events, 3. Biodiversity loss, 4. All of the above";
        String options5 = "1. Renewable energy adoption, 2. Afforestation, 3. Carbon capture and storage, 4. All of the above";

    
        int correctAnswer1 = 1;
        int correctAnswer2 = 4;
        int correctAnswer3 = 3;
        int correctAnswer4 = 4;
        int correctAnswer5 = 4;

      
        int score = 0;
        int userAnswer;

        System.out.println(question1);
        System.out.println(options1);
        System.out.print("Enter your choice (1-4): ");
        userAnswer = input.nextInt();
        if (userAnswer == correctAnswer1) {
            score++;
        }

        System.out.println(question2);
        System.out.println(options2);
        System.out.print("Enter your choice (1-4): ");
        userAnswer = input.nextInt();
        if (userAnswer == correctAnswer2) {
            score++;
        }

        System.out.println(question3);
        System.out.println(options3);
        System.out.print("Enter your choice (1-4): ");
        userAnswer = input.nextInt();
        if (userAnswer == correctAnswer3) {
            score++;
        }

        System.out.println(question4);
        System.out.println(options4);
        System.out.print("Enter your choice (1-4): ");
        userAnswer = input.nextInt();
        if (userAnswer == correctAnswer4) {
            score++;
        }

        System.out.println(question5);
        System.out.println(options5);
        System.out.print("Enter your choice (1-4): ");
        userAnswer = input.nextInt();
        if (userAnswer == correctAnswer5) {
            score++;
        }

   
        System.out.println("Quiz complete. Your score is: " + score);
        if (score == 5) {
            System.out.println("Excellent");
        } else if (score == 4) {
            System.out.println("Very good");
        } else {
            System.out.println("Time to brush up on your knowledge of global warming");
        }

 
        System.out.println("For further reading, you can visit: [List of websites]");
    }
}