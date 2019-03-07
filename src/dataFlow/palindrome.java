package dataFlow;

public class palindrome {

    private int phraseLength;
    private StringBuilder phrase;

    /**
     *
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
        return phrase.toString().equals(phrase.reverse().toString());
    }

    public static void main(String[] args) {
        StringBuilder a = new StringBuilder("madam");
        palindrome p = new palindrome(a);

        if (p.isPalidrome()) System.out.println(a.toString() + " is a palindrome.");
        else System.out.println(a.toString() + " is not a palindrome.");
    }
}
