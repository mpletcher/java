package JavaRevision;

public class veggies {
		// Private means only these methods in this class can access these variables
		private int month;	// Local variables
		private int day;
		private int year;
		
		// veggies Constructor
		public veggies (int m, int d, int y) {
			month = m;
			day = d;
			year = y;
			
		// Print out string
		System.out.printf ("Constructor for this is %s\n", this); // variables from the constructor
			
		}
		
		// toString method
		public String toString() {
			return String.format("%2d/%2d/%2d", month, day, year);
		}
}
