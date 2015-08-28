package JavaRevision;

// Polymorphism
public class ClasstoHoldObjects {
	public static void main (String args[]) {
		
		// List objects
		AnimalList items = new AnimalList();
		Cat c = new Cat();	
		Bird b = new Bird();	
		
		items.increase(c); //  Method to add cat objects
		items.increase(b); //  Method to add bird objects

		
		// Basic Poly program
		// Array
		Animal[] mylist2 = new 	Animal[2];
		Cat c2 = new Cat();	
		Bird b2 = new Bird();
		
		// Set elements 
		mylist2[0] = c2;
		mylist2[1] = b2;
		
		System.out.println("");	// blank line
		
		// Enhanced For loop
		// Loops through the entire array mylist2
		for (Animal y: mylist2) {	// y is a new variable
			y.fear();	// y will be substitute for c2 and b2 arguments. Additionally, adds those subclass methods
		}
		
	}

}
