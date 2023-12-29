import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PalindromeCheckerTest {

    @Test
    public void testIsPalindrome_EmptyString() {
        String emptyString = "";
        assertTrue(PalindromeChecker.isPalindrome(emptyString));
    }

    @Test
    public void testIsPalindrome_SingleCharacter() {
        String singleCharacter = "a";
        assertTrue(PalindromeChecker.isPalindrome(singleCharacter));
    }

    @Test
    public void testIsPalindrome_PalindromeWord() {
        String palindromeWord = "radar";
        assertTrue(PalindromeChecker.isPalindrome(palindromeWord));
    }

    @Test
    public void testIsPalindrome_NonPalindromeWord() {
        String nonPalindromeWord = "hello";
        assertFalse(PalindromeChecker.isPalindrome(nonPalindromeWord));
    }

    @Test
    public void testIsPalindrome_PalindromePhrase() {
        String palindromePhrase = "A man, a plan, a canal, Panama";
        assertTrue(PalindromeChecker.isPalindrome(palindromePhrase));
    }

}
