import java.util.*;

public class array{
	public static void main(String args[]){	
		int[] c = new int[12];
		for(int i = 0; i<12; i++){
			c[i]=i*2;
			System.out.print(c[i] + "\n");
		}
		c[0]++;
		System.out.println(c[0]);
	}
}
