
public abstract class Applicant {
	/*
	 * Applicant class skeleton (abstract) for getting earnings of either a hourly employee or 
	 * a commission employee. 
	 */
	
	String firstName; 
	String lastName; 
	long sin; //must be 9 digits max and all integer numbers
	
	//constructor for validation and subclass object creations
	
    public Applicant(String firstName, String lastName, long sin) {
    	
    	//validate values - cannot be empty or null
        if (firstName == null || firstName.isEmpty() ||
            lastName == null || lastName.isEmpty())  
        { 
    
            throw new IllegalArgumentException("Fields cannot be empty.");
        }
        //sin validation - 9 digits
        if (String.valueOf(sin).length() != 9) {
            throw new IllegalArgumentException("SIN must be exactly 9 digits.");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.sin = sin;
    }
	//will be overridden 
	public abstract double Earnings();
	
	

}
