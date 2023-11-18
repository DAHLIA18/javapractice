import java.util.Scanner;

public class ScissorRockPaper{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.println("Enter player one name: ");
	String playerOneName = input.nextLine();

	System.out.println("Enter player two name: ");
	String playerTwoName = input.nextLine();

	System.out.println("Jennifer enter a number 0, 1 or 2: ");
	System.out.println("Kay bee enter a number 0, 1 or 2: ");

	int Jennifer = input.nextInt();
	int Kaybee = input.nextInt();

	if (Jennifer == Kaybee){
	System.out.print("it's a draw!");
	}else if (Jennifer > Kaybee){
	System.out.print("Jennifer Won Kaybee!! ");
	}else {System.out.print("Kaybee Won Jennifer!! ");
	}

    }

}