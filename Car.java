public class Car {
    private String model;
    private String year;
    private double price;
    
    public Car(String model, String year, double price) {
        this.model = model;
        this.year = year;
        this.price = price;
	}

public void setModel(String newModel) {
    this.model = newModel;
}

public String getModel() {
    return this.model;
}

public void setYear(String newYear) {
    this.year = newYear;
}

public String getYear() {
    return this.year;
}

public void setPrice(double newPrice) {
    this.price = newPrice;
}
public double getPrice() {
    return this.price;
}

}