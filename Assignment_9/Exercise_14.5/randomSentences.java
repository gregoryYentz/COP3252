import java.util.*;
import java.security.SecureRandom;
import java.lang.*;

public class randomSentences {
	private static final SecureRandom randomNumbers = new SecureRandom();

	

	public static void main(String[] args){
		String[] article = {"the", "a", "one", "some", "any"};
		String[] noun = {"boy", "girl", "dog", "town", "car"};
		String[] verb = {"drove", "jumped", "ran", "walked", "skipped"};
		String[] preposition = {"to", "from", "over", "under", "on"};

		StringBuilder str = new StringBuilder();

		for(int i = 0; i < 20; i++){
			int x = Math.abs(randomNumbers.nextInt()%5);
			str = new StringBuilder(article[x].substring(0, 1).toUpperCase() + article[x].substring(1));
			str.append(" ");
			str.append(noun[Math.abs(randomNumbers.nextInt()%5)]);
			str.append(" ");
			str.append(verb[Math.abs(randomNumbers.nextInt()%5)]);
			str.append(" ");
			str.append(preposition[Math.abs(randomNumbers.nextInt()%5)]);
			str.append(" ");
			str.append(article[Math.abs(randomNumbers.nextInt()%5)]);
			str.append(" ");
			str.append(noun[Math.abs(randomNumbers.nextInt()%5)]);
			str.append(".");
			System.out.println(str);



			/*
			System.out.printf("%s %s %s %s %s %s.%n",
				article[x].substring(0, 1).toUpperCase() + article[x].substring(1), 
				noun[Math.abs(randomNumbers.nextInt()%5)], 
				verb[Math.abs(randomNumbers.nextInt()%5)], 
				preposition[Math.abs(randomNumbers.nextInt()%5)], 
				article[Math.abs(randomNumbers.nextInt()%5)], 
				noun[Math.abs(randomNumbers.nextInt()%5)]);
			*/

		}	


	}







}
