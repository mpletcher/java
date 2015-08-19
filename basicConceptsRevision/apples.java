package JavaRevision;
import java.util.Scanner;

class apples {
    public static void main(String args[]) { // Header method
    	double apples; // Declaring a variable
    	
    	apples = 5.5; // Assigning a variable
    	
    	System.out.println("I bought some fruits: ");
        System.out.print(apples); // Body methods
        System.out.print(" lbs of apples, blueberries, and bananas. "); // Body methods
        System.out.print("Do you like blueberries? "); 
        System.out.print("\n");  
        
        blueberry blueberryObject = new blueberry(); // Object allows to use all content from blueberry class
        blueberryObject.message();
    }
}
