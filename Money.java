import java.util.Scanner;
public class Money {
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);

	System.out.print("Dollar to chinese (enter 0) or yuan to dollar (enter 1): ");
	int conversion = input.nextInt();

	if(conversion == 0){
	System.out.print("Enter exchange rate from dollar to rmd: ");
	double conversionMoney = input.nextDouble();

	System.out.print("Enter amount to convert: ");
	double exchangeRate = input.nextDouble();

	double resultDollar = exchangeRate * conversionMoney;
	   
	System.out.printf("%c %f is %f yuan",'$',conversionMoney,resultDollar);
	}

	if(conversion == 1){
	System.out.print("Enter exchange rate from rmd to dollar: ");
	double conversionMoney = input.nextDouble();

	System.out.print("Enter amount to convert: ");
	double exchangeRate = input.nextDouble();

	double resultRmd = exchangeRate / conversionMoney;
	
	System.out.printf("%f yuan is %c %f",exchangeRate,'$',resultRmd);
	} 
    }

}