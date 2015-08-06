package exceptions;
/**
 * ArrayUtilsDemo - tests the ArrayUtils class with exception handling.
 *
 * The ArrayUtils class and BadArrayException class must be compiled
 * before this class can be compiled.
 */
import java.util.Scanner;

public class ArrayUtilsDemo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Testing ArrayUtils class exception handling - 3/12/2005");
        System.out.println();

        // --- minValue tests ---
        {
            System.out.println();
            System.out.println("--- Testing minValue method ---");

            // Check that minValue detects a null array.
            System.out.println();
            System.out.println("Getting minVal of a null array");
            int[] array = null;
            try {
                int min = ArrayUtils.minValue(array);
                System.out.println("  ERROR - minValue should throw an exception for null array");
            } catch (BadArrayException e) {
                System.out.println("  OK - minValue threw exception for null array: " +
                    e.toString());
            } catch (Exception e) {
                System.out.println("  ERROR - minValue threw an unexpected exception: " +
                    e.toString());
            }

            // Check that minValue detects an empty array
            System.out.println();
            System.out.println("Getting minVal of an empty array");
            array = new int[0];
            try {
                int min = ArrayUtils.minValue(array);
                System.out.println("  ERROR - minValue should throw an exception for array of size 0");
            } catch (BadArrayException e) {
                System.out.println("  OK - minValue threw exception for empty array: " +
                    e.toString());
            } catch (Exception e) {
                System.out.println("  ERROR - minValue threw an unexpected exception: " +
                    e.toString());
            }

            // Check that minValue works with array oflength 1
            int[] list0 = {10};
            testMinVal(list0, 10);

            // Check that minValue works with the minimum value in different positions.

            int[] list1 = {20, 30};
            testMinVal(list1, 20);

            int[] list2 = {40, 30};
            testMinVal(list2, 30);

            int[] list3 = {10, 10};
            testMinVal(list3, 10);

            int[] list4 = {15, 25, 35};
            testMinVal(list4, 15);

            int[] list5 = {25, 20, 30};
            testMinVal(list5, 20);

            int[] list6 = {50, 40, 30};
            testMinVal(list6, 30);

            int[] list7 = {50, -10, 40, -25, 50, 40, 30};
            testMinVal(list7, -25);

            // Check that minValue doesn't alter the contents of it's array parameter.
            int[] list8 = {200, 50, -40, 60, -15, 30, 75};
            int[] list8copy = arrayCopyOf(list8);
            testMinVal(list8, -40);

            if (!arrayEquals(list8, list8copy)) {
                System.out.println("  ERROR - minValue altered the contents of the array (it can't change the array)");
            }
        }

        // --- copyRange tests ---
        {
            System.out.println();
            System.out.println("--- Testing copyRange method ---");

            // Check that copyRange detects a null array
            System.out.println();
            System.out.println("Getting copyRange of a null array");
            int[] array = null;
            try {
                int[] result = ArrayUtils.copyRange(array, 0);
                System.out.println("  ERROR - copyRange should throw an exception for null array");
            } catch (BadArrayException e) {
                System.out.println("  OK - copyRange threw exception for null array: " +
                    e.toString());
            } catch (Exception e) {
                System.out.println("  ERROR - copyRange threw an unexpected exception: " +
                    e.toString());
            }

            int[] list = new int[0];
            testCopyRange(list, -1, true);
            testCopyRange(list, 0, false);
            testCopyRange(list, 1, true);

            int[] list2 = {20};
            testCopyRange(list2, -1, true);
            testCopyRange(list2, 0, false);
            testCopyRange(list2, 1, false);
            testCopyRange(list2, 2, true);

            int[] list3 = {10,15};
            testCopyRange(list3, -1, true);
            testCopyRange(list3, 0, false);
            testCopyRange(list3, 1, false);
            testCopyRange(list3, 2, false);
            testCopyRange(list3, 3, true);

            int[] list4 = {30, 35, 40, 45, 50};
            int[] list4copy = arrayCopyOf(list4);
            testCopyRange(list4, -1, true);
            testCopyRange(list4, 0, false);
            testCopyRange(list4, 1, false);
            testCopyRange(list4, 2, false);
            testCopyRange(list4, 3, false);
            testCopyRange(list4, 4, false);
            testCopyRange(list4, 5, false);
            testCopyRange(list4, 6, true);

            if (!arrayEquals(list4, list4copy)) {
                System.out.println("  ERROR - copyRange altered the contents of the array (it can't change the array)");
            }
        }

        // --- indexOf and lastIndexOf tests ---

        {
            System.out.println();
            System.out.println("--- Testing indexOf and lastIndexOf method ---");

            // Check that indexOf detects a null array
            System.out.println();
            System.out.println("Getting indexOf of a null array");
            int[] array = null;
            try {
                int result = ArrayUtils.indexOf(array, 0);
                System.out.println("  ERROR - indexOf should throw an exception for null array");
            } catch (BadArrayException e) {
                System.out.println("  OK - indexOf threw exception for null array: " +
                    e.toString());
            } catch (Exception e) {
                System.out.println("  ERROR - indexOf threw an unexpected exception: " +
                    e.toString());
            }

            System.out.println();
            System.out.println("Getting lastIndexOf of a null array");
            try {
                int result = ArrayUtils.lastIndexOf(array, 0);
                System.out.println("  ERROR - lastIndexOf should throw an exception for null array");
            } catch (BadArrayException e) {
                System.out.println("  OK - lastIndexOf threw exception for null array: " +
                    e.toString());
            } catch (Exception e) {
                System.out.println("  ERROR - lastIndexOf threw an unexpected exception: " +
                    e.toString());
            }

            int[] list1 = new int[0];
            testIndexOf(list1, 5, -1);
            testLastIndexOf(list1, 5, -1);

            int[] list2 = {20};
            testIndexOf(list2, 20, 0);
            testIndexOf(list2, 25, -1);
            testLastIndexOf(list2, 20, 0);
            testLastIndexOf(list2, 25, -1);

            int[] list3 = {5, 10, 15, 20, 10, 15, 5, 10, 15, 20};
            testIndexOf(list3, 5, 0);
            testIndexOf(list3, 10, 1);
            testIndexOf(list3, 15, 2);
            testIndexOf(list3, 20, 3);
            testIndexOf(list3, 0, -1);
            testLastIndexOf(list3, 5, 6);
            testLastIndexOf(list3, 10, 7);
            testLastIndexOf(list3, 15, 8);
            testLastIndexOf(list3, 20, 9);
            testLastIndexOf(list3, 0, -1);
        }

        System.out.println();

        // Keep console window alive until 'enter' pressed (if needed).
        System.out.println("Done - press enter key to end program");
        System.out.println();
        String junk = sc.nextLine();

    }

    /**
     * Calls minValue with the test array and verifies the returned value is the expected result.
     *
     * @param testList the array of values
     * @param expectedMinValue - the value expected to be retured from minValue
     */
    private static void testMinVal(int[] testList, int expectedMinValue)
    {
        System.out.println();
        System.out.println("Getting minVal() of: " +
            arrayToString(testList) );

        try {
            int min = ArrayUtils.minValue(testList);
            if (expectedMinValue == min)
                System.out.println("  OK - expected minValue to return " + expectedMinValue +
                    " and got: " + min);
            else
                System.out.println("  ERROR - expected minValue to return " + expectedMinValue +
                   " but got: " + min);

        } catch (BadArrayException e) {
            System.out.println("  ERROR - minValue threw an unexpected BadArrayException: " +
                e.toString());
        } catch (Exception e) {
            System.out.println("  ERROR - minValue threw an unexpected exception: " +
                e.toString());
        }
    }

    /**
     * Calls copyRange with the test array and startIndex and verifies the return value
     * is the expected result.
     *
     * @param testList the array of values
     * @param startIndex the starting index for copying
     * @param expectExcp true if the test should throw an exception
     */
    private static void testCopyRange(int[] testList, int startIndex, boolean expectExcp)
    {
        System.out.println();
        System.out.println("Getting copyRange(list," + startIndex + ") of: " + arrayToString(testList) );

        try {
            int[] resultList = ArrayUtils.copyRange(testList, startIndex);
            if (expectExcp)
            {
                System.out.println("  ERROR - expected an exception, but none thrown");
                return;
            }

            int expectedLength = testList.length - startIndex;
            if (null == resultList)
                System.out.println("  ERROR - expected copyRange to return an array of length " +
                    expectedLength + " but got a null array");
            else if (resultList.length != expectedLength)
                System.out.println("  ERROR - expected copyRange to return an array of length " +
                    expectedLength + " but got length of " + resultList.length +
                    " and contents of: " + arrayToString(resultList));
            else if (testList == resultList)
                System.out.println("  ERROR - expected copyRange to return a copy of the list, but got the original list");
            else
            {
                int badIndex = -1;;
                for (int n=startIndex; n < testList.length; ++n)
                {
                    if (resultList[n-startIndex] != testList[n])
                    {
                        badIndex = n;
                        break;
                    }
                }

                if (-1 == badIndex)
                    System.out.println("  OK - copyRange copied the array correctly as " +
                        arrayToString(resultList));
                else
                    System.out.println("  ERROR - copyRange incorrectly copied the array - got: " +
                        arrayToString(resultList));
            }


        } catch (BadArrayException e) {
            if (expectExcp && null == testList)
                System.out.println("  OK - copyRange threw exception " + e.toString());
            else
                System.out.println("  ERROR - copyRange threw an unexpected BadArrayException: " +
                    e.toString());
        } catch (ArrayIndexOutOfBoundsException e) {
            if (expectExcp &&
                (startIndex < 0 || startIndex > testList.length) )
                System.out.println("  OK - copyRange threw exception " + e.toString());
            else
                System.out.println("  ERROR - copyRange threw an unexpected ArrayIndexOutOfBoundsException: " +
                    e.toString());
        } catch (Exception e) {
            System.out.println("  ERROR - copyRange threw an unexpected exception: " +
                e.toString());
        }
    }

    /**
     * Calls indexOf with the test array and search value and verifies the returned value is the expected result.
     *
     * @param testList the array of values
     * @param searchVal the value to search for in the array
     * @param expectedIndex the value expected to be retured from minValue
     */
    private static void testIndexOf(int[] testList, int searchVal, int expectedIndex)
    {
        System.out.println();
        System.out.println("Getting indexOf(" + searchVal + ") of: " + arrayToString(testList) );

        try {
            int index = ArrayUtils.indexOf(testList, searchVal);
            if (expectedIndex == index)
                System.out.println("  OK - expected indexOf to return " + expectedIndex +
                    " and got: " + index);
            else
                System.out.println("  ERROR - expected indexOf to return " + expectedIndex +
                    " but got: " + index);

        } catch (BadArrayException e) {
            System.out.println("  ERROR - indexOf threw an unexpected BadArrayException: " +
                e.toString());
        } catch (Exception e) {
            System.out.println("  ERROR - indexOf threw an unexpected exception: " +
                e.toString());
        }
    }

    /**
     * Calls lastIndexOf with the test array and search value and verifies the returned value is the expected result.
     *
     * @param testList the array of values
     * @param searchVal the value to search for in the array
     * @param expectedIndex the value expected to be retured from minValue
     */
    private static void testLastIndexOf(int[] testList, int searchVal, int expectedIndex)
    {
        System.out.println();
        System.out.println("Getting lastIndexOf(" + searchVal + ") of: " +
            arrayToString(testList) );

        try {
            int index = ArrayUtils.lastIndexOf(testList, searchVal);
            if (expectedIndex == index)
                System.out.println("  OK - expected lastIndexOf to return " + expectedIndex +
                    " and got: " + index);
            else
                System.out.println("  ERROR - expected lastIndexOf to return " + expectedIndex +
                    " but got: " + index);

        } catch (BadArrayException e) {
            System.out.println("  ERROR - lastIndexOf threw an unexpected BadArrayException: " +
                e.toString());
        } catch (Exception e) {
            System.out.println("  ERROR - lastIndexOf threw an unexpected exception: " +
                e.toString());
        }
    }


    // internal test utility methods

    /**
     * @return a copy of the parameter array.
     */
    private static int[] arrayCopyOf(int[] original)
    {
        if (null == original)
            throw new IllegalArgumentException("'original' array parameter is null");
        int[] result = new int[original.length];
        for (int n= 0; n < original.length; ++n)
            result[n] = original[n];
        return result;
    }

    /**
     * @return true if the two array parameters are equal (same contents)
     */
    private static boolean arrayEquals(int[] a, int[] b)
    {
        if (null == a)
            throw new IllegalArgumentException("'a' array parameter is null");
        if (null == b)
            throw new IllegalArgumentException("'b' array parameter is null");
        if (a.length != b.length)
            throw new IllegalArgumentException("Array parameters differ in length");
        for (int n=0; n <a.length; ++n)
        {
            if (a[n] != b[n])
                return false;
        }
        return true;
    }

    /**
     * @return a string representation of the parameter array of the form "[val1,val2,val3,...]"
     */
    private static String arrayToString(int[] original)
    {
        if (null == original)
            throw new IllegalArgumentException("'original' array parameter is null");
        StringBuffer sbuf = new StringBuffer(original.length*4 + 2);
        sbuf.append('[');
        for (int n=0; n<original.length; ++n)
        {
            if (0 != n)
                sbuf.append(',');
            sbuf.append(Integer.toString(original[n]));

        }
        sbuf.append(']');
        return sbuf.toString();
    }


}