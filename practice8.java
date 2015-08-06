import java.util.Scanner; 
public class practice8{
	public static boolean isValidInt(String testIntval)  
	{
	     if(testIntval == null)
	        return false;  
	     try{   
          java.lang.Integer.parseInt(testIntval);  
     }catch(Exception e){
        return false;  
     }
     return true;  
}  

public static void main (String[] args) {
	String testIntval;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter value: ");
	testIntval = sc.nextLine();
	isValidInt(testIntval);
}
}
