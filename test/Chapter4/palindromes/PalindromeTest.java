package Chapter4.palindromes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @Test
    void testForPalindrome(){
        Palindrome palindrome = new Palindrome();
        assertFalse(palindrome.sameViewFromReverseWord("timothy"));
    }

    @Test
    void testForPalindromeValue(){
        Palindrome palindrome = new Palindrome();
        assertFalse(palindrome.sameViewFromReverseNumber(13211));
    }

}