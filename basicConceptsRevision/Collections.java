package JavaRevision;
import java.util.*; // allows to use lists

public class Collections {
	public static void main (String args[]) {
		// Array initializer
		String[] items = {"Red", "Blue", "Green", "White", "Black", "Yellow", "Pink"};
		
		// <String> Casting the data
		List<String> mylist1 = new ArrayList <String> ();
		
		// Add array items to list
		// loop through
		for (String x : items) {
			mylist1.add(x);
		}
		
		String[] items2 = {"Purple", "Pink"};
		// <String> Casting the data
		List<String> mylist2 = new ArrayList <String> ();
				
		// Add array items to list
		// loop through
		for (String y : items2) {
			mylist2.add(y);			
		}

		// Print out mylist 1
		for (int n = 0;  n < mylist1.size(); n++) {	// take the size whatever list
			System.out.printf ("%s ", mylist1.get(n)); // each item, get any items
		}

	}
}

		


