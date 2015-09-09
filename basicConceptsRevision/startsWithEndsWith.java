package JavaRevision;

public class startsWithEndsWith {
	public static void main (String args[]) {
		
		// Array initializer
		String[] items = {"Red", "Blue", "Green", "White", "Black", "Yellow", "Pink"};
		
		// StartsWith
		// Enhanced for loop. It loops through array
		for (String i : items) {
			if (i.startsWith("Bl"))
				System.out.println (i + " starts with bl");
		}
		
		System.out.println();	// Blank line		
		// EndsWith
		for (String i : items) {
			if (i.endsWith("e"))
				System.out.println (i + " ends with e");
		}
		
		System.out.println();	// Blank line		
		// Finds characters in a string
		String mp = "One of the aspects of the florid coverage of Java in the press is that it is intended as a vehicle for object-oriented programming (OOP)    ";
		
		System.out.println (mp.indexOf('a'));
		
		// Concat
		String a = "have ";
		String b = "milk";
		
		// First way
		System.out.println();	// Blank line	
		System.out.println (a + b);
		
		// Second way
		System.out.println (a.concat(b));
		
		// Upper case
		System.out.println();	// Blank line
		System.out.println (a.toUpperCase());
		
		// Lower case
		System.out.println (b.toLowerCase());
		
		// Removes any spaces
		System.out.println();	// Blank line
		System.out.println (mp.trim());
	}
}
