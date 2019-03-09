package dataFlow;

import java.util.*;

public class palindrome {

    private int phraseLength;
    private StringBuilder phrase;

    /**
     * Constructor initialize the string to check for palindrome and init the length of the phrase
     * @param s
     */
    palindrome(StringBuilder s) {
        phrase = s;
        phraseLength = s.length();
    }

    /**
     * Check if the String is a palindrome
     * @return true if it's a palindrome and false otherwise
     */
    boolean isPalidrome() {
        if (phraseLength <= 1) return true;
        Stack<Character> stack = new Stack<>();
        StringBuilder reverse = new StringBuilder();
        for (int i = 0; i < phrase.length(); i++) {
            stack.push(phrase.charAt(i));
        }
        while (!stack.isEmpty()) {
            reverse.append(stack.pop());
        }

        return phrase.toString().equals(reverse.toString());
    }

    /**
     * Get the phrase length
     * @return
     */
    public int getPhraseLength() {
        return phraseLength;
    }

    public static void main(String[] args) {
        StringBuilder a = new StringBuilder("madam");
        palindrome p = new palindrome(a);

        if (p.isPalidrome()) System.out.println(a.toString() + " is a palindrome.");
        else System.out.println(a.toString() + " is not a palindrome.");
    }


}
