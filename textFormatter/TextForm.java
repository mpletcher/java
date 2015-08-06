package textFormatter;

/* *
Program file: TextFormatter.java
Author: Marcos R. Pletcher
Email: marcos_rochapletcher@student.uml.edu
Date: March, 26 2015
Assignment: Program 8
Course #: 90.297.061
*/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TextForm {

    Scanner input = new Scanner(System.in);

    public String FormatFileToString(String inputFile, int lineLength) {

	BufferedReader br = null;
	StringBuilder output = new StringBuilder();

	try {
	    String currentLine;


	    br = new BufferedReader(new FileReader(inputFile));

	    int currLineLength = 0;


	    while ((currentLine = br.readLine()) != null) {
	
		String[] tempList = currentLine.split("[ \t\n]+");

		for (String word : tempList) {

		    if ((currLineLength + word.length()) > lineLength) {

			boolean lineOk = false;
			while (!lineOk) {
			    if (word.length() > lineLength) {

				String tempLine = word.substring(0, Math.abs(lineLength - currLineLength));
				output.append(tempLine);
				output.append("\n");

				String tempLine2 = word.substring(Math.abs(lineLength - currLineLength));
	
				currLineLength = tempLine2.length();
			
				if (currLineLength > lineLength) {
			
				    word = tempLine2;
				    lineOk = false; 
				} else {
				    output.append(tempLine2); 
				    lineOk = true;
				}

			    } else {
				lineOk = true;
				output.append("\n");
				output.append(word);
				output.append(" ");
				currLineLength = word.length() + 1; 
			    }

			}

		    } else {
			output.append(word);
			output.append(" ");
			currLineLength += word.length(); 
			currLineLength++; 
		    }
		}
	    }	    
	    br.close();
	} catch (IOException e) {
	    System.err.println(e.getMessage());
	}

	return output.toString();
    }

    public void SaveStringToFile(String fileName, String stringInput) {

	File file = new File(fileName);
        
	try {
	
	    FileWriter fw = new FileWriter(file.getAbsoluteFile());
	    BufferedWriter bw = new BufferedWriter(fw);

	    bw.write(stringInput); 

	    bw.close(); 

	} catch (IOException ioe) {
	    System.err.println(ioe.getMessage());
	}

	System.out.println("Output written to: " + file.getAbsolutePath());
    }

    public String NewFileName(String type) {
	System.out.print(type + " File name -> ");
	String outputFileName = input.nextLine();
	return outputFileName;
    }
}
