public class PalindromeChecker {
    public static boolean isPalindrome(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("String is null or empty");
        }

        str = str.toLowerCase();
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
    
        String palindrome1 = "level";
        String palindrome2 = "Racecar";
        String notPalindrome = "hello";

   
        System.out.println(palindrome1 + " is palindrome? " + isPalindrome(palindrome1));
        System.out.println(palindrome2 + " is palindrome? " + isPalindrome(palindrome2));
        System.out.println(notPalindrome + " is palindrome? " + isPalindrome(notPalindrome));
    }
}
