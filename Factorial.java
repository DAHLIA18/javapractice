import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a nonnegative integer: ");
        int nonnegative = input.nextInt();
        
        while (nonnegative < 0) {
            System.out.print("Invalid input. Enter a nonnegative integer: ");
            nonnegative = input.nextInt();
        }
        input.close();
      
        System.out.println(nonnegative + "! = " + factorial(n));
        
        System.out.print("Enter the number of terms to calculate e: ");
        int terms = input.nextInt();
        
        while (terms < 1) {
            System.out.print("Invalid input. Enter a positive integer: ");
            terms = input.nextInt();
        }
        input.close();
       
        System.out.println("e = " + estimateE(terms));
      
        System.out.print("Enter the value of x: ");
        double x = input.nextDouble();
        input.close();
  
        System.out.println("e^" + x + " = " + estimateEX(x, terms));
    }


    public static long factorial(int nonnegative) {
       
        if (nonnegative == 0) {
            return 1;
        }
        
        return nonnegative * factorial(nonnegative - 1);
    }


    public static double estimateE(int terms) {
        
        double sum = 0;
        
        for (int i = 0; i < terms; i++) {
           
            sum += 1.0 / factorial(i);
        }
        
        return sum;
    }


    public static double estimateEX(double x, int terms) {
        
        double sum = 0;
        
        for (int i = 0; i < terms; i++) {
            
            sum += Math.pow(x, i) / factorial(i);
        }
        
        return sum;
    }
}