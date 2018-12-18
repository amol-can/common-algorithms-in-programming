/**
 * *******************************************************
 * Euclid algorithm for finding the Greated Common Divisor
 * @author Amol Patil, connect2apatil@gmail.com 
 * *******************************************************
 */
public class GCD {

	public static void main(String[] args) {
		// TODO set two integer(m,n) values and r for reminder
		int m = 12;
		int n = 8;
		int r = 1;
		
		while(!(r==0)) {
			r = m % n;
			System.out.println("M: "+m+" N: "+ n + " R: "+r);
			m = n;
			n = r;
		}
		System.out.println("GCD: "+ m);
	}

}
