package JavaRevision;

public class FinalDef {
	//	
	private int sum;
	private final int NUM; // Final means we can modify it ever
	
	// Constructor
	public FinalDef(int y) {
		NUM = y;
	}
	
	// Method 
	public void add() {
		sum += NUM;
	}
	
	public String toString() {
		return String.format("sum = %d\n", sum);	// i or d
	}
}

