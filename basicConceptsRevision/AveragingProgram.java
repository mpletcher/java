package JavaRevision;
import java.util.Scanner;

public class AveragingProgram {
	public static void main(String args[]){
		Scanner varNumb = new Scanner(System.in); // System.in is the keyboard
		
		int total = 0;
		int counter = 0;
		int grade, average;
		
		while (counter < 10){
			grade = varNumb.nextInt();
			
			total = total + grade;
			counter++;
		}
		
		average = total / 10;
		System.out.println("Average is " + average);
	}

}
