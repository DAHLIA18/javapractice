import java.util.Scanner;
public class AccountTest{
     public static void main(String[] args){

  Account account1 = new Account("Blessing Benjamin", 50.00);
  Account account2 = new Account("Jumoke Joseph", -7.53);

  System.out.printf("%s balance: $%.2f%n",
   account1.getName(), account1.getBalance());
  System.out.printf("%s balance: $%.2f%n%n",
   account2.getName(), account2.getBalance());


Scanner input = new Scanner(System.in);

System.out.print("Enter withdrawal amount for account1: ");
double withdrawAmount = input.nextDouble();

System.out.print("%n withdrawing %.2f to account1 balance%n%n", withdrawAmount);
account1.withdraw(withdrawAmount);

System.out.printf("%s balance: $%.2f%n",account1.getName(), account1.getBalance());
System.out.printf("%s balance: $%.2f%n",account2.getName(),account2,getBalance());

System.out.print("Enter withdrawal amount for account2: ");
withdrawAmount = input.nextDouble();
System.out.printf("%n withdrawing %2.f to account2 balance%n%n",withdrawAmount);
account2.withdrawAmount(withdrawAmount);

System.out.printf("%s balance: $%.2f%n",account1.getName(),account1.getBalance());
System.out.printf("%s balance: $%.2f%n%n",account2.getName(),account2.getBalance());
  }

}