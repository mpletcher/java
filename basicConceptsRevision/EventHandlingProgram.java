package JavaRevision;
import javax.swing.JFrame;

public class EventHandlingProgram {
	public static void main (String args[]) {
		
		// Object
		EventHandling mark = new EventHandling ();
		mark.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// allows the user to close window
		mark.setSize(350, 100);
		mark.setVisible(true);
		
	}
}
