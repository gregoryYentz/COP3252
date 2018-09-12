import java.util.*;
import java.lang.*;

public class coinToss{
	public enum Coin{HEADS, TAILS};
	public static void main(String[] args){
		int choice;
		Coin coin;
		Scanner userInput = new Scanner(System.in);
		while(true){
			System.out.println("1 - Toss Coint\n2 - Exit");		
			choice = userInput.nextInt();
			if(choice==2){
				System.exit(0);
			}
			else if(choice==1){
				coin = flip();
				if(coin==Coin.HEADS){
					System.out.println("HEADS");
				}
				else if(coin==Coin.TAILS){
					System.out.println("TAILS");
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
		return Coin.HEADS;
	}
}
