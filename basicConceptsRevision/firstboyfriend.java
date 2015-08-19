package JavaRevision;

// Using many Methods and Instances

public class firstboyfriend { 
	private String boyName;	// Just methods inside this class can use this variable
	public void setName(String typedName){	// Methods set name typed
		boyName = typedName;	// Instruction for this method
	}
	
	public String getName() {	// Method accesses the name typed. It returns a string
		return boyName;
	}
	
	public void saying(){
		System.out.printf("Your first boyfriend was %s", getName());
	}
}
