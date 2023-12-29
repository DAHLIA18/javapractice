import java.util.*;

class ShopReceiptTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String customerName;
        String cashierName;
        String itemBought;
        String moreItems;
        int quantity;
        double pricePerUnit;
        double discount = 0;
        double discountAmount;
        double vat;
        double total;
        double subTotal = 0;
        double billTotal = 0;
        double amountPaid;
        double balance;

        System.out.println("What is the customer name?: ");
        customerName = input.nextLine();

        List<ShopReceipt> shopReceipts = new ArrayList<>();

        do {
            try {
                System.out.println("What did The Customer Buy?: ");
                itemBought = input.nextLine();

                System.out.println("Quantity: ");
                quantity = input.nextInt();

                System.out.println("How much per unit: ");
                pricePerUnit = input.nextDouble();

                total = quantity * pricePerUnit;

                shopReceipts.add(new ShopReceipt(itemBought, quantity, pricePerUnit, total));

                subTotal = subTotal + total;

            } catch (InputMismatchException e) {
                System.out.println("Wrong Input");
            }

            System.out.println();
            System.out.println("Add more items (Y/N) or (YES or NO) ");
            input.nextLine();
            moreItems = input.next();
            input.nextLine();
        }

        while ((Objects.equals(moreItems, "Y")) || (Objects.equals(moreItems, "y")) || (Objects.equals(moreItems, "YES")) || (Objects.equals(moreItems, "yes")));

        if (moreItems.equals("N") || moreItems.equals("n") || moreItems.equals("NO") || moreItems.equals("no")) {
            System.out.println("What is your name: ");
            cashierName = input.nextLine();

            try {
                System.out.println("How much discount will customer get: ");
                discount = input.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Wrong Input");
            }

            discountAmount = subTotal * discount / 100;
            vat = subTotal * 7.5 / 100;
            billTotal += subTotal + vat - discountAmount;

            if (billTotal == 0) {
                System.out.println("Buy item(s) to get an invoice");
            } else {
                System.out.printf("%nSEMICOLON STORES%nMAIN BRANCH %nLOCATION: 312, HERBERT MACURLAY WAY, SABO, YAB, LAGOS" +
                        "%nTEL: 080x xxx xxxx%nCASHIER: %s%n%s%n CUSTOMER'S NAME %n", cashierName, customerName);

                for (int i = 0; i <= 100; i++) {
                    System.out.print("=");
                }
                System.out.println();

                System.out.print("\t\t ITEM \t\t QTY \t\t PRICE \t\t TOTAL(NGN)");
                System.out.println();

                for (int i = 0; i <= 100; i++) {
                    System.out.print("-");
                }
                System.out.println();

                for (ShopReceipt shopReceipt : shopReceipts) {
                    shopReceipt.printerLine();
                }

                System.out.println();
                for (int i = 0; i <= 100; i++) {
                    System.out.print("-");
                }
                System.out.println();

                System.out.printf("\t\t\t\t\t Sub Total: %.2f", subTotal);
                System.out.printf("%n\t\t\t\t\t Discount: %.2f", discountAmount);
                System.out.printf("%n\t\t\t\t\t VAT @ 7.5: %.2f%n", vat);

                for (int i = 0; i <= 100; i++) {
                    System.out.print("=");
                }

                System.out.println();

                System.out.printf("\t\t\t\t\t Bill Total: %.2f", billTotal);
                System.out.println();

                for (int i = 0; i <= 100; i++) {
                    System.out.print("=");
                }
                System.out.println();

                System.out.printf("\t\t\t\t\t THIS IS NOT A RECEIPT, KINDLY PAY %.2f", billTotal);
                System.out.println();

                System.out.print("How much did the customer give to you?: ");
                input.nextLine();
                amountPaid = input.nextDouble();

                balance = amountPaid - billTotal;

                System.out.print("\t\t ITEM \t\t\t QTY \t\t PRICE \t\t TOTAL(NGN)");
                System.out.println();

                for (int i = 0; i <= 100; i++) {
                    System.out.print("-");
                }
                System.out.println();

                for (ShopReceipt shopReceipt : shopReceipts) {
                    shopReceipt.printerLine();
                }

                System.out.println();
                for (int i = 0; i <= 100; i++) {
                    System.out.print("-");
                }
                System.out.println();

                System.out.printf("\t\t\t\t Sub Total: %.2f", subTotal);
                System.out.printf("%n\t\t\t\t Discount %.2f\t", discountAmount);
                System.out.printf("%n\t\t\t\t VAT @7.5: %.2f%n", vat);

                for (int i = 0; i <= 100; i++) {
                    System.out.print("=");
                }

                System.out.println();

                System.out.printf("\t\t\t\t\t\t Bill Total: %.2f", billTotal);
                System.out.printf("%n\t\t\t\t\t\t Amount Paid %-1.2f\t", amountPaid);
                System.out.printf("%n\t\t\t\t\t\t Balance: %-1.2f\t", balance);
                System.out.println();

                for (int i = 0; i <= 100; i++) {
                    System.out.print("=");
                }
                System.out.println();
                System.out.print("\t\t\t\t\t\t THANK YOU FOR YOUR PATRONAGE");
                System.out.println();

                for (int i = 0; i <= 100; i++) {
                    System.out.print("=");
                }
            }
        }
    }
}