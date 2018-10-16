public class HourlyEmployee extends Employee{
	private double hoursWorked;
	private double wage;
	
	public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double hoursWorked, double wage){
		super(firstName, lastName, socialSecurityNumber);
		setHoursWorked(hoursWorked);
		setWage(wage);
	}
	
	public void setHoursWorked(double hoursWorked){
		if(hoursWorked < 0 || hoursWorked > 168 ){
			throw new IllegalArgumentException("Hours worked must not exceed the maximum hours in a week");
		}
		this.hoursWorked = hoursWorked;
	}
	
	public void setWage(double wage){
		if(wage < 0 ){
			throw new IllegalArgumentException("Wage must be a nonnegative value");
		}
		this.wage = wage;
	}
	
	public double getHoursWorked(){
		return hoursWorked;
	}
	
	public double getWage(){
		return wage;
	}
	
	public double earnings(){
		return hoursWorked * wage;
	}
	
	@Override
	public String toString(){
		return String.format("%s, %s SSN: %s%n Hours Worked: %f%n Wage: %f%n Total Earnings: %f%n", getLastName(), getFirstName(), getSocialSecurityNumber(), hoursWorked, wage, earnings()); 
	}
	
	
	
}