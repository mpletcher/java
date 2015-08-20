package JavaRevision;
import java.util.Random;

public class ArrayAsCounters {
	public static void main(String args[]) {
		Random item = new Random();
	
		int occurrence[] = new int[11];
	
		for (int x = 1; x < 110; x++) {	// to roll the dice
			++occurrence[1+item.nextInt(10)]; // item.nextInt(10) - gives the number from 0 through 10
						// 1+ - takes one for any loop
		}
		
		System.out.println("Index\tFrequency");
		
		for (int index = 1; index < occurrence.length; index++){	// Outputs the data
			System.out.println(index + "\t" + occurrence[index]);
		}
	}
}
