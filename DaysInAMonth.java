import java.util.Scanner;

public class DaysInAMonth{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter month(1-12): ");
	int month = input.nextInt();

	System.out.print("Enter year(four digits,e.g.2012): ");
	int year = input.nextInt();
	
	if(month == 1){
	System.out.printf("%d January has 31 days", year);
	}
	if(month == 2){
	System.out.printf("%d Febuary has 28 days",year);
	}
	if(month == 3){
	System.out.printf("%d March has 30 days", year);
	}
	if(month == 4){
	System.out.printf("%d April has 30 days",year);
	}
	if(month == 5){
	System.out.printf("%d May has 31 days",year);
	}
	if(month == 6){
	System.out.printf("%d June has 30 days",year);
	}
	if(month == 7){
	System.out.printf("%d July has 31 days",year);
	}
	if(month == 8){
	System.out.printf("%d August has 31 days",year);
	}
	if(month == 9){
	System.out.printf("%d September has 30 days",year);
	}
	if(month == 10){
	System.out.printf("%d October has 31 days",year);
	}
	if(month == 11){
	System.out.printf("%d November has 30 days",year);
	}
	if(month == 12){
	System.out.printf("%d December has 31 days",year);
	}
    }

}