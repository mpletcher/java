package JavaRevision;
import java.util.Scanner;

class ifStatement {
    public static void main(String args[]) { // Header method
    	int number;
    	
    	Scanner content = new Scanner(System.in);
    	System.out.println("Enter a number: ");
    	number = content.nextInt();
    	
    	if (number == 9) {// Exactly equals to 9
    		System.out.println(number + " is equal to 9.");
    	}else{
		System.out.println(number + "is not equal to 9.");
    	}
    }
}