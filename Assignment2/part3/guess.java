import java.security.SecureRandom;
import java.util.Scanner;
import java.lang.Math;

public class guess{
	private static final SecureRandom randomNumbers = new SecureRandom();
	
	public static void main(String[] args){
		int x = 1;
		int y = 1;
		Scanner userInput = new Scanner(System.in);
		int guess;
		while(x==1){
			System.out.println("Guess a number between 1 and 1000");
			int z = Math.abs((randomNumbers.nextInt()%1000)+1);
			System.out.println(z);
			y=1;
			while(y==1){
				guess = userInput.nextInt();
				userInput.nextLine();
				if(guess==z){
					System.out.print("Congratulations. You guessed the number!\n");
					while(true){	
						System.out.print("Play Again? [Y/N] ");
						String choice = userInput.nextLine();						
						if(choice.equals("Y") || choice.equals("y") || choice.equals("Yes") || choice.equals("yes") || choice.equals("YES")){
							y=0;
							x=1;
							break;
						}
						else if(choice.equals("N") || choice.equals("n") || choice.equals("No") || choice.equals("no") || choice.equals("NO")){
							y=0;
							x=0;
							break;
						}
						else{
							System.out.println("Invalid Input!");
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
