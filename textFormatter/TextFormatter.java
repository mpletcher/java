/* *
Program file: TextFormatter.java
Author: Marcos R. Pletcher
Email: marcos_rochapletcher@student.uml.edu
Date: March, 26 2015
Assignment: Program 8
Course #: 90.297.061
*/
package textFormatter;
import java.io.File;
import java.util.Scanner;

public class TextFormatter {

    static Scanner input = new Scanner(System.in);
    static File inputFile;
    static File outputFile;
    static TextForm tF = new TextForm();

    public static void main(String[] args) {

        boolean correctInput = false;
        String inputFileName = "default.txt";

        while (!correctInput) {

            inputFileName = tF.NewFileName("Input");

            try {
      
                inputFile = new File(inputFileName);

                if (inputFile.exists()) {

                    correctInput = true;

                } else {
                    throw new Exception("File not found. Try again.");
                }

            } catch (Exception e) {
       
                System.err.println(e.getMessage());
            }
        }

        correctInput = false;
        int lineLength = 0;
        String temp = "";
        while (!correctInput) {
            try {
                System.out.print("Line Length (30-100) -> ");
                temp = input.nextLine();

                lineLength = Integer.parseInt(temp);
	
                if (lineLength >= 30 && lineLength <= 100) {
                    correctInput = true;
                } else {
                    throw new NumberFormatException("Number out of range. (30-100)");
                }
            } catch (NumberFormatException nfe) {
                System.err.println(nfe.getMessage());
                correctInput = false;
            }
        }

        correctInput = false;
        String outputFileName = "default.txt";

        while (!correctInput) {

            outputFileName = tF.NewFileName("Output");

            try {

                outputFile = new File(outputFileName);

                if (outputFile.exists()) {


                    System.out.print("File exists. Would you like to overwrite? (y/n): ");
                    String overwrite = input.nextLine();
                    if (overwrite.equals("y") || overwrite.equals("Y")) {
            
                        outputFile.delete();
                        outputFile.createNewFile();
                        correctInput = true;
                    } else {
                        outputFileName = tF.NewFileName("Output");
                        correctInput = false;
                        continue;
                    }

                } else {
                    outputFile.createNewFile();
                    break;
                }

            } catch (Exception e) {
    
                System.err.println(e.getMessage());
            }
        }

          
        String formattedText = tF.FormatFileToString(inputFileName, lineLength);

      
        StringBuilder endingString = new StringBuilder();

       
        int x;
        for (x = 0; x < lineLength; x++) {
            endingString.append("*");
        }
        
        endingString.append("\n");
        endingString.append(formattedText);
        endingString.append("\n");
       
        tF.SaveStringToFile(outputFile.toString(), endingString.toString());


    }
}
