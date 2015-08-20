package JavaRevision;
import java.util.Scanner;

public class Milk {
    public static void main(String args[]) { // Header method
    	
    	Scanner input = new Scanner(System.in);
    	Chocolate chocolateObject = new Chocolate();
    	
    	System.out.println("Enter your name here: ");
    	String var = input.nextLine(); // Passes the inputed string into variable VAR (chocolate class)
    	chocolateObject.message(var); // Use the object to call the method
    }
}
