package JavaRevision;

// Polymorphism
// Polymorphic Array
public class IntroPolymorphism {
	public static void main (String args[]) {
		
		// Polymorphic array allows to assign objects to variables, as long as your reference variable is the superclass type
		PolySuperclass plet[] = new PolySuperclass[2];
		plet[0] = new PolyA();
		plet[1] = new PolyB();
		
		// Loop through
		for (int x = 0; x < plet.length; x++) {
			plet[x].explain(); // (explain is a method from the superclass) runs through each one of those aforementioned methods
		}
		
		// PolyArguments Object
		// Passing objects in a methods
		PolyArguments mainObject = new PolyArguments();	// main object for passing these below (with this one, we can use all content from PolyArguments class)
		PolySuperclass obj1 = new PolySuperclass();	// superclass
		PolySuperclass obj2 = new PolyB();	// subclass
		
		// Polymorphic arguments
		mainObject.polymorph(obj1);	// superclass
		mainObject.polymorph(obj2);	// subclass
	}

}
