package JavaRevision;

// Enums are lists of constants
public enum Enumeration {
	// Objects
	Marcos ("Programmer", "29"),
	Tim ("Audit Assistant", "29"),
	Thais ("Lawyer", "33"),
	Patricia ("Accountant", "40");
	
	private final String description;
	private final String age;
	
	// Enum construction
	// Allows to set variables
	Enumeration (String desc, String year) {
		description = desc;
		age = year;
	}

	// Methods to get the variables
	public String getDescription() {
		return description;
	}
	
	// Methods to get the variables
	public String getAge() {
		return age;
	}
}
