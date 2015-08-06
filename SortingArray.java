/* *

Program file: PletcherProg5.java
Author: Marcos R. Pletcher
Email: marcos_rochapletcher@student.uml.edu
Date: February, 26 2015
Assignment: Program 5
Course #: 90.297.061

*/

import java.util.Scanner;
public class SortingArray {

	public static void main(String[] args) {
		
		// Local array
		int localArray;

		// Do/While loop prompts the user to type the size of array
		do
		{
			System.out.println("Enter the size of the array (3 to 10):"); // 0 1 2 3 4 5 6 7 8 9
			Scanner inputtedArray = new Scanner(System.in);
			localArray = inputtedArray.nextInt(); // it adds the inputting value into localArray
		} while (localArray < 3 || localArray > 10); // it verifies the range of typing values
	
	// It prompts the user to type values
	System.out.println("Enter "+ localArray + " values"); 
	
	int[] array = new int[localArray]; // Dynamically int array
	
	//It reads values into the array (passing its local array as the parameter)
	SortingArray.fillArray(array);

	//It prints the unsorted values (passing its local array as the parameter)
	System.out.println("The unsorted values...");
	
	// It sorts the array values into ascending order (passing its local array as the parameter)
	SortingArray.printArray(array);
	
	//It prints the unsorted values  (passing its local array as the parameter)
	System.out.println("The sorted values...");
	
	SortingArray.sortArray(array);
	
	SortingArray.printArray(array);
	}
	

    /**
     * Method fills the parameter array with values. 
     * It creates a local Scanner object, loops once for each array element, 
     * prompts for a value, reads an integer value using the Scanner, 
     * and assigns it to the array element.
     */
	public static void fillArray(int[] array){
		Scanner keyboard = new Scanner(System.in);
		for (int i = 0; i < array.length; i++)
		{
			System.out.println("Enter value for element " + i);
			array[i] = keyboard.nextInt();
		}
	
	}
	
	// Method prints all the values in the parameter array
	public static void printArray(int[] array){
		for (int i = 0; i < array.length; i++)
		{
			System.out.println(array[i]);
		}
	}
	
	// Method sorts the values in the parameter array into ascending order
	public static void sortArray(int[] array){
		int temp;
		boolean swapped;
		
		do
		{
			swapped = false;
			for (int i = 0; i < array.length - 1; i++)
			{
				if(array[i] > array[i + 1])
				{
					temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
					swapped = true;
				}
			}
		} while (swapped == true);

	}
}
