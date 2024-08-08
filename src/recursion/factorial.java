package recursion;

public class factorial {

    public static void main(String[] args) {
        // Calculate the factorial of 4 and print the result
        int result = fact(4);
        System.out.println(result);
    }

    static int fact(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * fact(n - 1);
    }
}
