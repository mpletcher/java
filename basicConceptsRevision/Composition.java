package JavaRevision;

//  Composition is the design technique to implement has-a relationship in classes - HAS-A: instance variables that are references to other objects
public class Composition {
	private String name;
	private veggies birthday;	// Reference to Veggies class
	
	// Constructor
	public Composition(String yourName, veggies yourDate) {	// two arguments:  name and object
		name = yourName;
		birthday = yourDate;	
	}
	
	// Method
	public String toString() {
		// birthday will pass a variable in an object
		return String.format("Your name: %s and birthday: %s", name, birthday);
		
	}

}
