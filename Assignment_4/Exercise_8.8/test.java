import java.util.*;

public class test extends Date{
	public static void main(String[] args){
		Date today = new Date(12, 31, 2018);
		for(int i = 0; i<366; i++){
			today.nextDay();
			System.out.println(today.toString());
		}

	}
}
