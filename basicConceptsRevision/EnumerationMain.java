package JavaRevision;

public class EnumerationMain {
	public static void main(String args[]) {
		
		// Values - static method to get the built-in array (java creates any time we have emuns)
		for (Enumeration listOfPeople: Enumeration.values()) {
			
			// getDescription returns string of the description
			// getAge returns string of the age
			System.out.printf ("%s\t%s\t%s\n", listOfPeople, listOfPeople.getDescription(), listOfPeople.getAge());	
		}
	}

}
