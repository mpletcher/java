package JavaRevision;

public class privpubThis {
		// Private means only these methods in this class can access these variables
		private int hour = 1;	// Local variables
		private int minute = 2;
		private int second = 3;
		
		// Constructor
		// In order to use these variables below, we have to use THIS reference.
		public void setTime (int h, int m, int s) {
			this.hour = 4; // I had to rename variable (h to hour, m to minute, n to second)
			this.minute = 5;
			this.second = 6;
		}

		// Method to display military time
		public String toMilitary(){
			return String.format("%02d:%02d:%02d", hour, minute, second);
		}
		
		// Method to display normal time
		public String toNormal(){
			return String.format("%d:%02d:%02d %s", ((hour == 0 || hour == 12) ? 12 : hour%12), minute, second, (hour < 12 ? "AM" : "PM"));
		}
		
}

