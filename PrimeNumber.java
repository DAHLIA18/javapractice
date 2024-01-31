public class PrimeNumberChecker {
    public static void main(String[] args) {
        int number = 17; 

        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }    
        for (int value = 2; value * value <= n; value++) {
            if (n % value == 0) {
                return false; 
            }
        }

        return true;
    }
}