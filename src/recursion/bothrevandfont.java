package recursion;

public class bothrevandfont {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		bothfunc(5);
	}
 
 static void bothfunc(int n) {
	 if (n==0) {
		 return;
	 }
	 System.out.println(n);
	 bothfunc(n-1);
	
	 System.out.println(n);
	 
 }
}
