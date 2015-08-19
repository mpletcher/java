import java.util.Scanner;

class BasicCalculator {
	public static void main(String args[]){
		Scanner text = new Scanner(System.in);
		double firstVar, secondVar, answer;
		System.out.println("Enter first number: ");
		firstVar = text.nextDouble();
		System.out.println("Enter second number: ");
		secondVar = text.nextDouble();
		answer = firstVar + secondVar;
		System.out.println("The sum is "+ answer);
		
		// Pre-increment operator 
		System.out.println("Pre-increment operator of the firt number is "+ ++firstVar); // pre-increment
		// Post-increment operator 
		System.out.println("Post-increment operator of the firt number is " + firstVar++); // post-increment
		
		// Assignment operator 
		firstVar = firstVar + 5;
		System.out.println("The assignment operator:  (5 + first number) + first number is "+ firstVar);		
		
		secondVar += 10;
		System.out.println("The assignment operator: 10 + second number is "+ secondVar);	
		
	}
}