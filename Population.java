import java.util.Scanner;

public class Population{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
			
		System.out.print("Enter world's population: ");
		long worldPopulation = input.nextLong();

		System.out.print("Enter World's population growth rate: ");
		int growthRate = input.nextInt();


		double growthEstimate1 = worldPopulation * growthRate;

		double year1 = worldPopulation + growthEstimate1;
		System.out.printf("Year 1 World Population is: %f%n", year1);

		double growthEstimate2 = year1 * growthRate;
		double year2 = year1 + growthEstimate2;
		System.out.printf("Year 2 World Population is: %f%n", year2);

		double growthEstimate3 = year2 * growthRate;
		double year3 = year2 + growthEstimate3;
		System.out.printf("Year 3 World Population is: %f%n", year3);

		double growthEstimate4 = year3 * growthRate;
		double year4 = year3 + growthEstimate4;
		System.out.printf("Year 4 World Population is: %f%n", year4);
		
		double growthEstimate5 = year4 * growthRate;
		double year5 = year4 + growthEstimate5;
		System.out.printf("Year 5 World Population is: %f%n", year5);

	}


}