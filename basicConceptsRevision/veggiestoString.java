package JavaRevision;

public class veggiestoString {
	public static void main(String args[]) {
		
		// Object
		veggies veggiesObject = new veggies(04,02,16);
		
		// Object
		Composition CompositionObject = new Composition("Marcos", veggiesObject); // Name and object
		
		System.out.println(CompositionObject);
		
		
	}

}
