import java.util.Scanner;
import java.security.SecuredRandom;
public class RandomNumber{
     public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    SecuredRandom random = new SecuredRandom();
    int randomNumber = random.nextInt(1, 11);

   System.out.print("Enter a guess number: ");
    int guess = input.nextInt();

if(guess == randomNumber){
    System.out.println("Correct:random number is " + randomNumber + " and your guess is " + guess);
     }else if (guess > randomNumber){
     System.out.print("Too low:random number is " + randomNumber + " and your guess is " + guess);
      }else{
     System.out.print("Too high:random number is " + randomNumber + " and your guess is " + guess);

    }

}

}  