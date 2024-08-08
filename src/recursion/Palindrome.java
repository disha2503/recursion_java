package recursion;

public class Palindrome {

    public static void main(String[] args) {
        String str = "radar";
        boolean result = isPalindrome(str);
        System.out.println(result ? str + " is a palindrome." : str + " is not a palindrome.");
    }

    static boolean isPalindrome(String str) {
        if (str.length() <= 1) {
            return true;
        }
        if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false;
        }
        return isPalindrome(str.substring(1, str.length() - 1));
    }
}
