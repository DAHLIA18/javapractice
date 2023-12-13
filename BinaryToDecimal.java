import java.util.Scanner;

public class BinaryToDecimal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a binary integer: ");
        int binary = input.nextInt();
       
        while (!isBinary(binary)) {
            System.out.print("Invalid input. Enter a binary integer: ");
            binary = input.nextInt();
        }
        input.close();
     
        int decimal = 0;
        int power = 0;
      
        while (binary > 0) {
           
            int digit = binary % 10;
    
            decimal += digit * Math.pow(2, power);
       
            power++;
           
            binary /= 10;
        }
      
        System.out.println("The decimal equivalent is " + decimal);
    }

    public static boolean isBinary(int number) {

        while (number > 0) {
            
            int digit = number % 10;
          
            if (digit != 0 && digit != 1) {
                return false;
            }
           
            number /= 10;
        }
     
        return true;
    }
}