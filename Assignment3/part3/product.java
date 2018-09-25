import java.util.*;

public class product{
	public static void main(String[] args){
		Scanner userInput = new Scanner(System.in);
		int x;
		if(args.length==0){
			x=10;
		}
		else{
			x=Integer.parseInt(args[0]);
		}
		System.out.print("Enter " + x + " integers: ");
		int y[] = new int[x];
		for(int i = 0; i<x; i++){
			y[i] = userInput.nextInt();
		}
		System.out.println();
		System.out.println("Product: " + product(y));
	}

	public static int product(int[] numbers){
		int result=1;
		for(int i = 0; i<numbers.length; i++){
			result*=numbers[i];
		}
		return result;
	}
}
