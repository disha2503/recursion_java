package recursion;

public class Countszero {

    public static void main(String[] args) {
        // Count the number of zeros in the integer 302       System.out.println(count(302)); // Example without leading zeros
        System.out.println(count(10000020)); // Another example with multiple zeros
    }

    static int count(int n) {
        return helper(n, 0);
    }

    private static int helper(int n, int c) {
        if (n == 0) {
            return c;
        }
        int rem = n % 10;
        if (rem == 0) {
            return helper(n / 10, c + 1);
        }
        return helper(n / 10, c);
    }
}
