package dataFlow;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class palindromeTest {

	@Test
	public void test() {
		// check if empty string is palindrome
		StringBuilder a = new StringBuilder("abba abba");
        palindrome p = new palindrome(a);
        assertTrue(p.isPalidrome());
        
        /* test one-letter strings "from a-z" -> should be palindrome */
        testOneLetterStrings(a, p);

        /* test two-letter strings "from aa, bb, cc - zz"  -> should be palindrome*/
        testTwoLetterStrings_SameChars(a, p);

        /* test two-letter strings "from ab, ac, ..., bc, cd ..." -> should not be palindrome */
        testTwoLetterStrings_DiffChars(a, p);
        /* test three-letter strings "from aba, bcb, cdc, ..." -> should be palindrome */

        testThreeLettersStrings_MidCharDiff(a, p);
        /* test two-letter strings "from aab, bbc, ccd, ..." -> should not be palindrome */
        testThreeLettersStrings_TwoCharDiff(a, p);
        
	}

	/**
	 *  Test for a String with 1 letter
	 * @param a
	 * @param p
	 */
	void testOneLetterStrings(StringBuilder a, palindrome p) {
        for (int i = 97; i <= 122; i++) {	
        	String s = "";
        	s += (char)i;
        	a = new StringBuilder(s);
            p = new palindrome(a);
            assertTrue(p.isPalidrome());
        }
	}

	/**
	 * Test for a String with 2 same letters
	 */
	void testTwoLetterStrings_SameChars(StringBuilder a, palindrome p) {
        for (int i = 97; i <= 122; i++) {	
        	String s = "";
        	s += (char)i;
        	s += (char)i;
//        	System.out.println(s);
        	a = new StringBuilder(s);
            p = new palindrome(a);
            assertTrue(p.isPalidrome());
        }
	}

	/**
	 *
	 * @param a
	 * @param p
	 */
	void testTwoLetterStrings_DiffChars(StringBuilder a, palindrome p) {
        for (int i = 97; i <= 122; i++) {
        	String s = "";
        	s += (char)i;
        	for (int j = i + 1; j <= 122; j++) {
        		s += (char)j;
        		a = new StringBuilder(s);
                p = new palindrome(a);
        		assertFalse(p.isPalidrome());
        	}
        }
	}
	
	void testThreeLettersStrings_MidCharDiff(StringBuilder a, palindrome p) {
		for (int i = 97; i <= 122; i++) {
        	String s = "";
        	s += (char)i;
        	s += (char)(i + 1);
        	s += (char)i;
    		a = new StringBuilder(s);
            p = new palindrome(a);
    		assertTrue(p.isPalidrome());
        }
	}
	
	void testThreeLettersStrings_TwoCharDiff(StringBuilder a, palindrome p) {
		for (int i = 97; i <= 122; i++) {
        	String s = "";
        	s += (char)i;
        	s += (char)i;
        	s += (char)(i + 1);
    		a = new StringBuilder(s);
            p = new palindrome(a);
    		assertFalse(p.isPalidrome());
        }
	}
	
	

}
