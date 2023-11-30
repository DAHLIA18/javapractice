public class CarApplication{
     public static void main(String[] args){

    Car firstCar = new Car("Toyota","2020",1000000.00);
	System.out.println(firstCar.getPrice());
	firstCar.setPrice(firstCar.getPrice() * 0.95);

	System.out.println(firstCar.getModel());
        System.out.println(firstCar.getYear());


	Car secondCar = new Car("Honda", "2021", 80000.00);
	System.out.println(secondCar.getPrice());
	secondCar.setPrice(secondCar.getPrice() * 0.93);


	System.out.println(secondCar.getModel());
	System.out.println(secondCar.getYear());

     }

}