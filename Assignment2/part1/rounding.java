/*
	Gregory Yentz
	gcy16
	COP3252
*/

import java.lang.*;
import java.util.*;

public class rounding{
	public static void main(String[] args){
		Scanner userInput = new Scanner(System.in);
		double x;
		double y;
		System.out.print("Enter double value: ");
		x = userInput.nextDouble();
		y = Math.floor(x + 0.5);
		System.out.println("Rounded: " + y);


	}
}
