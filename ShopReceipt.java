public class ShopReceipt {

    private String itemsBought;
    private int quantity;
    private double pricePerUnit;
    private double total;

    public ShopReceipt(String itemsBought, int quantity, double pricePerUnit, double total){
        this.itemsBought = itemsBought;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
        this.total = total;
    }

    public void printerLine(){
        System.out.printf("\t\t%-8s\t\t%d\t\t%.2f\t\t%.2f", itemsBought, quantity, pricePerUnit, total );
        System.out.println();
    }


}