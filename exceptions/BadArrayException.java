/* *
Author: Marcos R. Pletcher
Email: marcos_rochapletcher@student.uml.edu
Date: March, 12 2015
Assignment: Program 7
Course #: 90.297.061
*/
package exceptions;

public class BadArrayException extends Exception {
	
	// Default constructor with no arguments.
	public BadArrayException() {
	}
	
	// Constructor taking a String parameter (the exception message).
	public BadArrayException(String message) {
		super(message);
	}
}