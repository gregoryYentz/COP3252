public class FileMatchTest{
	public static void main(String[] args){
		FileMatch application = new FileMatch();

		application.openFiles();
		application.processFiles();
		application.closeFiles();
	}
}