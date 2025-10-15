
public class Driver {

    public static void main(String[] args) {
    	
    	//Create objects of each class 
    	
    	//hourly Applicant
        HourlyApplicant h1 = new HourlyApplicant("Samit", "Sandhu", 123456789L, 25.0, 40);
        HourlyApplicant h2 = new HourlyApplicant("John", "Doe", 987654321L, 30.0, 35);
        HourlyApplicant h3 = new HourlyApplicant("Jane", "Smith", 111222333L, 20.0, 45);
        
        
        //Commission Applicant
        CommissionApplicant c1 = new CommissionApplicant("Mike", "Lee", 444555666L, 5000, 0.10);
        CommissionApplicant c2 = new CommissionApplicant("Sara", "Khan", 777888999L, 7000, 0.12);
        CommissionApplicant c3 = new CommissionApplicant("Nina", "Patel", 111111222L, 6000, 0.15);

        
        
        //Data Displayed and Manipulation 
        System.out.println("--- Hourly Applicants ---");
        System.out.println(h1.toString());
        h1.setHours(47.5);
        System.out.println(h2.toString());
        h2.setWage(40);
        System.out.println(h3.toString());

        System.out.println("\n--- Commission Applicants ---");
        System.out.println(c1.toString());
        c1.setCommissionRate(0.50);
        System.out.println(c2.toString());
        c2.setGrossSales(250000.25);
        System.out.println(c3.toString());
        
        //Validation
        h3.setHours(-2); //Validation - Should throw error
        
        
    }
}
