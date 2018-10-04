import java.util.*;

public class test extends Time2{
	public static void main(String[] args){
		Time2 time = new Time2(2, 2, 1);
		System.out.println(time.toString());
		System.out.println(time.toUniversalString());

		time.setTime(1, 1, 1);
		System.out.println(time.toString());
		System.out.println(time.toUniversalString());
		
		time.setHour(13);
		//System.out.println("Hour: " +time.getHour());
		System.out.println(time.toString());
		System.out.println(time.toUniversalString());
		
		time.setMinute(4);
		//System.out.println("Minute: " +time.getMinute());
		System.out.println(time.toString());
		System.out.println(time.toUniversalString());
		
		time.setSecond(25);
		//System.out.println("Second: " +time.getSecond());
		System.out.println(time.toString());
		System.out.println(time.toUniversalString());


	}


}
