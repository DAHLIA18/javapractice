import java.util.Scanner;
public class Ayear{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	System.out.print("Enter an integer from 1 to 12: ");
	int number = input.nextInt();

	String monthName = "";
	if (number == 1){ 
	System.out.print("January");
	}

	if (number == 2){
	System.out.print("Feburuary");
	}

	if (number == 3){
	System.out.print("March");
	}

	if (number == 4){
	System.out.print("April");
	}

	if (number == 5){
	System.out.print("May");
	}

	if (number == 6){
	System.out.print("June");
	}

	if (number == 7){
	System.out.print("July");
	}

	if (number == 8){
	System.out.print("August");
	}

	if (number == 9){
	System.out.print("September");
	}

	if (number == 10){
	System.out.print("October");
	}

	if (number == 11){
	System.out.print("November");
	}

	if (number == 12){
	System.out.print("December");
	}
	
   }

}