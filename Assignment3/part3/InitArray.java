import java.util.*;

public class InitArray{
	public static void main(String[] args){
		int x;
		if(args.length==0){
			x = 10;
		}
		else{
			x = Integer.parseInt(args[0]);
		}
		int[] array = new int[x];
		
		System.out.printf("%s%8s%n", "Index", "Value");
		
		for(int counter = 0; counter < array.length; counter++){
			System.out.printf("%5d%8d%n", counter, array[counter]);
		}

	}
}
