public class EvenOddNumber {

    public static void main(String[] args) {
        int evenNumber = 0;
        int oddNumber = 0;

        for (int number = 1; number <= 100; number++) {
            if (number % 2 == 0) {
                evenNumber++;
            } else {
                oddNumber++;
            }
        }

        System.out.println("Number of even numbers: " + evenNumber);
        System.out.println("Number of odd numbers: " + oddNumber);
    }
}