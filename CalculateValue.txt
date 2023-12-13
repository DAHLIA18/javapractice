public class CalculateValue{

    public static void main(String[] args) {
        int terms = 200000;
        double pi = 0.0;
        double denominator = 1.0;
        boolean found = false;

        for (int i = 1; i <= terms; i++) {
            if (i % 2 != 0) {
                pi += 4.0 / denominator;
            } else {
                pi -= 4.0 / denominator;
            }
            denominator += 2.0;

      
            if (!found && String.valueOf(pi).startsWith("3.14159")) {
                found = true;
                System.out.println("Terms needed to reach 3.14159: " + i);
            }
        }

        System.out.println("Value of π after " + terms + " terms: " + pi);
    }
}
