import java.util.Scanner;
public class AbsoluteValue{
    public static void main(String[] args){
    
   Scanner input = new Scanner(System.in);

    System.out.print("Enter a number either negative or positive: ");
    int number = input.nextInt();

  if(number < 0){
    int value = (-(number - 0));
    System.out.printf("The distance of the number from 0 is %d is %d", number, value);
   }
    else{
    int absoluteValue = number - 0;
    System.out.printf("The distance of the number from 0 is %d is %d",number, absoluteValue);
    }
    
  }

}