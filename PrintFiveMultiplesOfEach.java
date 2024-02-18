public class PrintFiveMultiplesOfEach {
    public static void main(String[] args) {
    
        for (int number = 4; number <= 10; number += 4) {
            System.out.println("powers of " + number + ":");
            for (int value = 0; value < 5; value++) {
                int result = (int) Math.pow(number,value);
                System.out.println(result);
            }
            System.out.println();
        }
    }
}