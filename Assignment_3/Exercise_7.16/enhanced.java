import java.util.*;

public class enhanced{
	public static void main(String[] args){
		double sum=0;
		for(String number : args){
			sum+=Double.parseDouble(number);
		}
		System.out.println("Sum: " + sum);


	
	}
}
