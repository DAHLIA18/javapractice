import java.util.Scanner;
public class TimeTable{
    public static void main(String[] args){

Scanner input = new Scanner(System.in);


System.out.print("Enter number between 1 and 20: ");
int number = input.nextInt();


int count = 1;

if(number > 1 || number < 20){
   System.out.print("Invalid number");
}

while(count <= 12){

int multiplication = number * count;

System.out.printf("%d x %d = %d%n",(number, count , multiplication) + " \t ");
 count = count + 1;
}

   }

 }

