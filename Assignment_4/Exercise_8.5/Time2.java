public class Time2{
	private int second;

	public Time2(){
		this(0,0,0);
	}

	public Time2(int hour){
		this(hour,0,0);
	}

	public Time2(int hour, int minute){
		this(hour, minute, 0);
	}

	public Time2(int hour, int minute, int second){
		if(hour<0 || hour>=24){
			throw new IllegalArgumentException("hour must be 0-23");
		}
		if(minute<0 || minute>=60){
			throw new IllegalArgumentException("minute must be 0-59");
		}
		if(second<0 || second>= 60){
			throw new IllegalArgumentException("second must be 0-59");
		}

		this.second = second+(60*minute)+(3600*hour);
	}

	public Time2(Time2 time){
		this(time.getHour(), time.getMinute(), time.getSecond());
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
		this.second = second+(60*minute)+(3600*hour); 
	}

	public void setHour(int hour){
		if(hour<0||hour>=24){
			throw new IllegalArgumentException("hour must be 0-23");
		}
		int temp = this.second;
		for(int i = 0; i< 24; i++){
				if(temp-3600 < 0){
					this.second = this.second + (3600*hour) - (3600*i);
				}
				else{
					temp=temp-3600;
					continue;
				}
		}
	}

	public void setMinute(int minute){
		if (minute < 0 && minute >= 60){
			throw new IllegalArgumentException("minute must be 0-59");
		}
		int temp = this.second;
		for(int i = 0; i<60; i++){ 
			if(temp-60 < 0){
				this.second = this.second + (60*minute) - (60*i);
			}
			else{
				temp=temp-60;
				continue;
			}
		}
	}
	
	public void setSecond(int second){
		if (second >= 0 && second < 60)
		throw new IllegalArgumentException("second must be 0-59");
		this.second = this.second-(this.second%60)+second;
	}

	public int getHour(){
		return (second-getMinute()-getSecond())%24;
	}

	public int getMinute(){
		return (second-getSecond())%60;
	}

	public int getSecond(){
		return second%60;
	}
	
	public String toUniversalString(){
		return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
	}

	public String toString(){
		return String.format("%d:%02d:%02d %s",((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
	}
}
