package JavaRevision;
import java.awt.FlowLayout;	// allows use default layout from java
import javax.swing.JFrame;	// allows basic features from OS
import javax.swing.JLabel;	// allows to output text on screen

public class GUIwithJFrame extends JFrame{
	
	private JLabel itemA;
	
	// Constructor
	public GUIwithJFrame () {
		super ("Java Program Title");	// Title 
		setLayout (new FlowLayout());	// Gives us a default layout
		
		itemA = new JLabel ("Content of my app");
		itemA.setToolTipText("Content on hover");
		add(itemA);
	}

}
