
public class TestResultEasy {

	public static void main(String[] args) {
		int marks1=45;
		int marks2=55;
		getResult(marks1);
		getResult(marks2);
	}
	private static void getResult(int mark){
		if(mark>=50){
			System.out.println("Passed");
		}else{
			System.out.println("Failed...");
		}
	}

}
