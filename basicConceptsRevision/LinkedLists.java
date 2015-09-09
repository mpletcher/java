package JavaRevision;
import java.util.*;


public class LinkedLists {
	public static void main (String args[]) {

		// Array lists
		String[] items = {" Common herbs ", "cilantro", "chives", "garlic", "parsley", "sage", "shallots", "scallions"};
		List<String> list1 = new LinkedList<String>();
		
		// Enhanced for loop
		for (String x : items)
		list1.add(x); // adds all items from array to x

		// Array lists
		String[] items2 = {" Herbes de Provence ", "basil", "fennel seed", "marjoram", "oregano", "savory", "thyme"};
		List<String> list2 = new LinkedList<String>();
		
		// Enhanced for loop
		for (String y : items2)
		list2.add(y); // adds all items from array to x
		
		// Method
		list1.addAll(list2); // takes all items from list2 and adds to list1 
		list2 = null; // null bc we don't need this list anymore
		
		// Method
		printList (list1); // takes a parameter of list1
		removeItems (list1, 2,4); // takes a parameter of list1 in two locations: 2 to 4
		
		printList (list1);
		reverseList (list1);
	}
	
	// PrintList method
	private static void printList (List<String> myList) {
		
		// Enhanced for loop
		for (String tempList : myList) // Enhanced for loop loops through the list and retrieves each items in tempList
			System.out.printf ("%s ", tempList);
		System.out.println();
		
	}
	
	// removeItems method
	private static void removeItems (List<String> myList, int from, int to) {	// it passes a range numbers FROM where we want to remove them TO where we want to remove them
		// sublist is a built-in method from java. Its clears those items 2 to 4
		myList.subList(from, to).clear(); 
	}
	
	// reverseList method
	private static void reverseList (List<String> myList) {
		// List Iterator
		ListIterator<String> marcos = myList.listIterator(myList.size()); // myList.size() takes the element to the list
		
		// While loop goes through our list
		while (marcos.hasPrevious()) // boolean built-in method hasPrevious() takes all elements until the last, and then, it's gonna be false
			System.out.printf ("%s ", marcos.previous());
	}
}
