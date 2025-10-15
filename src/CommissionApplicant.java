
public class CommissionApplicant extends Applicant{
	/*
	 * This class is inheriting Applicant class. 
	 * Its purpose is to calculate the earnings for a commission based employee.
	 * We will be using the Earnings method in the suepr-class and overriding it with appropriate logic for commission. 
	 */

	//Attributes private to contain use in side class
	private double grossSales;
	private double commissionRate;
	
	
	//Constructor 
	public CommissionApplicant(String firstName, String lastName, long sin, double grossSales, double commissionRate)
	{
	
		//super class inheritance 
		super(firstName, lastName, sin); 
		
		//Validation - ensure not empty or negative or more than 100%
        if (grossSales < 0 || commissionRate < 0 || commissionRate > 1)
            throw new IllegalArgumentException("Invalid sales or commission rate");
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
	}

	//Getter and Setters

	public double getGrossSales() {
		return grossSales;
	}

	
	public void setGrossSales(double grossSales) {
        if (grossSales < 0) throw new IllegalArgumentException("Gross sales must be positive");
        this.grossSales = grossSales;
        System.out.println(toString());
	}


	public double getCommissionRate() {
		return commissionRate;
	}


	public void setCommissionRate(double commissionRate) {
        if (commissionRate < 0 || commissionRate > 1)
            throw new IllegalArgumentException("Rate must be between 0 and 1");
        this.commissionRate = commissionRate;
        System.out.println(toString());

	}
	
	//Methods
	
    public String toString() {
        return firstName + " " + lastName + " | Gross Sales: $" + grossSales + " | Commission Rate: " + commissionRate +
               " | Earnings: $" + Earnings();
    }
	
	//override Earnings based on commission 
    @Override
    public double Earnings() {
        return grossSales * commissionRate;
    }

	
	
	
}
