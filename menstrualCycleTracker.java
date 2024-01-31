import java.util.Scanner;

public class menstrualCycleTracker{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	int cycleLength;

	System.out.println("Welcome to the women's world! ");
	
	System.out.print("Kindly enter your average menstrual cycle(in days): ");
	cycleLength = input.nextInt();

	int ovulationStart = cycleLength - 14;
	int ovulationEnd = cycleLength - 10;

	System.out.println("Your ovulation window is usually btw day " + ovulationStart + " and day " + ovulationEnd + " . ");
}
}