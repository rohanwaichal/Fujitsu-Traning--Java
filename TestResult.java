import java.util.Scanner;

public class TestResult {
	static int []marks=new int[2];
	public static void main(String[] args) {
		
		int i;
		Scanner s=new Scanner(System.in);
		for(i=0;i<marks.length;i++)
		{
			System.out.println("Enter the marks=");
			marks[i]=s.nextInt();
			System.out.println(getResult(marks[i]));
		}
	}
	private static String getResult(int n){
		String result="";
		for(int i=0;i<marks.length;i++)
		{
			if(marks[i]>=50){
				result="Passed";
			}else{
				result="Failed";
			}
		}
		return result;
	}

}
