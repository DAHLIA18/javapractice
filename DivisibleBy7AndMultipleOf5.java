public class DivisibleBy7AndMultipleOf5 {

       public static void main(String[] args) {

       for (int num = 1500; num <= 2700; num++) {

        if (num % 7 == 0 && num % 5 == 0) {

        System.out.println(num);
            }
        }
    }
}