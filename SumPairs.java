public class SumPairs {
    public static void main(String[] args) {
        
        for (int number = 4; number <= 10; number += 4) {
            System.out.println("Powers of " + number + ":");
            for (int value = 0; value < 5; value++) {
                int result = (int) Math.pow(number, value);
                System.out.println(result);
            }
            System.out.println();
        }

       
        int sum4= sumPairs(4);
	int sum8= sumPairs(8);
        System.out.println(sum4 + " " + sum8);
    }

  
    private static int sumPairs(int base) {
        int sum = 0;

        
        for (int value = 0; value < 5; value++) {
            sum += (int) Math.pow(base, value);

        }

        return sum;
    }
}