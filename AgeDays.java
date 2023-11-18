import java.util.Scanner;
public class AgeDays{
	public class static void main(String[] args){

	Scanner input = new Scanner(System.in);
	
	int age = input.nextInt();
	int days = 0;
	if(age > 0){days = 365 *(age - 1) + (age % 365);

	System.out.println("You are " + age + "years old and have lived" + days + "days".);
	if(age < 0){
	System.out.println("Sorry,negative age is not valid. Try again ");
	}
    }
}