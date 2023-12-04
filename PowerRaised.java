import java.util.Scanner;
public class PowerRaised{
       public static void main(String[] args){
	Scanner input = new Scanner(System.in);

int power =1;
int count =1;

System.out.print("Enter a number: ");
int number = input.nextInt(); 

System.out.print("Enter a number: ");
int number2 = input.nextInt();

if(number2 > 0){
   
   while(count <= number2){
power = power * number1;
     count+=1;
  }
}
System.out.printf("%d raised to the power of %d is:"%d", number1,number2,power,raised);
  }       

}