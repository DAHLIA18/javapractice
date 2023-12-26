import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DigitList {
    public static List<Integer> getDigits(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number should be non-negative");
        }

        List<Integer> digitsList = new ArrayList<>();
        
        if (number == 0) {
            digitsList.add(0);
            return digitsList;
        }

        while (number > 0) {
            digitsList.add(number % 10);
            number /= 10;
        }

        Collections.reverse(digitsList);
        return digitsList;
    }

    public static void main(String[] args) {
  
        int num = 123456;

     
        List<Integer> digits = getDigits(num);
        System.out.println("Digits of " + num + ": " + digits);
    }
}
