import java.util.*;

public class test extends Time2{
	public static void main(String[] args){
		Time2 time = new Time2(22, 58, 59);
		System.out.println(time.toString());
	
		time.incrementHour();
		System.out.println(time.toString());

		time.incrementMinute();
		System.out.println(time.toString());

		time.tick();
		System.out.println(time.toString());









	}
}
