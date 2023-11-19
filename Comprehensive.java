import java.util.Scanner;
import java.util.Date;

public class Comprehensive{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	Date thisDate = new Date();

	System.out.print("Enter the year: ");
	int year = input.nextInt();

	System.out.print("Enter the month: ");
	int month = input.nextInt();

	System.out.print("Enter the date: ");
	int day = input.nextInt();

	int k = year % 100;
	int j = year / 100;
	int i = month + 1;
	int m = (26 + 1) / 10;

	int result = day + m + k + k / 4 + j / 4 + 5 + j;
	
	if(year < 1900 || year > 9999 || month <1 || month > 12 || day <1 || day > 31){ 
	}
	
	if (result == 0)
	   System.out.print("Saturday");

	if (result == 1)
	    System.out.print("Sunday");

	if (result == 2)
	    System.out.print("Monday");

	if (result == 3)
	   System.out.print("Tuesday");

	if (result == 4)
	  System.out.print("Wednesday");

	if (result ==5)
	   System.out.print("Thursday");

	if (result == 6)
	   System.out.print("Friday");
   }


} 