package JavaRevision;

// Polymorphism
public class AnimalList {
	
	// Array can hold objects 
	private Animal[] mylist = new Animal[5];
	private int i = 0;	// counting variable
	
	// Method to add cat objects
	public void increase (Animal x) {
		// Checks if array is full or not
		if (i < mylist.length) {
			mylist[i] = x;
			System.out.println ("Animal added at index " + i);
			i++;
		}
	}
}
