package JavaRevision;

public class TimeMain {
	public static void main (String args[]){
		// Object 
		Time TimeObject = new Time();
		
		// Set the military time (13:27:06)
		System.out.println("Military time is: ");		
		TimeObject.setTime(13, 27, 6);
		System.out.println(TimeObject.toMilitary());
		
		// Set the normal time (13:27:06)
		System.out.println("\nNormal time is: ");		
		TimeObject.setTime(12, 00, 00);
		System.out.println(TimeObject.toNormal());
	}

}
