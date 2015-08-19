package JavaRevision;
import java.util.Scanner;

public class milk {
    public static void main(String args[]) { // Header method
    	
    	Scanner input = new Scanner(System.in);
    	chocolate chocolateObject = new chocolate();
    	
    	System.out.println("Enter your name here: ");
    	String var = input.nextLine(); // Passes the inputed string into variable VAR (chocolate class)
    	chocolateObject.message(var); // Use the object to call the method
    }
}
