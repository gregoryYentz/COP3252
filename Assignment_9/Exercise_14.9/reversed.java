import java.util.*;

public class reversed{
	public static void main(String[] args){
		Scanner userInput = new Scanner(System.in);
		String str = userInput.nextLine();

		String[] tokens = str.split(" ");
		String reverse = new String();
		for(String token : tokens){
			reverse = new StringBuffer(token).reverse().toString();
			System.out.printf("%s ", reverse);
		}
		System.out.println();

	}





}
