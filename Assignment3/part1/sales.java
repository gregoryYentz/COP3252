import java.util.*;

public class sales{
	public static void main(String[] args){
		int[] salesArray = {5000,7000,5500,10500,2000,4000,4500,8000,11000,6000};
		int[] range = new int[9];
		for(int i = 0; i<10; i++){
			salesArray[i]*=.09;
			salesArray[i]+=200;
			if(salesArray[i]>=1000){
				range[8]++;
			}
			else if(salesArray[i]>=900){
				range[7]++;
			}
			else if(salesArray[i]>=800){
				range[6]++;
			}
			else if(salesArray[i]>=700){
				range[5]++;
			}
			else if(salesArray[i]>=600){
				range[4]++;
			}
			else if(salesArray[i]>=500){
				range[3]++;
			}
			else if(salesArray[i]>=400){
				range[2]++;
			}
			else if(salesArray[i]>=300){
				range[1]++;
			}
			else{
				range[0]++;
			}
		}
		for(int i = 0; i<8; i++){
			System.out.print("$" + ((i*100)+200) + "-" + ((i*100)+299) + ": ");
/*			for(int j = 0; j<range[i]; j++){
				System.out.print("*");
			} */
			System.out.println(range[i]);
		}
		System.out.print("$1000 + : ");
/*		for(int i = 0; i<range[8]; i++){
			System.out.print("*");
		} */
		System.out.println(range[8]);
	}
}
