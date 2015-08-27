package JavaRevision;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;	
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;
// the code that responds to mouse moving or button clicking

public class EventHandling extends JFrame {
	private JTextField plet1;
	private JTextField plet2;
	private JTextField plet3;
	private JPasswordField passwordPlet;
	
	// Constructor window
	public EventHandling () {
		super ("Java App");	// title
		setLayout (new FlowLayout());	// layout
		
		// Text fields
		plet1 = new JTextField(10);
		add (plet1);	// adds to the window
		
		plet2 = new JTextField ("Enter text here: ");
		add (plet2);	// adds to the window		
		
		plet3 = new JTextField ("uneditable", 20);
		plet3.setEditable(false);	// text field will not editable
		add (plet3);	// adds to the window
		
		passwordPlet = new JPasswordField ("pass");
		add (passwordPlet);
		
	// Action listener 
		// Object
		ActionList handler = new ActionList ();	// builds an action listener object
		plet1.addActionListener(handler);	// addActionListener takes handler as an argument
		plet2.addActionListener(handler);
		plet3.addActionListener(handler);
		passwordPlet.addActionListener(handler);

	}
	
	// Class inside class
	// Event handling class
	// It inherits all content from the class above
	private class ActionList implements ActionListener {	// ActionListener - handles this event
		// ActionList takes one method below
		// Method is automatically called when ever events occurs
		public void actionPerformed (ActionEvent marcosEvent) {	// Built-in method
			
			// Variable outputs string
			String text = "";
			
			if(marcosEvent.getSource() == plet1)
				text = String.format("filed 1: %s", marcosEvent.getActionCommand());	// gets the text from plet1
			
			else if(marcosEvent.getSource() == plet2)
				text = String.format("filed 2: %s", marcosEvent.getActionCommand());	// gets the text from plet2
			
			else if(marcosEvent.getSource() == plet3)
				text = String.format("filed 3: %s", marcosEvent.getActionCommand());	// gets the text from plet3
			
			else if(marcosEvent.getSource() == passwordPlet)
				text = text.format ("Password is: %s", marcosEvent.getActionCommand());
			
			// Outputs on screen
			JOptionPane.showMessageDialog(null, text);	// JOptionPane - blank window / null - positioning
		}
	}
	
}
