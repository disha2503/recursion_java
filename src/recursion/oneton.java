package recursion;

public class oneton {

    public static void main(String[] args) {
        revfun(6);
    }

    // Print numbers from n to 1 
//    static void fun(int n) {
//        if (n == 0) {
//            return;
//        }
//        fun(n - 1);
//        System.out.println(n);
//    }

  
    // Print numbers from 1 to n
    static void revfun(int n) {
        if (n == 0) {
            return;
        }
        revfun(n - 1);
        System.out.println(n);
       
    }
}
