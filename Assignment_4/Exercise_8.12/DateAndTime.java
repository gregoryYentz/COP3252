public class DateAndTime{
	private int hour;
	private int minute;
	private int second;
	private int month;
	private int day; 
	private int year;

	private static final int[] daysPerMonth = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public DateAndTime(int month, int day, int year, int hour, int minute, int second){
		Date(month, day, year);
		Time2(hour, minute, second);
	};

	public DateAndTime(int month, int day, int year, int hour, int minute){
		Date(month, day, year);
		Time2(hour, minute);
	};
	
	public DateAndTime(int month, int day, int year, int hour){
		Date(month, day, year);
		Time2(hour);
	};

	public DateAndTime(int month, int day, int year){
		Date(month, day, year);
		Time2();
	};
	
	public DateAndTime(){};
	
	public void Date(int month, int day, int year){
		if (month <= 0 || month > 12){
			throw new IllegalArgumentException("month (" + month + ") must be 1-12");
		}
		if (day <= 0 || (day > daysPerMonth[month] && !(month == 2 && day == 29))){
			throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");
		}
		if (month == 2 && day == 29 && !(year % 400 == 0 ||(year % 4 == 0 && year % 100 != 0))){
			throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");
		}
		if(year < 0){
			throw new IllegalArgumentException("year (" + year + ") out-of-range");
		}
		this.month = month;
		this.day = day;
		this.year = year;
		System.out.printf("Date object constructor for date %s%n", this);
	}

	public void Time2(){
		this.hour=0;
		this.minute=0;
		this.second=0;
	}

	public void Time2(int hour){
		this.hour=hour;
		this.minute=0;
		this.second=0;
	}

	public void Time2(int hour, int minute){
		this.hour=hour;
		this.minute=minute;
		this.second=0;
	}

	public void Time2(int hour, int minute, int second){
		if(hour<0 || hour>=24){
			throw new IllegalArgumentException("hour must be 0-23");
		}
		if(minute<0 || minute>=60){
			throw new IllegalArgumentException("minute must be 0-59");
		}
		if(second<0 || second>= 60){
			throw new IllegalArgumentException("second must be 0-59");
		}

		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public void setTime(int hour, int minute, int second){
		if (hour < 0 || hour >= 24){
			throw new IllegalArgumentException("hour must be 0-23");
		}
		if (minute < 0 || minute >= 60){
			throw new IllegalArgumentException("minute must be 0-59");
		}
		if (second < 0 || second >= 60){
			throw new IllegalArgumentException("second must be 0-59");
		}
		this.hour = hour;
		this.minute = minute;
		this.second = second; 
	}

	public void setHour(int hour){
		if(hour<0||hour>=24){
			throw new IllegalArgumentException("hour must be 0-23");
		}
		this.hour = hour;
	}

	public void setMinute(int minute){
		if (minute < 0 && minute >= 60)
		throw new IllegalArgumentException("minute must be 0-59");
		this.minute = minute;
	}
	
	public void setSecond(int second){
		if (second >= 0 && second < 60)
		throw new IllegalArgumentException("second must be 0-59");
		this.second = second;
	}
	
	public void tick(){
		second++;
		if(second>59){
			incrementMinute();
			second=0;
		}
	}
	
	public void incrementMinute(){
		minute++;
		if(minute>59){
			incrementHour();
			minute=0;
		}
	}
	
	public void incrementHour(){
		hour++;
		if(hour>23){
			nextDay();
			hour=0;
		}
	}
	
	public void nextDay(){
		day++;
		if(day > daysPerMonth[month]){
			month++;
			day=1;
			if(month > 12){
				year++;
				month=1;
			}
		}
	}

	public int getHour(){
		return hour;
	}

	public int getMinute(){
		return minute;
	}

	public int getSecond(){
		return second;
	}
	
	public String toUniversalString(){
		return String.format("%d/%d/%d %02d:%02d:%02d", month, day, year, getHour(), getMinute(), getSecond());
	}
	
	public String toString(){
		return String.format("%d/%d/%d %d:%02d:%02d %s", month,  day, year, ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
	}

}
