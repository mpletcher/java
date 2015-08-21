package JavaRevision;

// Building Objects for Constructors
public class MultipleConstructorsMain {
	public static void main(String args[]) {
		// Object
		MultipleConstructors MultipleConstructorsObject = new MultipleConstructors();
		// Object
		MultipleConstructors MultipleConstructorsObject1 = new MultipleConstructors(5);
		// Object
		MultipleConstructors MultipleConstructorsObject2 = new MultipleConstructors(5, 20);
		// Object
		MultipleConstructors MultipleConstructorsObject3 = new MultipleConstructors(4,40,10);
		
		System.out.printf ("%s\n", MultipleConstructorsObject.toMilitary());
		System.out.printf ("%s\n", MultipleConstructorsObject1.toMilitary());
		System.out.printf ("%s\n", MultipleConstructorsObject2.toMilitary());
		System.out.printf ("%s\n", MultipleConstructorsObject3.toMilitary());
		
	}

}
