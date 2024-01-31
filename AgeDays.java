import java.util.Scanner;
public class AgeDays{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.println("Enter your year of birth: ");
	int year = input.nextInt();

	int age = year * 365;
	if(year > 0){age = 365 *(year - 1) + (year % 365);

	System.out.println("You are " + age + "years old and have lived" + age + "age");
	if(age < 0){
	System.out.println("Sorry,negative age is not valid. Try again ");
	}
    }
}

}