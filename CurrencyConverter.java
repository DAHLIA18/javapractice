import java.util.Scanner;

public class Currency {
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Dollar to yuan(enter 0) or yuan to dolar (enter 1): ");
	int figures = input.nextInt();

	if(figures == 0){
	System.out.print("Enter the dollar amount: ");
	double usdDigits = input.nextDouble();

	System.out.print("Enter exchange rate: ");
	double exchangeRate = input.nextDouble();

	double resultDollar = exchangeRate * usdDigit;

	System.out.printf("%c %f is %f yuan", '$',usdDigit,resultDollar);
	}


	if(figures == 1){
	System.out.print("Enter the rmd amount: ");
	double rmdDigits = input.nextDouble();

	System.out.print("Enter exchange rate: ");
	double exchangeRate = input.nextDouble();

	double resultRmd = exchangeRate / rmdDigits;
	System.out.printf("%f yuan is %c %f",exchangeRate,'$',resultRmd);
	}

   }


}