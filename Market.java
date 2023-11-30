import java.util.Scanner;
public class Market{
     public static void main(String[] args){
   Scanner input = new Scanner(System.in);

 System.out.print("Enter an item: ");
String item = input.next();

System.out.print("Enter the item price: ");
int itemPrice = input.nextInt();

if (itemPrice < 0){ 
  System.out.print("Not valid");
 }

if (itemPrice > 0){

double discount = 0.10;

double payCheck = itemPrice -(itemPrice * 0.10);

System.out.printf("Your bill is %.2f", payCheck);
System.out.printf(" %n   ______________");
}
  }

}