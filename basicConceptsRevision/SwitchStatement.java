package JavaRevision;
import java.util.Scanner;

class SwitchStatement{
	public static void main (String args[]){
		int age;
		
		Scanner ageCont = new Scanner(System.in);
		System.out.println("Type an age (13, 21, 30, 45, or 60) ");
		age = ageCont.nextInt();
		
		switch (age) {
		case 13:
			System.out.println("You're a teenager");
			break;
		case 21:
			System.out.println("You're a college Student");
			break;
		case 30:
			System.out.println("You're 30!!!");	
			break;
		case 45:
			System.out.println("You should be a beautiful person");
			break;
		case 60:
			System.out.println("You should relax and travel to Alaska, Caribbean, or Hawaii");	
			break;
		default: // If none of those are true, does a default statement
			System.out.println("I could not find a definiton concerring your age.");				
		}
	}
}