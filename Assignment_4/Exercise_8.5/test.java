import java.util.*;

public class test extends Time2{
	public static void main(String[] args){
		Time2 time = new Time2(10, 10, 10);
		System.out.println(time.toUniversalString());
		System.out.println(time.toString());		
	
		time.setHour(4);

		System.out.println(time.toString());


	}


}
