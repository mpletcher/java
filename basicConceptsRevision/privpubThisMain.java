package JavaRevision;

public class privpubThisMain {
	
	public static void main (String args[]){
		// Object 
		privpubThis privpubThisObject = new privpubThis();
		
		privpubThisObject.setTime(13, 27, 6); 
		System.out.println(privpubThisObject.toMilitary());		// Set the military time
		System.out.println(privpubThisObject.toNormal());		// Set the normal time
		
		System.out.println(privpubThisObject.toMilitary());		// Set the military time
		System.out.println(privpubThisObject.toNormal());		// Set the normal time	
	}

}

