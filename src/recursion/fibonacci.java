package recursion;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fibo(3));
	}

	static int fibo(int n) {
		//base condition
		if (n < 2) {
			return n;
		}
		return fibo(n - 1) + fibo(n - 2);
	}
}
