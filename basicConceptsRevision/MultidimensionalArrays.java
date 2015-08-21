package JavaRevision;

public class MultidimensionalArrays {
	public static void main(String args[]) {
		int firstarr[][] = {{8,9,10,11}, {12,13,14,15}};	// Rows
		int secondarr[][] = {{30,31,32,33}, {43}, {4,5,6}}; // Rows
		
		System.out.println("First array"); //
				// Call method Visual table - first array
		visual(firstarr);
		
		System.out.println("\nSecond array"); //
				// Call method Visual table - second array
		visual(secondarr);
		
	}	
	// Method Visual table
	public static void visual (int x[][]) {
		for (int row = 0; row < x.length; row++) {	// rows

			for (int column = 0; column < x[row].length; column++) {	// columns
				System.out.print(x[row][column] + "\t");	// Just Print Statement
			}
			
			System.out.println();
		}
	}
		
}

