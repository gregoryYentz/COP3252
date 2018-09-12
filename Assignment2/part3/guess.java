import java.security.SecureRandom;
import java.util.Scanner;
import java.lang.Math;

public class guess{
	private static final SecureRandom randomNumbers = new SecureRandom();
	
	public static void main(String[] args){
		int x = 1;
		int y = 1;
		int w = 1;
		Scanner userInput = new Scanner(System.in);
		int guess;
		while(x==1){
			int z = Math.abs((randomNumbers.nextInt()%1000)+1);
			System.out.println(z);
			y=1;
			while(y==1){
				guess = userInput.nextInt();
				if(guess==z){
					System.out.print("Congratulations. You guessed the number!\n");
					w=1;
					while(w==1){	
						System.out.print("Play Again? [Y?N] \n");
						String choice = userInput.nextLine();
						if(choice.equals("Y") || choice.equals("y") || choice.equals("Yes") || choice.equals("yes") || choice.equals("YES")){
							w=0;
							y=0;
							x=1;
						}
					//	else if(choice.equals("N") || choice.equals("n") || choice.equals("No") || choice.equals("no") || choice.equals("NO")){
					//		w=0;
					//		y=0;
					//		x=0;
					//	}
						else{
					//		System.out.println("Invalid Input!");
							w=0;
							y=0;
							x=0;
						}
					}
				}
				else if(guess>z){
					System.out.print("Too high. Try again.\n");
				}
				else{
					System.out.print("Too low. Try again.\n");
				}
			}			
		}
	}
}
