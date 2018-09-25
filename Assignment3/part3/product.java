import java.util.*;

public class product{
	public static void main(String[] args){
		System.out.println(args[0]);
		System.out.println("(1, 2, 3, 4): \t" + product(1,2,3,4));
		System.out.println("(2, 3, 4): \t" + product(2,3,4));
		System.out.println("(3, 4, 7, 100): " + product(3,4,7,100));

	}
	public static int product(int ... numbers){
		int finalProduct=1;
		for(int i = 0; i<numbers.length; i++){
			finalProduct*=numbers[i];
		}
		return finalProduct;
	}

}
