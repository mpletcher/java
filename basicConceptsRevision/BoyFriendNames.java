package JavaRevision;
import java.util.Scanner;

public class BoyFriendNames {
	public static void main (String args[]){
	
	Scanner boyName = new Scanner(System.in);
	firstboyfriend firstboyfriendObject = new firstboyfriend();
	
	System.out.println("What's the name of your boyfriend? ");
	String hisName = boyName.nextLine();
	firstboyfriendObject.setName(hisName);
	
	firstboyfriendObject.saying();
	}

}
