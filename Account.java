public class Acount{
   private String name;
   private double balance;

public Account(String name, double balance){
    this.name = name;

if (balance > 0.0){
    this.balance = balance;
  }

}

public void setwithdraw(double withdrawAmount){
   if (withdrawAmount > balance){
      System.out.print("insufficient fund");
    }
      balance = balance - withdrawAmount;

}
public double getBalance(){
      return.balance;
 }
public void setName(String name){
    this.name = name;
 }
public String getName(){
   return.name;
 }

}