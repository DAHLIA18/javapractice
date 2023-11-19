import java.util.Scanner;
import java.lang.Math; 

public class SideOfACoin{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	
	int coin = (int)(Math.random() * 2);
	

	System.out.print("Enter a guess 0-head or 1-tail: ");
	int guess = input.nextInt();

	System.out.println(((guess == coin)? "correct": "incorrect") + "guess.");
    }
}