import java.util.*;
import java.security.SecureRandom;
public class addition{
	public static void main(String args[]){
		int array[][] = new int[6][4];
		SecureRandom rand = new SecureRandom();
		for(int i = 0; i<5; i++){
			for(int j = 0; j<3; j++){
				array[i][j] = rand.nextInt(10);
				array[i][3]+=array[i][j];
				array[5][j]+=array[i][j];
			}
		}	
		for(int i = 0; i<6; i++){
			for(int j = 0; j<4; j++){
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
			System.out.println();
		}
	}
}
