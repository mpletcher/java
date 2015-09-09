package JavaRevision;
import javax.swing.JFrame;	// allows to used window

public class JBottonMain {
	public static void main (String args[])	{
		
		//GUI object
		JBottonGUI run = new JBottonGUI();
		run.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		run.setSize(300,200);
		run.setVisible(true);
		
	}
}
