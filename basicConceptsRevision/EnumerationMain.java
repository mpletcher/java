package JavaRevision;
import java.util.EnumSet; // Allows to use a built-in method called range

public class EnumerationMain {
	public static void main(String args[]) {
		
		// Values - static method to get the built-in array (java creates any time we have emuns)
		for (Enumeration listOfPeople: Enumeration.values())
			
			// getDescription returns string of the description
			// getAge returns string of the age
			System.out.printf ("%s\t%s\t%s\n", listOfPeople, listOfPeople.getDescription(), listOfPeople.getAge());	

		System.out.println("\nRange of Constants: ");	
		
		// EnumSet allows to select specific range of items
		for (Enumeration listOfPeople: EnumSet.range(Enumeration.Tim, Enumeration.Linda))
			System.out.printf ("%s\t%s\t%s\n", listOfPeople, listOfPeople.getDescription(), listOfPeople.getAge());				

		
	}

}
