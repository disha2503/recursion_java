package recursion;

public class concept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    func(4);
	}
	static void func(int n) {
		if (n == 0) {
			return;
		}
		System.out.println(n);
		func(--n);
	}

}
