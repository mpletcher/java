package JavaRevision;

public class StaticDefMain {
    public static void main(String[] args){
    	StaticDef clients1 = new StaticDef("Marcos", "Pletcher");
    	StaticDef clients2 = new StaticDef("Tim", "Pletcher");
    	StaticDef clients3 = new StaticDef("Kathy", "Pletcher");
		
		System.out.println();
		System.out.println(clients1.getFirstName());
		System.out.println(clients2.getLastName());
		System.out.println(clients3.getClients());
		
		// Another way to get clients
		System.out.println(StaticDef.getClients());
	}
}
