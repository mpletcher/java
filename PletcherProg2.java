import java.util.Scanner;

/* *

Program file: PletcherProg2.java
Author: Marcos R. Pletcher
Email: marcos_rochapletcher@student.uml.edu
Date: February, 5 2015
Assignment: Program 2
Course #: 90.297.061
Objective: This assignment will prompt to the user type a sentence. Afterwards, It will convert that in URL encode. After that, An if statement will check those characters.

*/

public class PletcherProg2 
{
		
	public static void main(String[] args) throws java.lang.Exception
    {
 	
		// Prompt for a line of input to be URL encoded.
    	System.out.println("Enter a line of text to be encoded.");
	    Scanner in = new Scanner(System.in); 
	    
	    // Read the line of text into a String.
	    String outURL="";
	    String txt = in.nextLine();
	    
	    // Print the line that was read.
	    System.out.println("The String read is: " + txt);
	    int length = txt.length();
	    
	    // Initialized String containing all of the letters (both upper and lower case), digits, and other special characters.
	    String ascii="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789_*-.";
	    
	    // Print the number of characters.
	    System.out.println("Length in chars is: "+length);
    	
	    // For loop increments it's index variable from 0 up to the last character position in the input string.
	    for (int i = 0; i < length; i++)
	    {
	        if(txt.charAt(i)==' ')
	        
	        {
	            outURL+= "+";
        
	        }else if(ascii.indexOf(txt.charAt(i))!=-1)
	        
	        {
	            outURL+=txt.charAt(i);
	            
	        }else{
	            String hexValue = Integer.toHexString(txt.charAt(i));
	            outURL += '%' + hexValue;
	        }
	    }
	    
	    // Print the URL encoded String.
	    System.out.println("The encoded string: "+outURL);
	    
	    // Print the number of characters in the encoded String.
	    System.out.println("Length in chars is: " +outURL.length());
       
        // Keep console window alive until 'enter' pressed
        System.out.println();
     	String junk = in.nextLine();
    }
}


