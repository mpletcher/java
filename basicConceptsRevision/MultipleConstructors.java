package JavaRevision;

// Overloaded constructor
public class MultipleConstructors {
	// Private means only these methods in this class can access these variables
	private int hour;	// Local variables
	private int minute;
	private int second;
	
	// Constructor
	public MultipleConstructors () {
		this (0,0,0);	
	}
	
	// Constructor	
	public MultipleConstructors (int h) {	// Argument
		this (h,0,0);
	}
	
	// Constructor
	public MultipleConstructors (int h, int m) {
		this (h,m,0);
		
	}
	
	// Constructor set the time
	public MultipleConstructors (int h, int m, int s) {
		setTime (h,m,s);
	}
	public void setTime (int h, int m, int s) {
		setHour (h); // Methods
		setMinute (m);
		setSecond (s);
	}
	
	// setHour Method
	public void setHour (int h) {
		hour = ((h > 0 && h < 24) ? h : 0); // "?" - if and ":" - else
	}

	// setMinute Method
	public void setMinute (int m) {
		minute = ((m > 0 && m < 60) ? m : 0);
	}
	
	// setSecond Method
	public void setSecond (int s) {
		second = ((s > 0 && s < 60) ? s : 0);
	}

	// Get Method
	public int getHour() {
		return hour;
	}

	// Get Method
	public int getMinute() {
		return minute;
	}

	// Get Method
	public int getSecond() {
		return second;
	}

	// Display Method
	public String toMilitary() {
		return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
	}
	

}
