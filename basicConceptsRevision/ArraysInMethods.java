package JavaRevision;

// Passing arrays in a method
// Main method
public class ArraysInMethods {
	public static void main(String args[]){
		int var[] = {1, 4, 10, 100, 3}; // Array initializer
		increase(var); // Call the method
		
		for (int n:var) // Enhanced statement outputs values
			System.out.println(n);
	}
	
	// Method change
	public static void increase(int x[]){	// int x is a parameter of my array
		for (int i = 0; i < x.length; i++)
			x[i] +=3; // it takes all indexes in the array and adds 3, 2, .. in each value
	}
}
