package JavaRevision;

// When we don't know how many arguments we will have
public class VariableLength {
	public static void main(String args[]) {
		System.out.println(average (10, 20, 50))	;	
	}
	
	public static int average (int...numbers) {	// we do not know how many number
		int total = 0;
		
		for (int x : numbers)
			total += x;
		
		return total / numbers.length;
	}
}
