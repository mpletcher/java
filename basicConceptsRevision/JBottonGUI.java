package JavaRevision;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class JBottonGUI extends JFrame {
	
	private JButton nButton;
	private JButton custom;
	
	// JFramne Constructor
	public JBottonGUI () {
		super ("JButton app");	// title on window
		setLayout (new FlowLayout());	// 
		
		// Object
		nButton = new JButton ("Rollover Icon");
		add (nButton);
		
		// Icon
		Icon b = new ImageIcon(getClass().getResource("b.png"));
		Icon x = new ImageIcon(getClass().getResource("x.png"));		
		
		// Takes image into buttons
		custom = new JButton ("custom", b);
		custom.setRolloverIcon(x); // Rollover
		add (custom);
		
		// Handling Event for button
		MyHandlingClass handler = new MyHandlingClass();
		nButton.addActionListener(handler);
		custom.addActionListener(handler);
		
	}
	
	// Handler class
	private class MyHandlingClass implements ActionListener {	// implements overrides all methods in its class
		public void actionPerformed (ActionEvent myEvent) {		// actionPerformed overrides ActionListener
			// What is going to happen when one clicks on buttons
			JOptionPane.showMessageDialog(null, String.format("%s", myEvent.getActionCommand()));			
		}
		
	}
}
