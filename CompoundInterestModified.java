public class CompoundInterestModified {

    public static void main(String[] args) {
        int principal = 100000;
        int rate = 5;
        int years = 5;

        System.out.printf("%-10s%-20s%n", "Interest", "Amount on Deposit");

        for (int i = rate; i <= 10; i++) {
            double interestRate = i / 100.0;
            System.out.printf("%-10d", i);

            int amount = principal;
            for (int year = 1; year <= years; year++) {
                amount += (int) (amount * interestRate);
            }

            int dollars = amount / 100;
            int cents = amount % 100;

            System.out.printf("$%d.%02d%n", dollars, cents);
        }
    }
}
