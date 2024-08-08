package recursion;

public class sumofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result=sum(4132);
		System.out.println(result);

	}
   static int sum(int n) {
	   if(n<=1) {
		   return n;
	   }
	   return(n%10)+sum(n/10);
   }
}
