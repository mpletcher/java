package JavaRevision;

public class ArrayTable {
	public static void main(String args[]){	// Header
		System.out.println("Index\tValue");
		int arr[] = {10,4,8,2,24}; // index
		
		for(int x = 0; x < arr.length; x++){
			System.out.println(x + "\t" + arr[x]); // x has the same value as the index
		}
		
		System.out.println("\nSumming array values: ");	
		
		int sum = 0; // It starts with 0
		
		for(int x = 0; x < arr.length; x++){
			sum += arr[x];
		}
		
		System.out.println("The sum is " + sum + ".");	
	}

}