public class AccountTest2 {
    public static void main(String[] args) {
        Account account1 = new Account("Blessing Benjamin", 50.00);
        Account account2 = new Account("Jumoke Joseph", 7.53);

        displayAccount(account1);
        displayAccount(account2);
    }

    public static void displayAccount(Account accountToDisplay) {
        System.out.printf("%s's balance: $%.2f%n", accountToDisplay.getName(), accountToDisplay.getBalance());
    }
}