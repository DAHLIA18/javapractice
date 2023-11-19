import java.util.Scanner;
import java.util.Calender;


public class DateDemo{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter a date: ");
	String date = input.next();

	String[] dateParts = date.split("/");
	
	int month = int.parsel(dateParts[]);
	int day = int.parsel(dateParts[]);
	int year = int.parsel(dateParts[]);

	Calender calender = Calender.getInstance();

	int dayOfMonth = calender.get(Calender.DayOfMonth);
	int dayOfWeek = calender.get(Calender.DayOfWeek);

	System.out.println("The day of the date" + date + "is" + dayOFMonth); 
	System.out.println("The day of the week is" + dayOFWeek); 



}





}