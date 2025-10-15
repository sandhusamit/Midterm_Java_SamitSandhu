
public class HourlyApplicant extends Applicant {
	/*
	 * This class inherits applicant class. 
	 * Its specifically to calculate the earnings of an employee working on an hourly basis. 
	 * Earnings() method will be overridden here. 
	 */
	
	//required attributes - private because only this class will need it
	private double wage;
	private double hours;
	
	


	//Constructor
	public HourlyApplicant(String firstName, String lastName, long sin, double wage, double hours)
	{
		super(firstName, lastName, sin); //attributes inherited form super class - Applicant
		
		//Validation
        if (wage < 0 || hours < 0) 
        	throw new IllegalArgumentException("Wage and hours must be positive");
        this.wage = wage;
        this.hours = hours;
		
	}
	
	//Setter and getters 
	public double getWage() {
		return wage;
	}


	public void setWage(double wage) {
        if (wage < 0) throw new IllegalArgumentException("Wage must be positive");
        this.wage = wage;;
        System.out.println(toString());
	}


	public double getHours() {
		return hours;
	}


	public void setHours(double hours) {
        if (hours < 0) throw new IllegalArgumentException("Hours must be positive");
        this.hours = hours;
        System.out.println(toString());
	}
	
	//Methods 
    public String toString() {
        return firstName + " " + lastName + " | Hourly Wage: $" + wage + " | Hours: " + hours + " | Earnings: $" + Earnings();
    }
	//override earnings from super class
    @Override
    public double Earnings() {
        return wage * hours;
    }

}
