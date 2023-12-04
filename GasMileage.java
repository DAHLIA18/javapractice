import java.util.Scanner;
public class GasMileage{
     public static void main(String[] args){

    Scanner input = new Scanner(System.in);

   System.out.print("Enter miles driven: ");
    int miles = input.nextInt();

    System.out.print("Enter gallons used: ");
     int gallons = input.nextInt();

    float milesPerGallon = miles / gallons;
  System.out.println("Miles per gallon:" + milesPerGallon);

    }

}