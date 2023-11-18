import java.util.Scanner;

public class Money1{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Dollar to yuan(enter 0) or yuan to dolar (enter 1): ");
	int figures = input.nextInt();

	if(figures == 0){
	System.out.print("Enter the exchange rate: ");
	double figuresAmount = input.nextDouble();

	System.out.print("Enter the dollar amount: ");
	double exchangeRate = input.nextDouble();

	double resultDollar = exchangeRate * figuresAmount ;

	System.out.printf("%c %f is %f yuan", '$',figuresAmount,resultDollar);
	}


	if(figures == 1){
	System.out.print("Enter the exchange rate: ");
	double figuresAmount = input.nextDouble();

	System.out.print("Enter rmd amount: ");
	double exchangeRate = input.nextDouble();

	double resultRmd = exchangeRate / figuresAmount ;
	System.out.printf("%f yuan is %c %f",exchangeRate,'$',resultRmd);
	}

   }


}