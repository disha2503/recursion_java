package recursion;

public class number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		fun(4);

	}
	static void fun(int n) {
		if (n==0) {
			return;
		}
		System.out.println(n);
		fun(n-1);
	}

}


//n-1