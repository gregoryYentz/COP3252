public class BasePlusCommissionEmployee extends CommissionEmployee{
	private double baseSalary;
	public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary){
		super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
		if (baseSalary < 0.0)
			throw new IllegalArgumentException("Base salary must be >= 0.0");
		this.baseSalary = baseSalary;
	}
	
	public void setBaseSalary(double baseSalary){
		if (baseSalary < 0.0)
			throw new IllegalArgumentException("Base salary must be >= 0.0");
		this.baseSalary = baseSalary;
	}
	
	public double getBaseSalary(){
		return baseSalary;
	}
	
	@Override // indicates that this method overrides a superclass method
	public double earnings(){
		return baseSalary + (getCommissionRate() * getGrossSales());
	}
	
	@Override
	public String toString(){
		return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f", "base-salaried commission employee", getFirstName(), getLastName(), "social security number", getSocialSecurityNumber(), "gross sales", getGrossSales(), "commission rate", getCommissionRate(), "base salary", baseSalary); 
	}
}
