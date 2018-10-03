public class Date{
	private int day;
	private int month;
	private int year;
	private String monthName;
	private int yearDay;
	private static final String[] monthNameList = {" ", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
	private static final int[] leapDays = {0,31,60,91,121,152,182,213,244,274,305,335,366};
	private static final int[] commonDays = {0,31,59,90,120,151,181,212,243,273,304,334,365};
	
	public Date(){};
	
	public Date(int month, int day, int year){
		this.month = month;
		this.day = day;
		this.year = year;
		this.monthName = monthNameList[this.month];
		if(leap(year)==false){
			this.yearDay = commonDays[month-1]+day;
		}
		else if(leap(year)==true){
			this.yearDay = leapDays[month-1]+day;
		}
	}
	
	public Date(String month, int day, int year){
		this.monthName = month;
		this.day = day;
		this.year = year;
		for(int i = 0; i<13; i++){
			if(monthName.equals(monthNameList[i])){
				this.month = i;
			}
		}
		if(leap(year)==false){
			this.yearDay = commonDays[this.month-1]+day;
		}
		else if(leap(year)==true){
			this.yearDay = leapDays[this.month-1]+day;
		}
	}
	
	public Date(int day, int year){
		this.year = year;
		this.yearDay = day;
		if(leap(year)==false){
			for(int i = 1; i<13; i++){
				if(day>commonDays[i-1] && day<=commonDays[i]){
					this.month = i;
					this.monthName = monthNameList[i];
					this.day = day-commonDays[i-1];
				}
			}
		}
		else if(leap(year)==true){
			for(int i = 1; i<13; i++){
				if(day>leapDays[i-1] && day<=leapDays[i]){
					this.month = i;
					this.monthName = monthNameList[i];
					this.day = day-leapDays[i-1];
				}
			}	
		}
	
	}
	
	public boolean leap(int year){
		if (year % 4 != 0) {
			return false;
		}
		else if (year % 400 == 0) {
			return true;
		}
		else if (year % 100 == 0) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public String toString1(){
		return String.format("%d/%d/%d", month, day, year);
	}
	
	public String toString2(){
		return String.format("%s %d, %d", monthName, day, year);
	}
	
	public String toString3(){
		return String.format("%d %d", yearDay, year);
	}
}