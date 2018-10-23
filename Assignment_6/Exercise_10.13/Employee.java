public abstract class Employee{
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	Date birthDate;
	public Employee(String firstName, String lastName, String socialSecurityNumber, int month, int day, int year){
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
		birthDate = new Date(month, day, year);
	}
	public String getFirstName(){
		return firstName;
	}
	public String getLastName(){
		return lastName;
	}
	public String getSocialSecurityNumber(){
		return socialSecurityNumber;
	}
	@Override
	public String toString(){
		return String.format("%s, %s SSN: %s", getLastName(), getFirstName(), getSocialSecurityNumber());
	}
	
	public abstract double earnings();
}
