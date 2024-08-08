//give an integer num, return the number of steps to reduce it to zero
//in one step, if the current no is even you have to divide it by 2, otherwise you have to subtract 1 from it

package recursion;

public class reducer {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			}
	
	public int noofSteps(int num) {
		return helper(num,0);
	}
	private int helper(int num, int steps) {
		if(num==0) {
			return steps;
		}
		if (num%2==0) {
			return helper(num/2,steps+1);
			
		}
		return helper(num-1,steps+1);
	}
}
