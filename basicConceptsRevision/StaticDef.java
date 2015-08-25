package JavaRevision;


public class StaticDef {
    private String firstName;
    private String lastName;
    private static int clients = 0; 
    
    public StaticDef(String fn, String ln){
        firstName = fn;
        lastName = ln;
        clients++;
        System.out.printf("Name: %s %s, client number : %d\n", firstName, lastName, clients);
    }
    
    // Get getFirstName, getLastName, and clients
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public static int getClients(){
        return clients;
    }
}