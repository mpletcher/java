package JavaRevision;
import javax.swing.JFrame;	// allows basic features from OS

public class GUIwithJFrameMain {
	public static void main (String args[]) {
		// Object
		GUIwithJFrame pletcher = new GUIwithJFrame();
		pletcher.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// JFrame.EXIT_ON_CLOSE allows to terminate the program when someone clicks on the X button
		// Set size for object or window
		pletcher.setSize(300, 190);
		pletcher.setVisible(true);
	}

}
