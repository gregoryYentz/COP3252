public class test extends DateAndTime{
	public static void main(String[] args){
		DateAndTime now = new DateAndTime(12,31,2018,23,30,58);

		for(int i = 0; i<100000; i++){
			now.tick();
			System.out.println(now.toString());
			System.out.println(now.toUniversalString());
		}







	}

}
