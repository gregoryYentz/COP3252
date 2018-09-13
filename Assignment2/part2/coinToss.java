/*
	Gregory Yentz
	gcy16
	COP3252
*/

import java.util.*;
import java.lang.*;
import java.security.SecureRandom;

public class coinToss{
	private static final SecureRandom randomNumbers = new SecureRandom();
	public enum Coin{HEADS, TAILS};
	public static void main(String[] args){
		int choice;
		Coin coin;
		Scanner userInput = new Scanner(System.in);
		int headsNum = 0;
		int tailsNum = 0;
		while(true){
			System.out.println("1 - Toss Coint\n2 - Exit");		
			choice = userInput.nextInt();
			if(choice==2){
				System.out.println("Number of HEADS: " + headsNum);
				System.out.println("Number of TAILS: " + tailsNum);
				System.exit(0);
			}
			else if(choice==1){
				coin = flip();
				if(coin==Coin.HEADS){
					System.out.println("HEADS");
					headsNum++;
				}
				else if(coin==Coin.TAILS){
					System.out.println("TAILS");
					tailsNum++;
				}
				else{
					System.out.println("Error!");
				}
			}
			else{
				System.out.println("Invalid Input!");
			}
		}	
	}
	public static Coin flip(){
		int x = randomNumbers.nextInt()%2;
		if(x==0){
			return Coin.HEADS;
		}
		else{
			return Coin.TAILS;
		}
	}
}
