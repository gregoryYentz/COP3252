import java.security.SecureRandom;

public class random{
	private static final SecureRandom randomNumbers = new SecureRandom();

	public static void main(String[] args){
		for(int x = 1; x < 11; x++){
			int y = randomNumbers.nextInt()%10;
			System.out.println(x+": "+y);
		}
	}


}
