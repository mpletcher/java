package JavaRevision;

public class FinalDefMain {
	public static void main(String args[]) {
		// Object
		FinalDef FinalDefObject = new FinalDef(10);
		
		// For loop
		for (int i = 0; i < 5; i++) {
			FinalDefObject.add(); // allows methods runs five times
			
			System.out.printf ("%s", FinalDefObject);
			
		}
	}
	
}
