/* *

Program file: PletcherProg1.java
Author: Marcos R. Pletcher
Email: marcos_rochapletcher@student.uml.edu
Date: January, 29 2015
Assignment: Program 1
Course #: 90.297.061
Objective: This program will prompt the user to enter a simple sentence. Subsequently, after displaying that sentence typed, it will display that in lower case and upper case letters. The same program will also locate a specific word and determine its first occurrence. Afterwards, it will print the information  using capital letters.
*/

import java.util.Scanner;

public class PletcherProg1
{

	public static void main(String[] args)
        {
    		String s;
    		
    	// Create a scanner to read from keyboard	
    	Scanner keyboardScanner = new Scanner(System.in);
    	
    	System.out.println("Enter a line of text containing the word 'java' somewhere within it.");
    	
    	// Read the line of text (using the Scanner class nextLine method).
    	s = keyboardScanner.nextLine();
    	
    	// Print the line of text entered.
    	System.out.printf("The string read is: %s\n", s);

    	// Print the number of characters in the line (use the String class length() method)
  	    System.out.print("Length in chars is: ");
        System.out.println(s.length());
        
        // Print the line in lowercase letter (use the String class toLowerCase() method)
        System.out.print("All in lower case letters are: ");
        System.out.println(s.toLowerCase());
        
        //Print the line in uppercase letter (use the String class toUpperCase() method)
        System.out.print("All in upper case letters are: ");
        System.out.println(s.toUpperCase());
        
        // Locate the first occurrence of 'java' (use the String class indexOf() method), print the position value, and save it in a variable for the next step
        System.out.print("Found 'Java' at pos: ");
        System.out.println(s.indexOf("java"));
        int pos = s.indexOf("java"); 
        
        // Print the line with 'java' changed to 'Java'.
        System.out.println("Changing to 'Java': " + s.substring(0, pos) + s.substring(pos, pos+1).toUpperCase() + s.substring(pos + 1, pos + 4).toLowerCase() + s.substring(pos + 4, s.length()));
        
        // Print the line with 'java' changed to 'JAVA'.
        System.out.println("Changing to 'JAVA': " + s.substring(0, pos) + s.substring(pos, pos + 4).toUpperCase() + s.substring(pos + 4, s.length())); 
       
        // Keep console window alive until 'enter' pressed
        System.out.println();
        System.out.println("Done - press enter key to end program.");
    	String junk = keyboardScanner.nextLine();
        }

}