package JavaRevision;
import java.util.Random;

public class RandomNumber {
	public static void main(String args[]){
		Random item = new Random();
		int var;
		
		for(int i = 1; i < 10; i++){
			var = item.nextInt(6);
			System.out.println(var + " random");
		}
		
	}

}
