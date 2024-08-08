package recursion;

public class productofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res=product(412);
		System.out.println(res);

	}
	static int product(int n) {
		if(n%10==n) {
			return n;
		}
	return(n%10)*product(n/10);
	}

}
