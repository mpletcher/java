package JavaRevision;
import javax.swing.JOptionPane;

// GUI
public class GraphicalUserInterface {
	public static void main (String args[]) {
		
		String firstNum = JOptionPane.showInputDialog("Please, enter first number.");
		String secondNum = JOptionPane.showInputDialog("Please, enter second number.");
		
		int num1 = Integer.parseInt(firstNum);	// converts entered values into integer
		int num2 = Integer.parseInt(secondNum);	// converts entered values into integer
		
		int sum = num1 + num2;
		
		// Display
		JOptionPane.showConfirmDialog(null, "The sum is " + sum, "Java GUI", JOptionPane.PLAIN_MESSAGE); 	// null = middle of screen
		
	}

}
