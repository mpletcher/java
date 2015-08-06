/* *
Author: Marcos R. Pletcher
Email: marcos_rochapletcher@student.uml.edu
Date: March, 12 2015
Assignment: Program 7
Course #: 90.297.061
*/
package exceptions;

public class ArrayUtils {

	// method searches its parameter array to locate the minimum value, and returns it.
    public static int minValue(int[] list) throws BadArrayException {

        if (list == null) {
            throw new BadArrayException("Array is null");
        }

        if (list.length == 0) {
            throw new BadArrayException("Array is empty");
        }


        int index = list[0];
        int again = 0;
        int minValue = list[again];

        
        while (again < list.length) {
            
            if (list[again] < minValue) {
                minValue = list[again];
            }
            again++;
        }
        return minValue;
    }

    // Method copies the specified range of elements from the parameter array into a new array, and returns it.
    public static int[] copyRange(int[] list, int startIndex) throws ArrayIndexOutOfBoundsException, BadArrayException {

        if (list == null) {
            throw new BadArrayException("Array is null");
        }

        if (startIndex < 0) {
            throw new ArrayIndexOutOfBoundsException(startIndex);
        }
        if (startIndex > list.length) {
            throw new ArrayIndexOutOfBoundsException(startIndex);
        }

        int newLength = list.length - startIndex;
        
        int index = startIndex;
       
        int again = 0;
        // declaration of our new array
        int[] newList = new int[newLength];

        while (again < newLength) {
            newList[again] = list[index];
            index++;
            again++;
        }
        return newList;
    }

    /**
	This method searches its parameter array to locate the first occurrence of the parameter searchValue, 
	and returns its index position if found, or -1 if not found.
     */
    public static int indexOf(int[] list, int searchValue) throws BadArrayException {

        if (list == null) {
            throw new BadArrayException("Array is null");
        }
        if (list.length == 0) {
            return -1;
        }

        int index = list[0];
        int again = 0;

        while (again < list.length) {

            if (searchValue == list[again]) {
                return again;
            } else {
                try {
                    again++;
                    index = list[again];
                } catch (ArrayIndexOutOfBoundsException e) {
                    return -1;
                }
            }
        }

        return -1;
    }

    /**
	This method searches its parameter array to locate the last occurrence of the parameter searchValue, 
	and returns its index position if found, or -1 if not found.
     */
    public static int lastIndexOf(int[] list, int searchValue) throws BadArrayException {

        if (list == null) {
            throw new BadArrayException("Array is null");
        }
        if (list.length == 0) {
            return -1;
        }
        
        int validIndex = -1;


	int x;
        for(x = 0; x < list.length;x++){

            if (searchValue == list[x]) {
                validIndex = x;		
            } 
        }

        return validIndex;
    }
}
