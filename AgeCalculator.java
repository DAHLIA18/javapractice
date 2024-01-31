import java.util.Scanner;
public class AgeCalculator{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your year of birth: ");
        int yearOfBirth = input.nextInt();

	System.out.print("Enter current year: ");
	int currentYear = input.nextInt();

	int age = currentYear - yearOfBirth;
System.out.println("You are " + age + " years old.");
}
}
