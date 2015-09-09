package JavaRevision;

// Main
public class Recursion {
	public static void main (String args[]) {
		// 4! = 4 × 3 × 2 × 1 = 24
		System.out.println (factorial(4));
		
	}
	
	// Method factorial
	// Factorial means to multiply a series of descending natural number
	 public static long factorial (long numb) {
		 
		 if (numb <= 1)  // it's called base case. It's required
			 return 1; // 1! and 0! = 1
		 else
			 return numb * factorial (numb - 1); // numb - 1 allows to run recursion
	 }

}

