/*	Gregory Yentz
*	COP3252	gcy16
*/

import java.util.*;

public class integers{

	public static void main(String args[]){
		int num1;
		int num2;
		int num3;

		Scanner userInput = new Scanner(System.in);

		System.out.print("Enter first integer: ");
		num1 = userInput.nextInt();
		System.out.print("Enter second integer: ");
		num2 = userInput.nextInt();
		System.out.print("Enter third integer: ");
		num3 = userInput.nextInt();
	
		System.out.println("Sum: " + (num1+num2+num3));
		System.out.println("Average: " + ((num1+num2+num3)/3));
		System.out.println("Product: " + (num1*num2*num3));
		
		if((num1<=num2) && (num1<=num3)){
			System.out.println("Smallest: " + num1);
			if(num2>=num3){
				System.out.println("Largest: " + num2);
			}
			else{
				System.out.println("Largest: " + num3);
			}
		}
		else if((num2<=num1) && (num2<=num3)){
			System.out.println("Smallest: " + num2);
			if(num1>=num3){
				System.out.println("Largest: " + num1);
			}
			else{
				System.out.println("Largest: " + num3);
			}
		}
		else if((num3<=num1) && (num3<=num2)){
			System.out.println("Smallest: " + num3);
			if(num1>=num2){
				System.out.println("Largest: " + num1);
			}
			else{
				System.out.println("Largest: " + num2);
			}
		}
	}
}
