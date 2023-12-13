import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a five-digit integer: ");
        int number = input.nextInt();
        while (number < 10000 || number > 99999) {
            System.out.print("Invalid input. Enter a five-digit integer: ");
            number = input.nextInt();
        }
        input.close();
     
        boolean isPalindrome = true;
       
        int first = number / 10000;
        int last = number % 10;
     
        if (first != last) {
            isPalindrome = false;
        }
     
        int second = (number / 1000) % 10;
        int fourth = (number / 10) % 10;
        if (second != fourth) {
            isPalindrome = false;
        }
   
        if (isPalindrome) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }
}